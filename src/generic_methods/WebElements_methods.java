package generic_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class WebElements_methods
{
	public String getTheText(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
		return text;
	}
	
	public String getTheAttribute(WebElement ele,String attr)
	{
		String attribute = ele.getAttribute(attr);
		System.out.println(attribute);
		return attribute;
	}
	
	public String getTheClass(WebElement ele,String attr)
	{
		String cssval = ele.getCssValue(attr);
		System.out.println(cssval);
		return cssval;
	}
	
	public Point getTheLoc(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		return loc;
	}
	
	public Rectangle getTheRect(WebElement ele)
	{
		Rectangle rect = ele.getRect();
		System.out.println(rect);
		return rect;
	}
	
	public Dimension getTheSize(WebElement ele)
	{
		Dimension count = ele.getSize();
		System.out.println(count);
		return count;
	}
	
	public String getTheTag(WebElement ele)
	{
		String tag = ele.getTagName();
		System.out.println(tag);
		return tag;
	}



}
