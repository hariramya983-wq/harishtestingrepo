package methods;

public class methodm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//return type using int,double and float 
		
		System.out.println("Addtion of 2 numbers is : " + methodm2.add() );
		System.out.println("Subtraction of 2 numbers is : "+methodm2.sub() );
		System.out.println("Multiplication of 2 numbers is : "+methodm2.mul() );
	}
	
	public static int add()
	{
		int a =25;
		int b =30;
		return a+b;
	}
	public static double sub()
	{
		double a =30.34;
		double b =30.67;
		return a-b;
	}
	public static float mul()
	{
		float a =12f;
		float b =13f;
		return a*b;
	}

	
}
