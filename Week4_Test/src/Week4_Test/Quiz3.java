package Week4_Test;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 創建Scanner對象，用於讀取用戶輸入
		Scanner scanner = new Scanner(System.in);
		// 提示用戶輸入包裹重量
		System.out.print("請輸入包裹重量（磅）：");
		double weight = scanner.nextDouble();
		// 計算運費
		double shippingCost = 0;
		// 如果重量超過10磅，顯示無法運送的消息，否則顯示運費
		if (weight > 10) {
			System.out.println("包裹無法運送。");
		} else {
			if (weight > 0 && weight <= 1) {
				shippingCost = weight * 3.5;
			} else if (weight > 1 && weight <= 3) {
				shippingCost = weight * 5.5;
			} else if (weight > 3 && weight <= 10) {
				shippingCost = weight * 8.5;
			}
			System.out.println("運費為：" + shippingCost + " 元。");
		}
	}

}

