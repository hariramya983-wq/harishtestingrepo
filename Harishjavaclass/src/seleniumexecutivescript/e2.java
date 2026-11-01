package seleniumexecutivescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		//Greater than 100 ->Zoom Out
		//Normal == 100 
		//Less than 100 ->Zoom in
		
		ob.executeScript("document.body.style.zoom = '300%'" );
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom = '100%'" );
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom = '30%'" );
		Thread.sleep(3000);
		ob.quit();
	}

}
