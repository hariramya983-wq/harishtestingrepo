package Overloading;

public class overlodingnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//non static
		overlodingnonstatic ob = new overlodingnonstatic();
		ob.area();
		ob.area(5);
		ob.area(6.7);
		ob.area(3, 5.5);
		ob.area(3.4, 3);
	}

	public void area()
	{
		System.out.println("area");
	}
	public void area(int s)
	{
		System.out.println("area of square " + s*s);
	}
	public void area(double r)
	{
		System.out.println("area of circle " +3.14*r*r);
	}
	public void area(int s ,double b)
	{
		System.out.println("area of rectangle " +s*b);
	}
	public void area(double b, int s)
	{
		System.out.println("area of triangle " +0.5*b*s);
	}
}
