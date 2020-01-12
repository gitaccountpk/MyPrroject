package selenium;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	public static void Get_Photo(WebDriver driver){
		String photo = "./Photos";
		Date d = new Date();
		String d1 = d.toString();
		System.out.println(d1);
		String d2 = d1.replaceAll(":", "-");
		System.out.println(d2);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dst = new File(photo+d2+".jpeg");
		System.out.println(dst);
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Adiveppa/Desktop/Test.html");
		Get_Photo(driver); 
	}
}
