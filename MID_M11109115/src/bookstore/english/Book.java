package bookstore.english;

public class Book {
	private String name;
	private String publisher;
	private int page;
	private int price;
	private int count;

	public Book() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setBook(String name, String publisher, int page, int price, int count) {
		this.name = name;
		this.publisher = publisher;
		this.page = page;
		this.price = price;
		this.count = count;
	}

	public String getBook() {
		String bookinfo =String.format("%-10s\t%-15s\t%-2s\t%8s\t%5s", name, publisher, page, price, count);
		return bookinfo;
	}

}
