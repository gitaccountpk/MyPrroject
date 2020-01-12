package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_method 
{
	WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	

}
