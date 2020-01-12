package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_UNPage 
{
	@FindBy(id="identifierId")
	private WebElement username;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	public Gmail_UNPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void next()
	{
		next.click();
	}

}
