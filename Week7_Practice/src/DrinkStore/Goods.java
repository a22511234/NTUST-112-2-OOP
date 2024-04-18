package DrinkStore;

public class Goods {

    // Goods 存 name 與 price
    private String name = "";
    private int price = 0;

    // 建構式設定「品名」與「價格」
    // 有 Goods 屬性的類別都可以使用
    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 取得私有變數「name」
    // 有 Goods 屬性的類別都可以使用
    public String getName() {
        return name;
    }

    // 取得私有變數「price」
    // 有 Goods 屬性的類別都可以使用
    public int getPrice() {
        return price;
    }

    // 顯示「name＋price」
    // 有 Goods 屬性的類別都可以使用
    public String getNameAndPrice(){
        return String.format("\t%-10s\tNT. %5d", name, price);
    }
}
