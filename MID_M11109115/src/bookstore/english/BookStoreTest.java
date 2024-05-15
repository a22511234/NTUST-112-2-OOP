package bookstore.english;

import java.util.Scanner;

public class BookStoreTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the name of the bookstore:");
		String bookstorename = input.nextLine();
		BookStore bookStore = new BookStore(bookstorename);
		bookStore.init();
		while (true) {
			menu(bookStore);
			System.out.print("Please enter options:");
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
				System.out.println("The total sales amount is: ＄"+bookStore.getProfit());
				return;
			default:
				System.out.println("[Operation Error] The input option is not in the menu. Please check again！\n\n");
				break;
			}
		}
	}

	public static void menu(BookStore bookStore) {
		System.out.println("\n========== " + bookStore.getStoreName() + " ==========");
        System.out.printf("%d\t%s\n", 1, "Show bookshelf");
        System.out.printf("%d\t%s\n", 2, "Purchase");
        System.out.printf("%d\t%s\n", 3, "Sale");
        System.out.printf("%d\t%s\n", 0, "Exit");
        System.out.println("========== " + bookStore.getStoreName() + " ==========");
	}

}
