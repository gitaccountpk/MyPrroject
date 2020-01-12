//Script to print TITLE,URL,and Source code of the web page
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver"; 
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String source = driver.getPageSource();
		System.out.println("The title of the webpage is "+title);
		System.out.println("The URL of the webpage is "+url);
		System.out.println("The source code of the webpage is"+source);

	}

}
