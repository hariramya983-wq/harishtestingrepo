package methods;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 age.myage();
 age.area();
 age.details("Harish", 160, "CBE");
	}
	public static void myage()
	{
	int a = 38 ;
	System.out.println("My age is "+ a);

}
	public static void area()
	{
		int b =10;
		int h =20;
		System.out.println("Area of triangle is " + (b*h)/2);
	}
	
	public static void details (String name , int height , String add)
	{
		System.out.println("my name is " + name);
		System.out.println("my height is " + height);
		System.out.println("my address is " + add);
		
	}
	
	
	}

