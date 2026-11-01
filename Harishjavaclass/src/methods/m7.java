package methods;

public class m7
{
public static void main(String[] args) {
	// TODO Auto-generated method stub{

	m7 ob =new m7();
	ob.triangle(4, 4);
	
	System.out.println("Addition of 2 numbers is  " + ob.add(5, 6));
	System.out.println("Area of 2 numbers is  " + ob.area(1.6));
	System.out.println("Multiplication of 2 numbers is  " + ob.mul(2.5f, 2.4f));
	System.out.println(ob.wish("Good Morning"));
	System.out.println("My intital is " + ob.letter('k'));
	System.out.println("Result is " + ob.value(true));
}
public void triangle (int a , int b)
{
	System.out.println("Area of triangle is  " + 0.5*a*b);
}

public int add (int a , int b)
{
	return a+b;
}
public double area (double a)
{
	return a*a;
}

public float mul (float a , float b)
{
	return  a-b;
	}

public String wish(String s)
{
	return s;
	}

public char letter( char lt)
{
	return lt;
	}
public boolean value (boolean v)
{
	return v;
	}

}