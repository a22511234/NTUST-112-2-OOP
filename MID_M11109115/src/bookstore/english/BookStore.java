package bookstore.english;

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
			System.out.printf("\n%-3s\t%-10s\t%-15s\t%5s\t%8s\t%5s\n", "#", "BookName", "Publisher", "Pages", "Price", "Quantity");
			for (int i = 0; i < books.size(); i++) {
				System.out.printf("%-3s\t%s\n", (i + 1), books.get(i).getBook());
			}
		} else {
			System.out.println("[Operation Error] Please purchase first!\n");
		}
	}

	public void purchase() {
		System.out.print("Please enter the quantity of purchased books:");
		int index = input.nextInt();
		for (int i = 1; i <= index; i++) {
			System.out.print("Please enter no." + i + " book information：\n");
			System.out.print("BookName：");
			String bookname = input.next();
			System.out.print("Publisher：");
			String publisher = input.next();
			int page, price, count;
			do {
				System.out.print("Pages：(numeric)");
				page = input.nextInt();
				if (page <= 0)
					System.out.print("[Operation Error] Page number must be greater than 0. Please check again!\n");
			} while (page <= 0);
			do {
				System.out.print("Price：(numeric)");
				price = input.nextInt();
				if (price <= 0)
					System.out.print("[Operation Error] Price  must be greater than 0. Please check again!\n");
			} while (price <= 0);
			do {
				System.out.print("Quantity：(numeric)");
				count = input.nextInt();
				if (count <= 0)
					System.out.print("[Operation Error] Quantity must be greater than 0. Please check again!\n");
			} while (count <= 0);
			Book temp = new Book();
			temp.setBook(bookname, publisher, page, price, count);
			if (checkReapet(temp))
				i--;
			else
				books.add(temp);

		}
		System.out.println("[Operation Success] Successful!");
	}

	public void sale() {
		showBooks();
		int index, count;
		do {
			System.out.print("Please enter the book code:");
			index = input.nextInt() - 1;
			if (index < 0)
				System.out.print("[Operation Error] Option is not in the list. Please check again!");
		} while (index < 0);
		Book temp = books.get(index);
		do {
			System.out.print("Please enter the purchase quantity:");
			count = input.nextInt();
			if (count <= 0 || temp.getCount() < count)
				System.out.print("[Operation Error] Insufficient or incorrect quantity of books. Please check again!");
		} while (index < 0);
		profit += temp.getPrice() * count;
		temp.setCount(temp.getCount() - count);
		System.out.printf("Sold "+temp.getName()+" "+count+" copies，The sales amount is：＄"+temp.getPrice() * count+",The remaining amount "+temp.getCount()+" copies，Current total sales amount＄"+profit+"\n");
		if (temp.getCount() == 0) {
			books.remove(temp);
		}
		

	}

	public boolean checkReapet(Book book) {
		for (Book b : books) {
			if (b.getName().equals(book.getName()) && b.getPublisher().equals(book.getPublisher())) {
				System.out.println("[Operation Error] Book has already been purchased!");
				return true;
			}
		}
		return false;
	}
}
