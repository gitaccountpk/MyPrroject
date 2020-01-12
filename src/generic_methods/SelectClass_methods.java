package generic_methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_methods {

public void selectByIndex(WebElement ele,int i)
	{
	Select s = new Select(ele);
	s.selectByIndex(i);
	}

public void selectByValue(WebElement ele,String value)
{
Select s = new Select(ele);
s.selectByValue(value);
}

public void selectByText(WebElement ele,String text)
{
Select s = new Select(ele);
s.selectByVisibleText(text);
}

public void deselectByIndex(WebElement ele,int i)
{
Select s = new Select(ele);
s.deselectByIndex(i);
}

public void deselectByValue(WebElement ele,String value)
{
Select s = new Select(ele);
s.deselectByValue(value);
}

public void deselectByText(WebElement ele,String Text)
{
Select s = new Select(ele);
s.deselectByVisibleText(Text);

}

public WebElement firstOption(WebElement ele)
{
Select s= new Select(ele);
WebElement firstOption = s.getFirstSelectedOption();
String text = firstOption.getText();
System.out.println(text);
return firstOption;
}

public List<WebElement> allOptions(WebElement ele)
{
Select s= new Select(ele);
List<WebElement> allOptions = s.getOptions();
int count = allOptions.size();
System.out.println(count);
for(WebElement we:allOptions)
{
	String text = we.getText();
	System.out.println(text);
}
return allOptions;
}

}
