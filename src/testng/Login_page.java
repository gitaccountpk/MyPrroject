package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_page extends Generic_method{
@Test
public void Login(){
	driver.findElement(By.id("identifierId")).sendKeys("adiveppa029@gmail.com");
	driver.findElement(By.xpath("//span[.='Next']")).click();
}

}
