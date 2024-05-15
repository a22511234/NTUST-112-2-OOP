package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 使用 ArrayList(一種List的結構) 作為 學生列表的儲存架構
		// ArrayList 不用像是陣列(Array) 一樣先設定幾個
		List<Student> studentList = new ArrayList<Student>();

		while (true) {
			// 顯示選單，要求輸入選項
			System.out.println("========== Students ==========");
			System.out.printf("%2d\t%s\n", 1, "顯示學生列表");
			System.out.printf("%2d\t%s\n", 2, "加入新學生");
			System.out.printf("%2d\t%s\n", 3, "移除學生");
			System.out.printf("%2d\t%s\n", 4, "清空學生列表");
			System.out.printf("%2d\t%s\n", 0, "結束程式");
			System.out.println("==============================");
			System.out.print("請輸入選項(1,2,3,4,0)：");
			String input_option = scanner.next();

			switch (input_option) {
			case "1":
				// 顯示學生列表
				System.out.println("[ 學生列表 ]");

				// 要抓取 ArrayList 的長度使用「arraylist.size()」
				if (studentList.size() <= 0) {
					// 若沒有儲存學生，顯示「無學生資料」的訊息
					System.out.println("\t目前無資料...\n");
					break;
				}

				// 使用回圈抓出所有在 ArrayList 中的所有 Student
				// 要抓取 ArrayList 的長度使用「arraylist.size()」
				for (int i = 0; i < studentList.size(); i++) {
					// 使用「arraylist.get( i )」呼叫第 ｉ 個 Student
					// 呼叫抓出來的第 i 個 Student 中的 getStudent() 方法回傳顯示資訊
					// 加上 流水編號 與 換行符號
					System.out.printf("%2d\t%s\n", (i + 1), studentList.get(i));
				}

				// 空白行
				System.out.println();
				break;
			case "2":
				// 加入新學生

				// 要求輸入學生姓名
				System.out.print("請輸入學生姓名：");
				String input_student = scanner.next();

				// 用輸入的姓名產生一個新的 Student 物件
				// 由於建構子需要姓名，因此將輸入的姓名傳入
				Student newStudent = new Student(input_student);

				// 將新產生的 newStudent 加入到 list 中
				// Java 會將 add 的東西放到 list 的最後一個
				studentList.add(newStudent);

				// 空白行
				System.out.println();
				break;
			case "3":
				// 移除指定學生

				if (studentList.size() <= 0) {
					// 若沒有儲存學生，顯示「無學生資料」的訊息
					System.out.println("\t目前無資料...\n");
					break;
				}

				// 先顯示列表以供挑選
				for (int i = 0; i < studentList.size(); i++) {
					System.out.printf("%2d\t%s\n", (i + 1), studentList.get(i));
				}

				// 要求輸入學生編號
				System.out.print("請輸入學生編號 (數字)：");
				int input_index = scanner.nextInt();
				input_index--; // 由於使用者看到的是 +1 後的編號，這邊需 -1 給系統使用

				// 判斷 index 有沒有超出範圍
				// studentList.size() 是個數，代表 編號 (index) 的最後一號應該是 size() -1
				// 0 已經是第一個編號了，不可能比他更小
				if (input_index >= studentList.size() || input_index < 0) {
					// 顯示「超出範圍」的訊息
					System.out.println("[Error] 代號錯誤，請重新操作！\n");
				} else {

					// 移除List中 第i個 student
					studentList.remove(input_index);

					// 顯示「操作成功」的訊息
					System.out.println("[Success] 刪除成功！\n");
				}

				break;
			case "4":
				// 清除所有 List 中的 Student

				// 清空List
				studentList.clear();

				// 顯示「操作成功」的訊息
				System.out.println("[Success] 清除成功！\n");
				break;
			case "0":
				// 離開前的問候語
				System.out.println("～～ 感謝使用 ～～\n");
				return;
			default:
				// 顯示錯誤訊息
				System.out.println("[Error] 沒有這個選項！");
				break;
			}
		}
	}
}
