package DrinkShop;

public class Ice {
	private int level;
	private String description;

	Ice(int level, String description) {
		this.level = level;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public int getLevel() {
		return level;
	}
}
