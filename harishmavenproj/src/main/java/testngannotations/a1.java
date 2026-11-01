package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	/*
	 * before test:  run only once before all the test cases started its execution
	 * after test:  run only once after all the test cases finished its execution
	 * 
	 * before class: run once after before test
	 * after class:  run once before after test
	 * 
	 * before method: run before each test case
	 * aftermethod: run after each test case
	 * 
	 * before test
	 *     before class
	 *        beforemethod  tc1   afteremthod
	 *        beforemethod  tc2   aftermethod
	 *     after class
	 *after test 
	 * 
	 * 
	 * 
	 * */
ChromeDriver ob;
@BeforeTest
public void bt()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.mycontactform.com");
}
@AfterTest
public void at()
{
ob.quit();
}
@BeforeClass
public void bct()
{
	ob.manage().window().maximize();
}
@AfterClass
public void aqt()
{
	System.out.println(ob.getCurrentUrl());
}
@BeforeMethod
public void btm()
{
	ob.navigate().refresh();
}
@AfterMethod
public void atm()
{
	ob.manage().deleteAllCookies();
}
@Test(priority=0)
public void t1()
{
	System.out.println(ob.getTitle());
}
@Test(priority=1)
public void t2()
{
	ob.findElementByLinkText("Help");
}
	}

