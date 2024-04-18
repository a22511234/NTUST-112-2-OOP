package DrinkStore;

public class Main {

    public static void main(String[] args) {
	    Food food1 = new Food("滷肉飯", 35, "加蛋 + 10 元");
	    Drink drink1 = new Drink("麥香奶茶", 10, "統一");

        System.out.println("【屬性 - Goods】");
        System.out.println(food1.getNameAndPrice());
        System.out.println(drink1.getNameAndPrice());

        System.out.println("【屬性 - Food】");
        System.out.println(food1.getNameAndPrice());
        System.out.println(food1.getNameAndPrice());

        System.out.println("【屬性 - Drink】");
        System.out.println(drink1.getNameAndPriceAndCompany());
    }
}
