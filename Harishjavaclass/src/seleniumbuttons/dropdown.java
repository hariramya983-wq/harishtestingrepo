package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://www.letskodeit.com/practice");
				
				
				//Create an object for select class
				//pass elements as input
				//index/value/Visible text
				
				WebElement e1 = ob.findElementById("carselect");
				Select s=new Select(e1);
			//	s.selectByIndex(2);
				//s.selectByVisibleText("Honda");
				s.selectByValue("honda");
				Thread.sleep(3000);
				ob.quit();
				
	
	}

}
