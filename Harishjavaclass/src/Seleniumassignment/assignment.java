package Seleniumassignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
				Thread.sleep(3000);
				WebElement e1 = ob.findElementById("userSelect");
				Thread.sleep(3000);
				Select s =new Select(e1);
				s.selectByValue("1");
				//s.selectByVisibleText("Hermoine Granger");
				Thread.sleep(3000);
				ob.findElementByClassName("btn-default").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input").sendKeys("1000");
				Thread.sleep(3000);
				ob.findElementByClassName("btn-default").click();
				Thread.sleep(3000);
				ob.findElementByXPath("/html/body/div/div/div[2]/div/div[3]/button[3]").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input").sendKeys("900");
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(1)").click();
				Thread.sleep(3000);
				ob.findElementByCssSelector("body > div > div > div.box.mainhdr > button.btn.logout").click();
				Thread.sleep(3000);
				
	}

}
