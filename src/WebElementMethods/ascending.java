/*package WebElementMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ascending {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/multidropdown.html");
		WebElement list = driver.findElement(By.xpath("//select"));
		Select s= new Select(list);
		List<WebElement> options = s.getOptions();
		ArrayList<String>l=new ArrayList<String>();
		for(WebElement we: options){
			String text = we.getText();
			l.add(text);
			System.out.println(l);
		}
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l ;
		for(String t: l){
			System.out.println(t);
		}
		
	}

}
*/