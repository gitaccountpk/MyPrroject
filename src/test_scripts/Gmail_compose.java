package test_scripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Gmail_InboxPage;
import pom.Gmail_PwdPage;
import pom.Gmail_UNPage;


public class Gmail_compose
{
	@Test

	public void testLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		
		Gmail_UNPage un= new Gmail_UNPage(driver);
		un.setUsername("8892735317");
		un.next();
		Thread.sleep(3000);
		
		Gmail_PwdPage p= new Gmail_PwdPage(driver);
		p.setPassword("rakeshkumar123");
		p.next();
		Thread.sleep(5000);
		
		Gmail_InboxPage in= new Gmail_InboxPage(driver);
		in.logoclick();
		in.signoutclick();
		
		
		
	}
	

}
