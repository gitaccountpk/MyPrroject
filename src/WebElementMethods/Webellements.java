package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webellements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/displayed.html");
		WebElement ele = driver.findElement(By.xpath("//input[2]"));
		boolean b= ele.isDisplayed();
		if(b){
			System.out.println("Textbox is displayed");
		}
		else
		{
			System.out.println("Textbox is not displayed");
		}

	}

}
