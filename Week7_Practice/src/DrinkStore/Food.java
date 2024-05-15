package DrinkStore;

public class Food extends Goods {

    // Food 可以多存 remark
    private String remark = "";

    // Food 的建構子
    // super 可以呼叫 Goods(String name, int price) 的方法，存 name, price
    // Food 還需要多存 remark
    public Food(String name, int price, String remark) {
        super(name, price);
        this.remark = remark;
    }

    // 設定私有變數「remark」
    public void setRemark(String remark) {
        this.remark = remark;
    }

    // 取得私有變數「remark」
    public String getRemark() {
        return remark;
    }

    // 顯示「name＋price+remark」
    // 因為繼承了 Goods ，也可以使用 「getName()」、「getPrice()」方法
    public String getNameAndPrice() {
        return String.format("\t%-10s\tNT. %5d\t%s", super.getName(), getPrice(), remark);
    }
}
