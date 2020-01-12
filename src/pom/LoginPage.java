package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@name='email']")
private WebElement username;

@FindBy(xpath="//input[@name='PASSWORD']")
private WebElement password;

@FindBy(xpath="//button[.='Login']")
private WebElement login;

public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void setUsername(String un){
	username.sendKeys(un);
}

public void setPassword(String pwd){
	password.sendKeys(pwd);
}

public void login(){
	login.click();
}
}