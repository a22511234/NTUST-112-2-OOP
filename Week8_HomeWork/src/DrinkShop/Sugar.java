package DrinkShop;

public class Sugar {
	private int level;
	private String description;

	Sugar(int level, String description) {
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
