package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 
{
	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		
		ob.manage().window().maximize();
		ob.navigate().refresh();
		
		//hold the page
		Thread.sleep(3000);
		
		//title
		System.out.println(ob.getTitle());
		
		//Current URL
		System.out.println(ob.getCurrentUrl());
		
		//size : diemension : Height and width of the window
		System.out.println(ob.manage().window().getSize());
		
		//size : Position : X and Y Value of the window
		System.out.println(ob.manage().window().getPosition());
		
		//Browerdetails
		System.out.println(ob.getCapabilities());
		
		ob.quit();
	}
	
	

}
