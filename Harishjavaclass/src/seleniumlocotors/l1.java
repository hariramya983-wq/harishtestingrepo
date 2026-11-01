package seleniumlocotors;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("http://www.mycontactform.com");
				
				//Locators
				//id,Name,class name,linktext , Partial linktxt ,tagname,Xpath,css
				
				//Find by ID
				ob.findElementById("user").sendKeys("Dhivyakarthi123");
				
				//Find by Name
				ob.findElementByName("pass").sendKeys("12345");
				
				//Find by class name
				ob.findElementByClassName("btn_log").click();

	}

}
