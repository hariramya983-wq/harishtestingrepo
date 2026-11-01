package interfac;

public interface i1 {
	/*blue print of class
	 * doesnot contain static method
	 *will have nonstatic method with default keyword
	 *will have abstract method
	 *          no abstract keyword
	 *          empty
	 *          content will be defined in the class
	 *          
	 *class<=> interface: implements 
	 * 
	 * 
	 * 
	 * */
	default public void ns()
	{
		System.out.println("nonstatic method");
	}
	public void ab();
}
