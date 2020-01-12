package generic_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://www.flipkart.com");
		Weddriver_methods drimet=new Weddriver_methods();
		drimet.getTheURL(driver);
		//WebElement ele = driver.findElement(By.id("month"));
		driver.findElement(By.xpath("//button[.='✕']")).click();;
		WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/li[3]/span"));
		//Select sel= new Select(ele);
		//sel.selectByIndex(12);
		//SelectClass_methods selmet=new SelectClass_methods();
	
		
		//selmet.allOptions(ele);
		OptionClass_methods optmet= new OptionClass_methods();
		optmet.mouseHoverAction(driver, ele);
	
	}

}
