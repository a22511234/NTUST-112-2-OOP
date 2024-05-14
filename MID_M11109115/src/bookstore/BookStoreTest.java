package bookstore;

import java.util.Scanner;

public class BookStoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入書店名稱：");
		String bookstorename = input.nextLine();
		BookStore bookStore = new BookStore(bookstorename);
		bookStore.init();
		while (true) {
			menu(bookStore);
			System.out.print("請輸入選項：");
			int method = input.nextInt();
			switch (method) {
			case 1:
				bookStore.showBooks();
				break;
			case 2:
				bookStore.purchase();
				break;
			case 3:
				bookStore.sale();
				break;
			case 0:
				System.out.println("總銷售金額為：＄"+bookStore.getProfit());
				return;
			default:
				System.out.println("[操作錯誤] 輸入的選項不在選單中，請再次檢查！\n\n");
				break;
			}
		}
	}

	public static void menu(BookStore bookStore) {
		System.out.println("========== " + bookStore.getStoreName() + " ==========");
        System.out.printf("%d\t%s\n", 1, "顯示書架");
        System.out.printf("%d\t%s\n", 2, "進貨");
        System.out.printf("%d\t%s\n", 3, "銷貨");
        System.out.printf("%d\t%s\n", 0, "離開");
        System.out.println("========== " + bookStore.getStoreName() + " ==========");
	}

}
