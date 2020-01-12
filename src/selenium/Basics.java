//SCRIPT TO OPEN EMPTY BROWSERS AND CLOSE THE BROWSERS


package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {
	
	public static void FFB() throws InterruptedException{
	
	WebDriver driver1= new FirefoxDriver();
	Thread.sleep(9000);
	driver1.close();
	}
	public static void CB() throws InterruptedException{
		
		WebDriver driver2= new ChromeDriver();
		Thread.sleep(3000);
		driver2.close();
		}


	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.gecko.driver"; 
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key,value);
		String key1="webdriver.chrome.driver";
		String value1 = "./softwares/geckodriver.exe";
		System.setProperty(key1,value1);
		FFB();
		CB();
	}

}
