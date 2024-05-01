package Week10_Practice;

public class example {

	public static void main(String[] args) {

		try {
			for (int i = 1; i < 5; i++) {
				if (i == 3)
					throw new CustomException(3);
				System.out.println("數字為：" + i);
			}
		} catch (CustomException ex) {
			System.out.println("例外說明：" + ex.getMessage());
			System.out.println("例外原因：");
			ex.printStackTrace();
		} finally {
			System.out.println("錯誤處理結束");
		}
		System.out.println("程式結束");
	}
}

class CustomException extends Exception {
	int number;

	public CustomException(int number) {
		this.number = number;
	}

	public String getMessage() {
		return ("錯誤，數字" + number + "大於2");
	}
}