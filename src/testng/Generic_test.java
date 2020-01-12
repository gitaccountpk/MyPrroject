package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test {
	WebDriver driver;
	@BeforeMethod
public void openApp(){
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
}
	@AfterMethod
	public void closeApp(){
	
		driver.close();
			
}
}