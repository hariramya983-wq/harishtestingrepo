package inheritance;

public class child extends ps{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c =new child();
c.cn();
//child is having full control on parent
child.pss();
c.pn();
	}
	public static void cs()
	{
		System.out.println("Child class static menthod");
	}
	public static void cn()
	{
		System.out.println("Child class nonstatic menthod");
	}


}
