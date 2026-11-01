package sp;

public class child extends parent {
	int age =20;
	public static void main(String[] args) {
		
child c =new child();
c.display();
	}
public void display()
{
	System.out.println(super.age);
	System.out.println(age);
	}
}
