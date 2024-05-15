package Machine;

import Interface.Greeting;
import Interface.Payment;


public class NoodleMachine extends VendingMachine implements Greeting, Payment {

    public NoodleMachine() {
        super.title = "泡麵販賣機";
        super.goods = new Good[] {
            new Good(20, "維力炸醬麵"),
            new Good(35, "阿Q桶麵"),
            new Good(55, "滿漢大餐"),
        };
    }

    @Override
    public void greet() {
        System.out.println(fixedWord + "快來買泡麵喔~~");
    }

    @Override
    public String getPaymentType() {
        return "本店僅接受現金付款";
    }
}
