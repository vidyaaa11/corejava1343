package com.breakndconti;

import java.util.Scanner;

public class Takeinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:- ");
		String name = sc.next();
		
		sc.nextLine();
		
     	System.out.println("Enter your FullName:- ");
		String fullname = sc.nextLine();
		
		System.out.println("Enter your Age:- ");
		int age = sc.nextInt();

		System.out.println("Your Name is :- " + name);
		System.out.println("Your Full Name is :- " + fullname);
		System.out.println("Your Age is :- " + age);

	}

}
