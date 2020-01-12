package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsClickCB {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/checkbox.html");
		List<WebElement> CB = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=CB.size();
		System.out.println(count);
		for(WebElement we:CB){
			
			we.click();
		}

		for(int i=count-1;i>=0;i--){
			WebElement we = CB.get(i);
			we.click();
		}
	}

}
