package seleniumlocotors;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("http://www.google.com");
				
				//LinkText : Word/Group of word /redirected to new URL
				//Partial Linktext : Substring of LinkText
				
			//	ob.findElementByLinkText("Images").click();
				ob.findElementByPartialLinkText("Im").click();
	}

}
