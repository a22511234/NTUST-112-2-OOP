package M11109115;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input the length of the first side of the triangle (cm): ");
		double first_side = input.nextDouble();

		System.out.println("Input the length of the second side of the triangle (cm): ");
		double second_side = input.nextDouble();

		System.out.println("Input the degrees of the triangle: ");
		double degrees = input.nextDouble();
		
		int functionCode;
		double third_side;
		do {
			System.out.println("\n ************ Menu ************");
			System.out.println("1) Area \n2) Third Side \n0) Logout");
			System.out.println("******************************");
			System.out.print("Please enter a number in [0,1,2]: ");
			functionCode = input.nextInt();

			switch (functionCode) {
			case 0:
				System.out.print("Bye Bye!");
				break;
			case 1:
				third_side =  Math.sqrt(
		                Math.pow(first_side, 2) + Math.pow(second_side, 2) - 2 * first_side * second_side * Math.cos(degrees));
				
				double s = (first_side + second_side+third_side) / 2;
		        double area = Math.sqrt(s * (s - first_side) * (s - second_side) * (s -third_side));
				System.out.println("the area of the triangle is: ");
				System.out.printf("%.2f cm2", area);
				
				break;
			case 2:
				third_side =  Math.sqrt(
		                Math.pow(first_side, 2) + Math.pow(second_side, 2) - 2 * first_side * second_side * Math.cos(degrees));
				
		        System.out.println("the length of the third side of the triangle is: ");
				System.out.printf("%.2f cm \n", third_side);
				break;
			}

		} while (functionCode != 0);
 

	}

}
