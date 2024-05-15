package Machine;

import Interface.Greeting;
import Interface.Payment;

public class DrinkMachine extends VendingMachine implements Greeting, Payment {

    public DrinkMachine() {
        super.title = "飲料販賣機";
        super.goods = new Good[] {
            new Good(10, "麥香奶茶"),
            new Good(25, "寶礦力水得"),
            new Good(35, "蜂蜜牛奶"),
        };
    }

    @Override
    public void greet() {
        System.out.println(fixedWord + "快來喝飲料喔~~");
    }


    @Override
    public String getPaymentType() {
        return "本店僅接受悠遊卡付款";
    }
}
