package com.jbk;

public class Bank {

	static int account_Id = 101;
	static String account_Holder_Name = "Vidya Jangale";
	static long account_Number = 1234567890l;
	static String account_Type = "Savings";
	static double account_Balance = 50000;
	static String bank_Name = "State Bank of India";
	static String branch_Name = "Pune";
	static String ifsc_Code = "SBIN0001234";
	static long mobile_Number = 9529009727l;
	static String email_Id = "vidya@gmail.com";
	static String address = "Pune";
	static String city = "Pune";
	static String state = "Maharashtra";
	static String nominee_Name = "Vaibhavi Jangale";
	static String account_Status = "Active";
	static int age;
	

	public static void main(String[] args) {

		System.out.println("---- Bank Account Information ----");
		System.out.println("Account Id - " + account_Id);
		System.out.println("Account Holder Name - " + account_Holder_Name);
		System.out.println("Account Number - " + account_Number);
		System.out.println("Account Type - " + account_Type);
		System.out.println("Account Balance - " + account_Balance);
		System.out.println("Bank Name - " + bank_Name);
		System.out.println("Branch Name - " + branch_Name);
		System.out.println("IFSC Code - " + ifsc_Code);
		System.out.println("Mobile Number - " + mobile_Number);
		System.out.println("Email Id - " + email_Id);
		System.out.println("Address - " + address);
		System.out.println("City - " + city);
		System.out.println("State - " + state);
		System.out.println("Nominee Name - " + nominee_Name);
		System.out.println("Account Status - " + account_Status);
        System.out.println("Account Holder Age - " + age);
	}

}
