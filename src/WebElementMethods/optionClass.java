package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class optionClass {
	
	public static void mouseHover(WebDriver dri) throws InterruptedException{
		dri.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		dri.findElement(By.xpath("//button[.='✕']")).click();	
		 WebElement ele = dri.findElement(By.xpath("//span[.='Men']"));
		Actions act= new Actions(dri);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		dri.findElement(By.xpath("//a[.='T-Shirts']")).click();
	}
		
	public static void dragAndDrop(WebDriver dri){
		dri.get("https://www.flipkart.com/");
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		mouseHover(driver);
		

	}

}
