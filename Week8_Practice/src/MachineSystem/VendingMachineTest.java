package MachineSystem;

import Machine.CakeMachine;
import Machine.DrinkMachine;
import Machine.NoodleMachine;
import Machine.VendingMachine;

public class VendingMachineTest {

    public static void main(String[] args) {
	    VendingMachine[] machines = new VendingMachine[3];
	    machines[0] = new NoodleMachine();
        machines[1] = new DrinkMachine();
//        machines[2] = new VendingMachine();
        CakeMachine cakeMachine = new CakeMachine();

        // 多型 - 泡麵販賣機
        System.out.println("=============== " + machines[0].getTitle() + " ===============");
        System.out.println("販賣機類型：" + machines[0].getTitle());
        System.out.println("販賣商品清單：");
        machines[0].showGoods();
        machines[0].greet();
        System.out.println("付款方式：" + machines[0].getPaymentType());
        System.out.println("========================================");
        System.out.println();

        // 多型 - 飲料販賣機
        System.out.println("=============== " + machines[1].getTitle() + " ===============");
        System.out.println("販賣機類型：" + machines[1].getTitle());
        System.out.println("販賣商品清單：");
        machines[1].showGoods();
        machines[1].greet();
        System.out.println("付款方式：" + machines[1].getPaymentType());
        System.out.println("========================================");
        System.out.println();

        // 蛋糕販賣機
        System.out.println("=============== " + cakeMachine.getTitle() + " ===============");
        System.out.println("販賣機類型：" + cakeMachine.getTitle());
        System.out.println("販賣商品清單：");
        cakeMachine.showGoods();
        cakeMachine.greet();
        System.out.println("付款方式：" + cakeMachine.getPaymentType());
        System.out.println("========================================");
    }
}
