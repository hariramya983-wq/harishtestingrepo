package seleniumlocotors;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				//Creating object for Chrome driver
				ChromeDriver ob =new ChromeDriver();
				//setp3 : Visiting the website
				ob.get("http://www.mycontactform.com");
				
				//Xpath : Xml Path language
				//absolute xpath
				//relative xpath
				
				//absolute xpath :start with /
				//start finding the element from root 
				//copy ->Copy full Xpath
				
				//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("Hello");
				
				
				//Relative Xpath :Start with //
				//syntax : //*[@attribute='value'] or //tagname[@attribute='value']
				//copy ->copy xpath
				
				ob.findElementByXPath("//*[@id ='user']").sendKeys("hello");
				ob.findElementByXPath("//input[@type='password']").sendKeys("123");
				ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		
				Thread.sleep(3000);
				ob.quit();
				
				
	}

}
