package seleniumexampleworkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		//ob.findElementByName("q").sendKeys("cricket score");
		ob.findElementByLinkText("Gmail").click();
		a1=ob.findElementByClassName("button-label").click();
		Action a1 =New Action(ob);
		
		s.selectByIndex(0);
		//ob.findElementById("ti6dpd").sendKeys("create");
		//ob.findElementByCssSelector("body > div.plsC5e.RqyYHe > div.acUsEb.Q6KTif.KEY6ib > form > div:nth-child(1) > div > div.RNNXgb > div.SDkEP > div.dRYYxd > button > div.u4Uk3c > span.lTxWLe").click();
		Thread.sleep(3000);
		//ob.quit();
	}

}
