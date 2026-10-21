package com.cao;

public class Bank {

	int accountNo;
	String accountHolderName;
	String bankName;
	String branchName;
	String accountType;
	double balance;
	long mobileNo;
	String email;
	String address;
	String ifscCode;
	int age;
	String nomineeName;

	public void deposit() {
		System.out.println("Amount deposited");
	}

	public void withdraw() {
		System.out.println("Amount withdraw");
	}

	public void checkbalance() {
		System.out.println("Balance Checked");
	}

	public void transfermoney() {
		System.out.println("Money Transfer");
	}

	public void display() {
		System.out.println("Account No -->" + accountNo);
		System.out.println("Account Holder Name -->" + accountHolderName);
		System.out.println("Bank Name --> " + bankName);
		System.out.println("Branch Name --> " + branchName);
		System.out.println("Account Type --> " + accountType);
		System.out.println("Balance --> " + balance);
		System.out.println("Mobile No --> " + mobileNo);
		System.out.println("Email --> " + email);
		System.out.println("Address --> " + address);
		System.out.println("IFSC Code --> " + ifscCode);
		System.out.println("Age --> " + age);
		System.out.println("Nominee Name --> " + nomineeName);

		System.out.println("-------------------------");
		deposit();
		withdraw();
		checkbalance();
		transfermoney();
	}

}
