package seleniumlocotors;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.mycontactform.com");
		
		//Css : Casecase Style Sheet 7 ways and shortcut
		//1.tagname and id :  syntax :tagname#id
		
		//ob.findElementByCssSelector("input#user").sendKeys("hai");
		
		
		//2.tagname and classname : syntax :tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hell");
		
		//3.tagname and atttribute : syntax :tagname[atttribute='value']
		//	ob.findElementByCssSelector("input[type='text']").sendKeys("hellee");
			
			
	//4.tagname,classname and atttribute : syntax :tagname.classname[atttribute='value']
			//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("helleeo");
		
		
		//5.tagname and Prefix of atttribute : syntax :tagname[atttribute^='Prefix value']
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("Harish");
		
		//6.tagname and Suffix of atttribute : syntax :tagname[atttribute$='Suffix value']
				//ob.findElementByCssSelector("input[type$='xt']").sendKeys("Harish1");
		
		//7.tagname and Substring of atttribute : syntax :tagname[atttribute*='Substring value']
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("Harish12");
		
		
		//Copy ->copy selector
		ob.findElementByCssSelector("#user").sendKeys("Hello Hai");
		
		Thread.sleep(3000);
		ob.quit();
		
		

	}

}
