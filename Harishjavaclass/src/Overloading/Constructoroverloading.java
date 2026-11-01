package Overloading;

public class Constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONSTRUCTOR OVERLOADING
		new Constructoroverloading();
		new Constructoroverloading(3);
		new Constructoroverloading(5.4);
		new Constructoroverloading (3,3.3);
		new Constructoroverloading(3.3,3);
		
	}
	public Constructoroverloading()
	{
		System.out.println("area");
	}
	public Constructoroverloading(int s)
	{
		System.out.println("area of square " + s*s);
	}
	public Constructoroverloading(double r)
	{
		System.out.println("area of circle " +3.14*r*r);
	}
	public Constructoroverloading(int s ,double b)
	{
		System.out.println("area of rectangle " +s*b);
	}
	public Constructoroverloading(double b, int s)
	{
		System.out.println("area of triangle " +0.5*b*s);
	}
}
