import org.testng.annotations.Test;

public class a2 {
	
	//dependOnMethods
	@Test(priority = 0)
	public void t()
	{
		System.out.println("test case 1");
	}
	@Test(priority = 1,dependsOnMethods =" t")
	public void u()
	{
		System.out.println("test case 2");
	}
}
