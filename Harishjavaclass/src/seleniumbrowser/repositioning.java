package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repositioning {
	public static void main(String[] args) {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		
		//create an object for point class
		//pass desired x and y value
		//apply it on the window
		Point pt =new Point(100,200);
		ob.manage().window().setPosition(pt);
		ob.quit();
	}
	

}
