package testingattributes;

import org.testng.annotations.Test;

public class a1 {

	/*testng: testing framework
	 * automatic report generation
	 * parallel execution
	 * suite execution
	 * grouping
	 * annotations
	 * assertions
	 * inspired from junit 
	 * 
	 * test case 
	 *   
	 *   nonstatic
	 *   @Test
	 *   default: alphabetical order 
	 * */
	
	//Priority : run the testcase in a particular order
	//description
	//groups
	//invocationCount
	//enabled=false
	//timeout
	
	@Test(priority = 0,description = "first",groups = "a",invocationCount = 5)
	public void t()
	{
		System.out.println("test case 1");
	}
	@Test(priority = 0,groups = "b",enabled = false)
	public void ab()
	{
		System.out.println("test case 2");
	}
	@Test(priority = 0,description = "last",groups = "a",timeOut = 3000)
	public void t2()
	{
		System.out.println("test case 3");
	}
	
}
