package seleniumexecutivescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://www.google.com");
				
				System.out.println(ob.executeScript("return document.title"));
				System.out.println(ob.executeScript("return document.URL"));
				ob.quit();
	}

}
