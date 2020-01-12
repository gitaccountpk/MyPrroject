package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsURL {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.com");
List<WebElement> links = driver.findElements(By.tagName("a"));
int count=links.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	WebElement add = links.get(i);
	String text = add.getAttribute("href");
	System.out.println(text);
	
}
	}

}
