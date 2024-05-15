package Machine;

import Interface.Greeting;
import Interface.Payment;

public class CakeMachine extends VendingMachine implements Greeting, Payment {

    public CakeMachine() {
        super.title = "蛋糕販賣機";
        super.goods = new Good[] {
            new Good(65, "抹茶千層"),
            new Good(120, "草莓生乳捲"),
            new Good(80, "重乳酪蛋糕"),
        };
    }

    @Override
    public void greet() {
        System.out.println(fixedWord + "快來吃蛋糕喔~~");
    }

    @Override
    public String getPaymentType() {
        return "本店僅接受信用卡付款";
    }
}
