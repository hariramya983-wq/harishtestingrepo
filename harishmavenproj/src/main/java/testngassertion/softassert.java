package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert s=new SoftAssert();
		s.assertEquals(ob.getTitle(), "Googlerr");
		s.assertNotEquals(ob.getTitle(), "Googlexsd");
		WebElement ele = ob.findElementByLinkText("Images");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
s.assertAll();
}}
