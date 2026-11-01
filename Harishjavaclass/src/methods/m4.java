package methods;

public class m4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parameter Variable Passed to a function	definition
		//number of parameters == no of arguments
		m4.details("Harish", 38);
		m4.details("Karthick", 9);
		m4.details("Ramya", 36);
System.out.println("Addition of 2 numbers " + m4.add(15, 15));
System.out.println("Subtraction of 2 numbers " + m4.sub(15.2, 13.3));
System.out.println("Multiplication of 2 numbers " + m4.mul(1.5f, 1.5f));
	}
	
	public static void details (String name , int age)
	{
System.out.println("Student Name is  " + name);
System.out.println("Student age is  " + age);
}
	public static int add (int a ,int b)
	{
		return a+b;
	}
	public static double sub (double a ,double b)
	{
		return a-b;
	}
	public static float mul (float a ,float b)
	{
		return a*b;
	}
}