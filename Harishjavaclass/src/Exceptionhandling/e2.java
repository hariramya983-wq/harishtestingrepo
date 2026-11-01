package Exceptionhandling;

public class e2 {

	
		public static void main(String[] args) {
			try
			{
				//System.out.println(4/0);
				String n="hi";
				System.out.println(n.charAt(9));
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException");
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Out of bound");
			}
			catch(Exception e)
			{
				System.out.println("error is :  + e");
			}
			finally
			{
				System.out.println("always");
			}
		}
	}


