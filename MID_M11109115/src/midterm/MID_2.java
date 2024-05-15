package midterm;

import java.util.Scanner;

public class MID_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 讓使用者輸入一個數字n
		System.out.print("請輸入整數的個數n：");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		// 讓使用者輸入n個整數
		System.out.println("請依序輸入" + n + "個整數：");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		// 呼叫sort方法進行排序
		sort(arr);
		System.out.println("排序後的陣列（由大到小）：");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					// 交換arr[j]和arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
