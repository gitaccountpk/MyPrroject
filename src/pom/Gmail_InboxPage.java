package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_InboxPage 
{
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[3]/div/div[2]/div/a/span")
	private WebElement logo;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signout;
	
	@FindBy(className="gb_Se")
	private WebElement apps;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[4]/ul[1]/li[7]/a/span[1]")
	private WebElement gmail;
	
	public Gmail_InboxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoclick()
	{
		logo.click();
	}
	
	public void signoutclick()
	{
		signout.click();
	}
	
	public void appsclick()
	{
		apps.click();
	}

	public void gmailclick()
	{
		gmail.click();
	}

}
