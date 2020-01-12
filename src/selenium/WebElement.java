/*package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement {
	
	//Script to check whether the element is displayed or not
	
	static void displayed(FirefoxDriver driver){
		driver.get("file:///C:/Users/Adiveppa/Desktop/displayed.html");
		org.openqa.selenium.WebElement ele= driver.findElement(By.xpath("//input"));
		boolean bool = ele.isDisplayed();
		if(bool){
			System.out.println("Element is displayed");
		}
		else
			System.out.println("Element is not displayed");
	}
	//Script to check whether the element is enabled or not
	static void enabled(FirefoxDriver driver){
		driver.get("file:///C:/Users/Adiveppa/Desktop/displayed.html");
		org.openqa.selenium.WebElement ele= driver.findElement(By.xpath("//input"));
		boolean bool = ele.isEnabled();
		if(bool){
			System.out.println("Element is enabled");
		}
		else
			System.out.println("Element is not enabled");
	}
	static void selected(FirefoxDriver driver){
		driver.get("file:///C:/Users/Adiveppa/Desktop/locators.html");
		org.openqa.selenium.WebElement ele= driver.findElement(By.xpath("//input[@id='c1']"));
		ele.click();
		boolean bool =ele.isSelected();
		if(bool){
			System.out.println("Element is selected");
		}
		else
			System.out.println("Element is not selected");
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		displayed(driver);
		enabled(driver);
		selected(driver);
	}

}*/

