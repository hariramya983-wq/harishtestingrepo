package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nm1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * actions class
		 * click
		 * double click
		 * right click
		 * mouse hovering
		 * click hold and release
		 * drag and drop
		 * drag and drop by
		 * 
		 * create an object for actions class
		 * pass driver instance as input 
		 * * 
		 * */
		
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.mycontactform.com");
		
		WebElement Ele = ob.findElementByName("btnSubmit");
		Actions ac =new Actions(ob);
		//ac.click(Ele).build().perform();
		//ac.doubleClick(Ele).build().perform();
		//ac.contextClick(Ele).build().perform();
	//ac.moveToElement(Ele).click().build().perform();
		ac.clickAndHold(Ele).build().perform();
		Thread.sleep(3000);
		ac.release(Ele).build().perform();
		ob.quit();
		

	}

}
