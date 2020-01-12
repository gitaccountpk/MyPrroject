package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsRBCBLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio' or @type='checkbbox']|//a"));
		int count=list.size();
		System.out.println(count);
		
		

	}

}
