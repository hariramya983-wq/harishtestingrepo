package Buildinclasses;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = s.nextLine();
		System.out.println("Enter your age");
		int age =s.nextInt();
		System.out.println("Enter your height");
		double sal=s.nextDouble();
		System.out.println("Name is " + name);
		System.out.println("Age  is " + age);
		System.out.println("Height is " + sal);
	}

}
