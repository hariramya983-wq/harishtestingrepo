package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropby {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://jqueryui.com/slider/");
		
		
		Actions ac =new Actions(ob);
		//WebElement : present inside the frame
				//switch your control to that frame
				//id.name,index	
		ob.switchTo().frame(0);
		WebElement e1 = ob.findElementById("slider");
		ac.dragAndDropBy(e1,50, 0).build().perform();
		Thread.sleep(3000);

	}

}
