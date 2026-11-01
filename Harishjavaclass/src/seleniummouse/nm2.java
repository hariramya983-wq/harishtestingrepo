package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nm2 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://jqueryui.com/droppable/");
				
				Actions ac =new Actions(ob);
				//WebElement : present inside the frame
				//switch your control to that frame
				//id.name,index
				
				ob.switchTo().frame(0);
				
				WebElement e1 = ob.findElementById("draggable");
				WebElement e2 = ob.findElementById("droppable");
				ac.dragAndDrop(e1, e2).build().perform();
				Thread.sleep(3000);
				ob.quit();
	}

}
