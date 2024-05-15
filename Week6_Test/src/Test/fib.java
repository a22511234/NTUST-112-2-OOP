package Test;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib();
	}

	public static void fib() {
		int a1 = 1;
		int a2 = 1;
		System.out.println(a1);
		System.out.println(a1);
		for (int i = 3; i <= 10; i++) {
			System.out.println(a1 + a2);
			int temp = a1 + a2;
			a1 = a2;
			a2 = temp;

		}
	}
}
