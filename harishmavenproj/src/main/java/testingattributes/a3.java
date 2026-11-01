package testingattributes;

import org.testng.annotations.Test;

public class a3 {
	
	@Test(priority=0,groups ="o")
	
	//dependOnGroup
	public void a()
	{
		System.out.println("testcase 1");
	}
	
	
	@Test(priority=1,groups ="o")
	public void b()
	{
		System.out.println("testcase 2");
	}
	
	
	@Test(priority=2,dependsOnGroups ="o")
	public void c()
	{
		System.out.println("testcase 3");
	}

}
