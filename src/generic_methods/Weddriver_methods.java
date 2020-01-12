package generic_methods;

import org.openqa.selenium.WebDriver;

public class Weddriver_methods 
{
	public String getTheTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		return title;
	}
		
	public String getTheURL(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println("URL is:"+url);
		return url;
	}
	
	public String getThePageSource(WebDriver driver)
	{
		String source = driver.getPageSource();
		System.out.println("source code is:"+source);
		return source;
	}

	public String getWindowId(WebDriver driver)
	{
		String wh = driver.getWindowHandle();
		System.out.println("window id is:"+wh);
		return wh;
	}

}
