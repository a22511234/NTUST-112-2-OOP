package DrinkShop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Store {
	static Drink drink[] = { new Drink(35, "珍珠紅茶"), new Drink(45, "珍珠奶茶"), new Drink(60, "柳丁綠茶") };
	static Ice ice[] = { new Ice(1, "正常冰"), new Ice(2, "少冰"), new Ice(3, "去冰") };
	static Sugar sugar[] = { new Sugar(1, "正常堂"), new Sugar(2, "少糖"), new Sugar(3, "半糖"), new Sugar(4, "微糖"),
			new Sugar(5, "無糖") };
	static ArrayList<Item> cart = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.println("＊＊＊＊＊＊＊＊ 歡迎來到大台科飲料店 ＊＊＊＊＊＊＊＊");
			System.out.println("(1) 點餐\n(2) 查看購物車\n(0) 結帳並退出系統");
			System.out.print("請選擇功能 [0,1,2]：");

			String input = scanner.next();
			if (input.equals("0")) {
				break;
			}
			if (!isNumberOptionInRange(input, 0, 2))
				continue;

			int selected = Integer.parseInt(input);
			switch (selected) {
			case 1:
				Item item = new Item();
				showMenu();
				System.out.print("請選擇飲料編號：");
				input = scanner.next();

				if (!isNumberOptionInRange(input, 1, drink.length))
					continue;

				item.setDrink(drink[Integer.parseInt(input) - 1]);
				item.setIce(selectIce(scanner));
				item.setSugar(selectSugar(scanner));

				while (true) {
					System.out.print("請輸入數量：");
					input = scanner.next();

					if (!isNumberOptionInRange(input, 1))
						continue;
					item.setQuantity(Integer.parseInt(input));
					break;
				}

				Item checkItem = checkDuplicate(item);
				if (checkItem != null) {
					System.out.println("購物車中有重複品項，因此已合併至同一項目");
					checkItem.setQuantity(checkItem.getQuantity() + item.getQuantity());
				} else {
					cart.add(item);
					System.out.printf("已將 %d 杯 %s 加入購物車\n", item.getQuantity(), item.getName());
				}
				break;
			case 2:
				showCart(scanner);
				break;
			default:
				System.out.println("無此選項！！\n");
				scanner.nextLine();
			}
		}
		;
		for (Item item : cart) {
			total += item.getTotalPrice();
		}
		System.out.printf("\n\n謝謝光臨，一共是：%d 元\n", total);
	}

	private static void showMenu() {
		System.out.println("＊＊＊＊＊＊＊＊ 菜單 ＊＊＊＊＊＊＊＊");
		System.out.printf("%s\t\t%s\t\t\t%s\n", "編號", "品名", "價格");
		int index = 1;
		for (Drink drink : drink) {
			System.out.printf("%2d\t\t%-4s\t\t$%3s\n", index++, drink.getName(), drink.getPrice());
		}
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
	}

	private static void showCart(Scanner scanner) {
		int itemIndex;
		while (true) {
			System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "編號", "品名", "冰量", "甜度", "數量", "單價",
					"總價");

			for (Item item : cart) {
				if (item == null) {
					return;
				}
				System.out.print((cart.indexOf(item) + 1) + "\t\t" + item);
			}

			System.out.print("\n請選擇飲料編號進行修改，輸入 0 則回到上一層: ");
			String input = scanner.next();
			if (input.equals("0")) {
				break;
			}

			if (!isNumberOptionInRange(input, 0, cart.size()))
				continue;
			itemIndex = Integer.parseInt(input);

			System.out.println("(1)編輯 (2)刪除 (0)取消動作");
			System.out.print("請選擇功能 [1,2,0]：");

			switch (scanner.next()) {
			case "1":
				editItem(itemIndex, scanner);
				break;
			case "2":
				cart.remove(itemIndex-1);
				System.out.println("已成功移除");
				break;
			case "0":
				break;
			default:
				System.out.println("請輸入範圍內號碼！");
			}
		}
	}

	private static void editItem(int index, Scanner scanner) {
		System.out.println("請選擇要變更的項目");
		System.out.println("(1)數量 (2)冰量 (3)甜度");
		System.out.print("請選擇功能 [1,2,3]：");
		switch (scanner.next()) {
		case "1":
			System.out.print("請輸入變更後的數量: ");
			String input = scanner.next();
			if (isNumberOptionInRange(input, 1)) {
				cart.get(index - 1).setQuantity(Integer.parseInt(input));
			}
			break;
		case "2":
			System.out.print("請輸入變更後的冰量: ");
			cart.get(index - 1).setIce(selectIce(scanner));
			break;
		case "3":
			System.out.print("請輸入變更後的甜度: ");
			cart.get(index - 1).setSugar(selectSugar(scanner));
			break;
		default:
			System.out.println("無此選項");
		}
		System.out.println("已成功變更！");
		Item checkItem = checkDuplicate(cart.get(index - 1));

		if (checkItem != null && cart.size() != 1) {
			System.out.println("購物車中有重複品項，因此已合併至同一項目");
			checkItem.setQuantity(checkItem.getQuantity() + cart.get(index - 1).getQuantity());
			cart.remove(index - 1);
		}
	}

	private static Ice selectIce(Scanner input) {
		while (true) {
			System.out.println("(1)正常冰 (2)少冰 (3)去冰");
			System.out.print("請選擇飲料冰量 [1,2,3]：");
			switch (input.next()) {
			case "1":
				return ice[0];
			case "2":
				return ice[1];
			case "3":
				return ice[2];
			default:
				System.out.println("請輸入範圍內號碼！");
			}
		}
	}

	private static Sugar selectSugar(Scanner input) {
		while (true) {
			System.out.println("(1)正常糖 (2)少糖 (3)半糖 (4)微糖 (5)無糖");
			System.out.print("請選擇飲料甜度 [1,2,3,4,5]：");
			switch (input.next()) {
			case "1":
				return sugar[0];
			case "2":
				return sugar[1];
			case "3":
				return sugar[2];
			case "4":
				return sugar[3];
			case "5":
				return sugar[4];
			default:
				System.out.println("請輸入範圍內號碼！");
			}
		}
	}

	public static boolean isNumberOptionInRange(String str, int min, int max) {
		boolean isNumber = Pattern.compile("^-?\\d*$").matcher(str).find();
		if (!isNumber) {
			System.out.println("僅限輸入數字！\n");
			return false;
		}
		if (Integer.parseInt(str) < min || Integer.parseInt(str) > max) {
			System.out.println("輸入錯誤！");
			return false;
		}
		return true;
	}

	public static boolean isNumberOptionInRange(String str, int min) {
		boolean isNumber = Pattern.compile("^-?\\d*$").matcher(str).find();
		if (!isNumber) {
			System.out.println("僅限輸入數字！\n");
			return false;
		}
		if (Integer.parseInt(str) < min) {
			System.out.println("\n輸入錯誤！\n");
			return false;
		}
		return true;
	}

	private static Item checkDuplicate(Item newItem) {
		for (Item item : cart) {
			if (newItem.equals(item)) {
				return item;
			}
		}
		return null;
	}
}