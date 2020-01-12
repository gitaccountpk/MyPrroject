package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/checkbox.html");
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    int count = list.size();
	    System.out.println("number of checkbox are:"+count);
	    for(WebElement we: list){
	    	we.click();
	    	Thread.sleep(1000);
	    }
	    for(int i=count-1;i>=0;i--){
	    	WebElement we=list.get(i);
	    	we.click();
	    	Thread.sleep(3000);
	    }
	}

}
