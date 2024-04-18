package Breakfast;

import java.util.Scanner;

public class Breakfast {
	private String[] goods_class = { "吃的", "吃的", "吃的", "吃的", "喝的", "喝的", "喝的", "送的" };
	private String[] goods_name = { "厚片吐司", "鐵板麵", "飯糰", "蔥抓餅", "奶茶", "紅茶", "玉米濃湯", "贈品" };
	private int[] goods_price = { 25, 40, 30, 35, 20, 20, 30, 0 };

	public Breakfast() {
	}

	public void showMenu() {
		System.out.println("＊＊＊＊＊＊＊＊ 歡迎光臨 ＊＊＊＊＊＊＊＊");
		System.out.printf("%s\t\t%s\t\t%s\t\t\t%s\n", "編號", "類別", "品名", "價格");
		for (int i = 0; i < goods_name.length; i++) { // 從 0 ~ goods_name 的最後一個的序號
			System.out.printf("%2d\t\t%s\t\t%s\t\t$%3s\n", (i + 1), goods_class[i], goods_name[i], goods_price[i]);
		}
		System.out.println("＊＊＊＊＊＊＊＊ ＊＊＊＊＊＊＊＊＊＊＊＊＊");
	}

	public void order() {
		Scanner scanner = new Scanner(System.in);
		int total = 0;

		System.out.println("－－－－－ 開始點餐 －－－－－");
		String input;
		while (true) { // 除非回圈內離開，不然會永遠執行
			System.out.print("請輸入代號 (輸入0離開)：");
			input = scanner.next();

			if (input.equals("0")) {
				break;
			} // 如果是 0 就離開回圈

			if (!isNumber(input)) { // 驗證是否為數字
				System.out.println("僅限輸入數字代號！！\n");
				continue;
			}

			int selected = Integer.parseInt(input);

			if (selected > goods_name.length || selected <= 0) { // 判斷是否在 1 ~ goods_name最後一個之間
				System.out.println("無此選項！！\n");
				continue;
			}

			System.out.println("已將加入購物車\n");
			total += goods_price[selected - 1]; // 因為選項是 陣列序列號 +1 所以這裡要 -1 才能找到對的金額

		}

		System.out.printf("\n\n謝謝光臨，一共是： %d 元\n", total);
	}

	private static boolean isNumber(String str) {
	
		if (str.charAt(0)>='0' && str.charAt(0)<='9')
			return true;
		else
			return false;
	}
}
