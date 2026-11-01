package Exceptionhandling;

import Buildinclasses.scanner;
import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// create your own execution
		//through new exception	 except
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your age");
		int age =s.nextInt();
		if(age>18)
		{
			System.out.println("major");
		}
		else
		{
			throw new ArithmeticException("error : minor" );
		}
	}

}
