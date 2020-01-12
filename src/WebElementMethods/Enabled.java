package WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.diver","./softwares/geckdriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/displayed.html"); 

	}

}
