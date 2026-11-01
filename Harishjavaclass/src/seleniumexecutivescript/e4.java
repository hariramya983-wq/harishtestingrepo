package seleniumexecutivescript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.letskodeit.com/practice");
		//alert : popup /Message
		//ob.executeScript("alert('timeout')");
		ob.executeScript("window.confirm('timout')");
		Thread.sleep(3000);
		Alert a1 = ob.switchTo().alert();
		//a1.accept();
        a1.dismiss();
	}

}
