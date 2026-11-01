package Overloading;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		O1.area();
		O1.area(3);
		O1.area(3.4);
		O1.area(3, 5.5);
		O1.area(3.5, 3);
	}

	public static void area()
	{
		System.out.println("area");
	}
	public static void area(int s)
	{
		System.out.println("area of square " + s*s);
	}
	public static void area(double r)
	{
		System.out.println("area of circle " +3.14*r*r);
	}
	public static void area(int s ,double b)
	{
		System.out.println("area of rectangle " +s*b);
	}
	public static void area(double b, int s)
	{
		System.out.println("area of triangle " +0.5*b*s);
	}
}
