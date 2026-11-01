package Buildinclasses;

public class multipleof3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleof3no m1= new multipleof3no();
		m1.mul(10, 20, 30);
		System.out.println("my age is " + m1.age(38));
		m1.color("Black");
	}
	
	
public void  mul(int a ,int b ,int c)
{
	System.out.println("Multiplication of 3 numbers are  " + a*b*c);
}
public int age (int no )
{
	return no;
}
public void color (String colour)
{
	System.out.println("My favourite color is  " + colour);
}
}
