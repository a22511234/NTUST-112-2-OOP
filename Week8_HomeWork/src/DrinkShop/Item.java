package DrinkShop;

public class Item {
	private Drink drink;
	private int quantity;
	private Ice ice;
	private Sugar sugar;

	public Item(Drink drink, int quantity, Ice ice, Sugar sugar) {
		this.drink = drink;
		this.quantity = quantity;
		this.ice = ice;
		this.sugar = sugar;
	}

	public Item() {
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setIce(Ice ice) {
		this.ice = ice;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	public String getName() {
		return drink.getName();
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return drink.getPrice();
	}

	public int getTotalPrice() {
		return drink.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return String.format("%-4s\t\t%-3s\t\t%-3s\t\t%3s\t\t$%2s\t\t$%2s\n", getName(), ice.getDescription(),
				sugar.getDescription(), quantity, getPrice(), getTotalPrice());
	}

//	    說明：https://medium.com/joe-tsai/equals-hashcode-4480f4580be4
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Item item = (Item) o;
		return drink == item.drink && ice == item.ice && sugar == item.sugar;
	}

	
}
