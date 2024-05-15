package DrinkShop;

public class Drink {
	private int price;
	private String name;

	Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
