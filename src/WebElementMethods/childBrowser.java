package WebElementMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class childBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://selenium.dev/");
		WebElement ele1 = driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
		WebElement ele3 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));

		Actions act=new Actions(driver);
		Robot r=new Robot();
		act.contextClick(ele1).perform();
		r.keyPress(KeyEvent.VK_T);
		
		Thread.sleep(3000);
		
		act.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		
		Thread.sleep(3000);
		
		act.contextClick(ele3).perform();
		r.keyPress(KeyEvent.VK_T);
		
		Thread.sleep(3000);
		
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		Thread.sleep(3000);
		ArrayList<String> L = new ArrayList<String>(allwh);
		String wh=L.get(2);
		driver.switchTo().window(wh);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		 wh=L.get(3);
		 driver.switchTo().window(wh);
		 Thread.sleep(3000);
		 driver.close();
		 Thread.sleep(3000);
		 wh=L.get(1);
		 driver.switchTo().window(wh);
		 Thread.sleep(3000); 
		 driver.close();
		 
		
	
		
	}

}
