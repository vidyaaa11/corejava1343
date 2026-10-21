package com.cao;

public class Mainbank {

	public static void main(String[] args) {

		Bank b1 = new Bank();

		b1.accountNo = 101;
		b1.accountHolderName = "Priya";
		b1.bankName = "SBI";
		b1.branchName = "Pune";
		b1.accountType = "Savings";
		b1.balance = 25000;
		b1.mobileNo = 9876543210L;
		b1.email = "priya@gmail.com";
		b1.address = "Pune";
		b1.ifscCode = "SBIN0001234";
		b1.age = 25;
		b1.nomineeName = "priya2";

		b1.display();

	}

}
