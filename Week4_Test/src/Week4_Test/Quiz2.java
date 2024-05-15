package Week4_Test;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					continue;
				System.out.print(i);
				if (j % 3 != 1)
					System.out.print("-");
			}
			System.out.print("\n");
		}

	}

}
