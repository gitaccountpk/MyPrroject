package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_PwdPage 
{
@FindBy(name="password")
private WebElement pwd;

@FindBy(xpath="//span[.='Next']")
private WebElement next;

public Gmail_PwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void setPassword(String p)
{
	pwd.sendKeys(p);
}

public void next()
{
	next.click();
}


}
