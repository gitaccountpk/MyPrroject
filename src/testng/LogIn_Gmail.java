package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn_Gmail extends Generic_test {
	@Test
	public void logIn() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("adiveppa029@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pakku002");
		driver.findElement(By.id("u_0_b")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<count;i++){
			WebElement we = links.get(i);
			String text = we.getText();
			System.out.println(text); 
			
		}
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(3000);
		a.dismiss();
	}
}
