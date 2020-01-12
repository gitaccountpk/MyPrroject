/*package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {

	public static void tagName1(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
	
		
	}
	
	public static void tagName2(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.tagName("input")).sendKeys("pakku");
	
	}
	
	public static void id(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("t2")).sendKeys("adiveppa029@gmail.com");
	

	}
	public static void name(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);		
		WebElement ele = driver.findElement(By.name("cbox"));
		ele.click();

	}
	public static void classname(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.className("c1")); 
		ele.click();

	}
	public static void linkedText(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.linkText("linkdText:"));
		ele.click();

	}
	public static void partialLinkedText(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.partialLinkText("password"));
		ele.click();

	}
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/locators.html");
		tagName2(driver);
		id(driver);
		classname(driver);
		name(driver);
		partialLinkedText(driver);	
		tagName1(driver);
		
		
	}

}*/
