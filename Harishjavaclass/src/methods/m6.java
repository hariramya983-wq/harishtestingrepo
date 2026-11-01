package methods;

public class m6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non static means need to create space
		
m6 ob =new m6();
ob.details();
ob.area();
		System.out.println("Addition of 2 Numbers is " + ob.add());
		System.out.println("Subtraction of 2 Numbers is " + ob.sub());
		System.out.println("Multiplication of 2 Numbers is " + ob.mul());
		System.out.println(ob.wish());
		System.out.println("Intial is " + ob.initial());
		System.out.println("Result is " + ob.result());
	}
	
	public int add ()
	{
		int a =10;
		int b =20;
		return a+b;
		
	}
	
	public double sub()
	{
		double a =2.4;
		double b =1.8;
		return a-b;
	}
	
	public float mul ()
	{
		float a =1.4f;
		float b=1.5f;
		return a*b;
	}
	public String wish()
	{
		String s ="Hi";
		return s;
	}
	
	public char initial ()
	{
		char ch='H';
		return ch;
	}
	
	public boolean result()
	{
		boolean r=true;
		return r;
	}
	public void details ()
	{
	String name = "Harish";
	int age = 38 ;
	System.out.println("My name is " + name);
	System.out.println("My age is " + age);
	}
	
	private void area ()
	{
		int a =30;
		System.out.println("Are of number 30 is " + a*a);
	}
}
