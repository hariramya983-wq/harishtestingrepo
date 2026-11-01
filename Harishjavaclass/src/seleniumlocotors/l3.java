package seleniumlocotors;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {

	public static void main(String[] args) {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.google.com");
		
		//Tag name : tagname is not used for particular field ,it is used for group
		//Img
		//a
		//div,input,select
		
		List<WebElement> l1 = ob.findElementsByTagName("img");
        System.out.println("No of images " + l1.size());
        
        List<WebElement> l2 = ob.findElementsByTagName("a");
        System.out.println("No of URL " + l2.size());
        
        
        List<WebElement> l3 = ob.findElementsByTagName("div");
        System.out.println("No of div elements " + l3.size());
        
        List<WebElement> l4 = ob.findElementsByTagName("input");
        System.out.println("No of input elements " + l4.size());
        ob.quit();
	}

}
