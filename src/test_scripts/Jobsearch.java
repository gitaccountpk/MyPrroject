package test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.LoginPage;
import pom.WelcomePage;

public class Jobsearch {
@Test
public void clicklogin() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.naukri.com");
	WelcomePage WP= new WelcomePage(driver);
	WP.clickLogin();
	Thread.sleep(4000);
	
	LoginPage LP= new LoginPage(driver);
	LP.setUsername("adiveppa029@gmail.com");
	LP.setPassword("akshata005");
	LP.login();
	
}

}
