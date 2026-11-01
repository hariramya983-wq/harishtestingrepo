package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1
{
//Step 1  :  Adding Jar File

	public static void main(String[] args) throws InterruptedException

	{
	//Step 1 :Configuring chorme driver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
	
	//Creating object for Chrome driver
	ChromeDriver ob =new ChromeDriver();
	//setp3 : Visiting the website
	ob.get("https://www.google.com");
	
	ob.manage().window().maximize();
	ob.navigate().refresh();
	//hold the page
	Thread.sleep(3000);
	ob.quit();
	}


}
