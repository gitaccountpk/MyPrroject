package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
@FindBy(xpath="(//div[.='Login'])[1]")
private WebElement login;

public WelcomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void clickLogin(){
	login.click();
}
}
