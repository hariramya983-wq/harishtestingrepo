package seleniummouse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class datepickerex {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://jqueryui.com/datepicker/");
				
				Actions ac =new Actions(ob);
				//WebElement : present inside the frame
						//switch your control to that frame
						//id.name,index	
				ob.switchTo().frame(0);
				ob.findElementById("datepicker").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(4) > a").click();
				

	}

}
