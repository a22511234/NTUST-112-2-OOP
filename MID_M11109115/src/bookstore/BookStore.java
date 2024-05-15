package bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
	Scanner input = new Scanner(System.in);
	private String storename = null;
	private List<Book> books = new ArrayList<>();
	private int profit = 0;

	public BookStore(String storename) {
		this.storename = storename;
	}

	public void setStoreName(String storename) {
		this.storename = storename;
	}

	public String getStoreName() {
		return storename;
	}

	public int getProfit() {
		return profit;
	}

	public void init() {
		Book temp = new Book();
		temp.setBook("Book1", "publisher1", 100, 200, 10);
		Book temp2 = new Book();
		temp2.setBook("Book2", "publisher2", 200, 300, 9);
		Book temp3 = new Book();
		temp3.setBook("Book3", "publisher3", 300, 400, 8);
		Book temp4 = new Book();
		temp4.setBook("Book4", "publisher4", 400, 500, 7);
		Book temp5 = new Book();
		temp5.setBook("Book5", "publisher5", 500, 600, 6);
		books.add(temp);
		books.add(temp2);
		books.add(temp3);
		books.add(temp4);
		books.add(temp5);

	}

	public void showBooks() {

		if (books.size() != 0) {
			System.out.printf("%-3s\t%-10s\t%-15s\t%5s\t%8s\t%5s\n", "#", "書名", "出版社", "頁數", "金額", "數量");
			for (int i = 0; i < books.size(); i++) {
				System.out.printf("%-3s\t%s\n", (i + 1), books.get(i).getBook());
			}
		} else {
			System.out.println("[操作錯誤] 請先進貨！\n");
		}
	}

	public void purchase() {
		System.out.print("請輸入進貨書本種類數量：");
		int index = input.nextInt();
		for (int i = 1; i <= index; i++) {
			System.out.print("請輸入第" + i + "本書資訊：\n");
			System.out.print("書名：");
			String bookname = input.next();
			System.out.print("出版社：");
			String publisher = input.next();
			int page, price, count;
			do {
				System.out.print("頁數：(數字)");
				page = input.nextInt();
				if (page <= 0)
					System.out.print("[操作錯誤] 頁數需大於0，請再次檢查！\n");
			} while (page <= 0);
			do {
				System.out.print("價格：(數字)");
				price = input.nextInt();
				if (price <= 0)
					System.out.print("[操作錯誤] 價格需大於0，請再次檢查！\n");
			} while (price <= 0);
			do {
				System.out.print("數量：(數字)");
				count = input.nextInt();
				if (count <= 0)
					System.out.print("[操作錯誤] 數量需大於0，請再次檢查！\n");
			} while (count <= 0);
			Book temp = new Book();
			temp.setBook(bookname, publisher, page, price, count);
			if (checkReapet(temp))
				i--;
			else
				books.add(temp);

		}
		System.out.println("[操作成功] 進貨成功！");
	}

	public void sale() {
		showBooks();
		int index, count;
		do {
			System.out.print("請輸入書籍代碼：");
			index = input.nextInt() - 1;
			if (index < 0)
				System.out.print("[操作錯誤] 選項不在清單中，請再次檢查！");
		} while (index < 0);
		Book temp = books.get(index);
		do {
			System.out.print("請輸入購買數量：");
			count = input.nextInt();
			if (count <= 0 || temp.getCount() < count)
				System.out.print("[操作錯誤] 書籍數量不足或數量有誤，請再次檢查！");
		} while (index < 0);
		profit += temp.getPrice() * count;
		temp.setCount(temp.getCount() - count);
		System.out.printf("已售出"+temp.getName()+" "+count+"本，本次銷售金額為：＄"+temp.getPrice() * count+"元，剩餘數量"+temp.getCount()+"本，目前總銷售金額＄"+profit+"元\n");
		if (temp.getCount() == 0) {
			books.remove(temp);
		}
		

	}

	public boolean checkReapet(Book book) {
		for (Book b : books) {
			if (b.getName().equals(book.getName()) && b.getPublisher().equals(book.getPublisher())) {
				System.out.println("[操作錯誤] 已經進貨過了！");
				return true;
			}
		}
		return false;
	}
}
