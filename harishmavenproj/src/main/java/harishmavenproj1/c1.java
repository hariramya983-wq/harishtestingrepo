package harishmavenproj1;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.mycontactform.com");

	}

}
