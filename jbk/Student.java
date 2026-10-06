package com.jbk;

public class Student {

	static int age = 22;
	static byte id;
	static short rollno = 11;
	static long prnno;
	static float height;
	static double fees;
	static char gender = 'F';
	static boolean is_active;
	static String name;
	static long adhar = 874185963l;
	static String pancard = "ASDF79878KJ";
	static String course = "java";
	static int courseid;

	public static void main(String[] args) {
		System.out.println("---student Information-----");
		System.out.println("Student age: " + age);
		System.out.println("Student id: " +id);
		System.out.println("Student roll number: " +rollno);
		System.out.println("Student pnr number: " +prnno);
		System.out.println("Student height: " +height);
		System.out.println("Student fees: " +fees);
		System.out.println("Student gender: " +gender);
		System.out.println("Student active or not: " +is_active);
		System.out.println("Student adhar card no: " +adhar);
		System.out.println("Student pan card no: " +pancard);
		System.out.println("Student course id: " +courseid);
		System.out.println("Student course name: " +course);
	}

}
