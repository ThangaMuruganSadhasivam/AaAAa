package Mak.lss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebElement element;
	public static WebDriver driver;
	public void send(WebElement element,String name)
	{
		element.sendKeys(name);

	}
	public void click(WebElement element) 
	{
		element.click();

	}
	public void dropdown(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

}
