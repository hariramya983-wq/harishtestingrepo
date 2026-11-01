package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglistner.listener.class)
public class assertion1 {
	/*testngassertion:  
	 * 
	 * Assertion:  technique where we will be comparing actual result with obtained result
	 * 
	 * hard asserts:
	 *           provided by Assert builtin class
	 *           static in nature
	 *           if assertion fails, it will not proceed further 
	 *           
	 * soft asserts:
	 *          provided by softassert builtin class
	 *          nonstatic in nature
	 *          even if assertion fails, it will proceed further
	 *          invoke assertAll at the end 
	 * 
	 * assertEqual(actual, expected)
	 * assertNotEqual(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * 
	 * */
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "Google");
		Assert.assertNotEquals(ob.getTitle(), "Googlexsd");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
