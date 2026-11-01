package Exceptionhandling;

public class e1 {


		// TODO Auto-generated method stub
/*Handling Exception
 * try catch
 * try with multiple catch
 * try catch finally
 * throws
 * throw
 * */
	public static void main(String[] args) {
		try
		{
			System.out.println(4/1);
		}
		catch (Exception e)
		{
			System.out.println("error is :  + e");
		}
		finally
		{
			System.out.println("always");
		}
	}

}
