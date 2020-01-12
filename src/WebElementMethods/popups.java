package WebElementMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popups {
	
	public static void alert(WebDriver driver) throws InterruptedException{
		driver.get("http://javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		System.out.println("Alert Popup handled");
		
	}
	
	public static void hidden(WebDriver driver){
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//i[.='Cal']")).click();
		driver.findElement(By.xpath("(//a[.='26'])[1]")).click();
		System.out.println("Hidden Popup handled");
	}
	
	public static void fileDownload(WebDriver driver) throws InterruptedException, AWTException{
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[3]/a[1]")).click();
		Thread.sleep(3000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver dri= new FirefoxDriver();
		alert(dri);
		hidden(dri);
		//fileDownload(dri);

	}

}
