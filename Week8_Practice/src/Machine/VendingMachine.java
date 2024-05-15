package Machine;

import Interface.Greeting;
import Interface.Payment;

public abstract class VendingMachine implements Greeting, Payment {

	String title = "販賣機";
	Good[] goods;

	public VendingMachine() {
	}

	public String getTitle() {
		return title;
	}

	public void showGoods() {
		if (goods == null || goods.length == 0) {
			System.out.println("目前沒有商品");
			return;
		}

		for (int i = 0; i < goods.length; i++) {
			System.out.printf("\t%2d\t%-8s\t$%4d\n", (i + 1), goods[i].getName(), goods[i].getPrice());
		}
	}

	@Override
	public void greet() {
	}

	@Override
	public void pay() {
		System.out.println("尚未實作");
	}

	@Override
	public String getPaymentType() {
		return null;
	}
}
