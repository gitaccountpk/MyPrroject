package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OptionClass_methods
{
 public void mouseHoverAction(WebDriver driver,WebElement ele)
 {
	 Actions act= new Actions(driver);
	 act.moveToElement(ele).perform();
 }
 
 public void doubleClick(WebDriver driver,WebElement ele)
 {
	 Actions act= new Actions(driver);
	 act.doubleClick(ele).perform();;
	 
 }
 
 public void rightClick(WebDriver driver,WebElement ele)
 {
	 Actions act= new Actions(driver);
	 act.contextClick(ele).perform();;
 }
 
 public void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
 {
	 Actions act= new Actions(driver);
	 act.dragAndDrop(source, target);
 }
}
