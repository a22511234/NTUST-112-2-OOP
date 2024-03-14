package GradeBook;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入學生人數： "); // 要求輸入學生數
		int student = scanner.nextInt();

		System.out.print("請輸入科目數量："); // 要求輸入科目數
		int subject = scanner.nextInt();

		int gradeBook[][] = new int[student][subject];
		do {
			System.out.printf("要輸入成績的是第幾位學生（1～%d，輸入 0 離開）：", gradeBook.length);
			int studentindex = scanner.nextInt();

			if (studentindex == 0)
				break; // 離開迴圈

			System.out.printf("要輸入成績的是第幾個科目（1～%d）：", gradeBook[0].length);
			// 以 「GradeBook 的二維大小」作為範圍
			int subjectIndex= scanner.nextInt();

			System.out.print("請輸入成績："); // 要求輸入該筆成績數值
			int grade = scanner.nextInt();

			// 判斷輸入的學生/科目是否在範圍內
			if (studentindex >= 1 && studentindex <= gradeBook.length && subjectIndex >= 1 && subjectIndex <= gradeBook[0].length) {
				gradeBook[studentindex - 1][subjectIndex - 1] = grade;
				// 由於 index 是從 0 開始的，所以輸入值要 -1
			} else {
				System.out.println("無此編號的學生/科目！");
			}
			
			
			// 印出標題列
	        System.out.printf("%10s", "\t");
	        for(int i = 0; i < gradeBook[0].length; i++){
	            System.out.printf("%10s","科目 "+(i+1)+"\t"); // 由於 index 是從 0 開始的，所以輸入值要 +1
	        }
	        System.out.printf("%10s","加總\t");
	        System.out.printf("%10s","平均\n");


	        // 印出成績資料列
	        for(int i = 0; i < gradeBook.length; i++) {
	            System.out.printf("%10s\t", "學生 " + (i+1)); // 印出學生名稱 // 由於 index 是從 0 開始的，所以輸入值要 +1

	            for(int j = 0; j < gradeBook[0].length; j++) {
	                System.out.printf("%10d\t", gradeBook[i][j]); // 印出學生成績
	            }
	            int total = 0;
	            double mean = 0;
	            for(int j = 0; j < gradeBook[i].length; j++) {
	                total += gradeBook[i][j]; // 加總該學生的所有成績
	            }
	            mean= (double) total / (double) gradeBook[studentindex].length;
	            System.out.printf("%10d\t", total); // 印出加總成績
	            System.out.printf("%10.2f\t", mean); // 印出平均成績
	            System.out.println();
	        }

	        System.out.println(); // 列印空白行分隔
			
		} while (true);

	}

}
