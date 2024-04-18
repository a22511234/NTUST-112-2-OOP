package DrinkStore;

public class Drink extends Goods{

    // Drink 可以多存 company
    private String company = "";

    // Drink 的建構子
    // super 可以呼叫 Goods(String name, int price)的方法，存 name, price
    // Drink 還需要多存 company
    public Drink(String name, int price, String company) {
        super(name, price); // 使用繼承的類別的方法/建構子
        this.company = company;
    }

    // 設定私有變數「company」
    public void setCompany(String company) {
        this.company = company;
    }

    // 取得私有變數「company」
    public String getCompany() {
        return company;
    }

    // 顯示「name＋price+company」
    // 因為繼承了 Goods ，也可以使用 「getName()」、「getPrice()」方法
    public String getNameAndPriceAndCompany(){
        return String.format("\t%-10s\tNT. %5d\t%s", getName(), getPrice(), company);
    }
}
