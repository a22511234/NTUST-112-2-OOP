package midterm;

import java.util.Scanner;

public class MID_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 && i % 2 != 0) {
				System.out.println("Fizz");
			} else if (i % 2 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
