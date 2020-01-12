/*package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.WebElement;

public class drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/multidropdown.html");
		org.openqa.selenium.WebElement ele=driver.findElement(By.xpath("//select[@name='lang']"));
		Select s = new Select(ele);
		List<org.openqa.selenium.WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println("total number of options"+count);
		s.selectByIndex(1);
		s.selectByVisibleText("C");
		for(org.openqa.selenium.WebElement we: options){
			String text = we.getText();
			System.out.println(text);
		}
		List<org.openqa.selenium.WebElement> selopt = s.getAllSelectedOptions();
		int selcount = selopt.size();
		System.out.println("total number of selected options"+selcount);
		for(org.openqa.selenium.WebElement we: selopt){
			String seltext = we.getText();
			System.out.println(seltext);
		}
	}

}

/*
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) 
	{
		
		
		
		ele.click();
		
		List<WebElement> options = s.getOptions();
		int count = options.size();
		
		s.selectByIndex(1);
		boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("It's a multiple dropdown");
		}
		else
		{
			System.out.println("It's not a multiple dropdown");
		}
		for(WebElement we: options)
		{
			String text = we.getText();
			System.out.println(text);
		}
		List<WebElement> seloptions = s.getAllSelectedOptions();
		for(WebElement we: seloptions)
		{
			String seltest = we.getText();
			System.out.println(seltest);
			}
	}
}*/
