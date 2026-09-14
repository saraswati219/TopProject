package com.braindata.bankmanagement.client;


import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Rbi bank = new Sbi();

		while (true) {
			System.out.println(
					"1 for createAccount \n 2 for displayAllDetail \n 3 for depositeMoney\n 4 for withdrawal\n 5 for balanceCheck \n6 for exit ");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				bank.createAccount();
				break;

			case 2:
				bank.displayAllDetails();
				break;

			case 3:
				bank.depositeMoney();
				break;

			case 4:
				bank.withdrawal();
				break;

			case 5:
				bank.balanceMoney();
				break;

			case 6:
				System.out.println("exit");
				System.exit(0);

			default:
				System.out.println("invalid choice");

			}
		}

	}

}

