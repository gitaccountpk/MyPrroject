package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsPassData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/Textbox.html");
		List<WebElement> CB = driver.findElements(By.xpath("//input[@type='text']"));
		int count=CB.size();
		System.out.println(count);
		for(WebElement we:CB){
					
			we.sendKeys("Prakash");
			
			we.sendKeys("prakashkallur@gmail.com");
			
			we.sendKeys("6361579883");
			
			we.sendKeys("DeepanjaliNagar");
			
			we.sendKeys("BE");
			Thread.sleep(2000);
		}

	for(WebElement clr:CB){
		clr.clear();
		Thread.sleep(2000);
		}
		/*for(int i=0; i<count;i++){
			WebElement clc=CB.get(i);
			clc.sendKeys("Prakash");
			clc.sendKeys("prakashkallur@gmail.com");
			clc.sendKeys("Prakash");
			clc.sendKeys("prakashkallur@gmail.com");
			clc.sendKeys("BE");
			
		}*/
	}

}
