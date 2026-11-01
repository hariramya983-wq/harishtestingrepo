package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		Thread.sleep(3000);
		ob.findElementByLinkText("Images").click();
		Thread.sleep(3000);
		ob.navigate().back();
		Thread.sleep(3000);
		ob.navigate().forward();
	

	}

}
