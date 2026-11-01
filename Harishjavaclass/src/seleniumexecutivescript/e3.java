package seleniumexecutivescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://www.letskodeit.com/practice");
				
				//Page down
				//ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				//Thread.sleep(3000);
				
				//ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				//Thread.sleep(3000);
				
				ob.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);
				
				ob.executeScript("window.scrollBy(0,-400)");
				Thread.sleep(3000);
	}

}
