package Buildinclasses;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
s1  ob =new s1();
ob.cal(10, 22);
System.out.println("Balance is " + ob.bal(35, 15));
System.out.println(ob.db(10.3, 3.7));
System.out.println(ob.fl(1.0f, 2.0f)); 
System.out.println(ob.b1(true));
{
	
}
	}
	
	public void cal (int a , int b)
	{
		System.out.println("Calculation of 2 numbers is " + (a+b));
	}
	
	public int bal (int c ,int d)
	{
		return c-d;
	}
	public double db (double e , double f)
	{
		return e*f;
	}
	public float fl (float f1f , float f2f)
	{
		return f1f*f2f;
	}
	public boolean b1 (boolean bb)
	{
		return bb;
	}

}
