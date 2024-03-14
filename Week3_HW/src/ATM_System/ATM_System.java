package ATM_System;

import java.util.Scanner;

public class ATM_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter initial balance");
		int balance = input.nextInt();
		int functionCode;
		do {
			System.out.println("\n ************ Menu ************");
			System.out.println("1) Deposit\n2) Withdraw\n3) Show balance \n0) Logout");
			System.out.println("******************************");
			System.out.print("Please enter a number in [0,1,2,3]: ");
			functionCode = input.nextInt();

			switch (functionCode) {
			case 0:
				System.out.print("Bye Bye!");
				break;
			case 1:
				System.out.print("Please Enter the amount you want to deposit: ");
				int deposit = input.nextInt();
				balance+=deposit;
				break;
			case 2:
				System.out.print("Please Enter the amount you want to withdraw: ");
				int withdraw = input.nextInt();
				if (withdraw>balance){
					System.out.print("You don't have enough money");
				}
				else {
					balance-=withdraw;
				}
				break;
			case 3:
				System.out.print("Balance: "+ balance);
			}

		} while (functionCode != 0);
	}

}
