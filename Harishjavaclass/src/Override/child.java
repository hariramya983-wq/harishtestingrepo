package Override;

public class child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p =new parent();
p.area();
child c = new child();
c.area();

	}
	public void area()
	{
		int a =10;
		int b=20;
		System.out.println("area of rectangle is " + a*b);
	}
	

}
