package lg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class l1 {
	static Logger log= LogManager.getLogger(l1.class);
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https:/www.google.com");
		log.info("visited website");
	    log.debug("refreshing");
		log.warn("closing Time up");
		ob.quit();
		
	}


}
