package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizing {
	public static void main(String[] args) {
		
	
	//Step 1 :Configuring chorme driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
			
			//Creating object for Chrome driver
			ChromeDriver ob =new ChromeDriver();
			//setp3 : Visiting the website
			ob.get("https://www.google.com");
			
			//size : Dimension Class : Width and Height
			Dimension d =new Dimension(400,400);
			ob.manage().window().setSize(d);
            ob.quit();
}
}