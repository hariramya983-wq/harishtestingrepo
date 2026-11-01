package methods;

public class m5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Passing string ,character and Boolean as arguments
		
		System.out.println("Fullname is " + m5.fullname("Harish", "Kumar"));
		System.out.println("My intial is " + m5.intial('H'));
		System.out.println("My result is  " + m5.result(true));
		}
public static String  fullname (String firstname , String lastname)
{
	return firstname + lastname ;
	
	}
public static char intial (char firstletter)
{
	return (firstletter ) ;

}
	
public static boolean result (boolean b)
{
	return true;
}

}
