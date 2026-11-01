package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class h1 {
ChromeDriver ob;
	@Given("user is on login page")
	public void user_is_on_login_page() {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.facebook.com");
		  
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
        ob.findElementByName("email").sendKeys("Hai");
		
		ob.findElementByName("pass").sendKeys("Hello");  
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    ob.quit();
	}



}
