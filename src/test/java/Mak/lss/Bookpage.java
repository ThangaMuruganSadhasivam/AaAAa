package Mak.lss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookpage extends Base{

	public Bookpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fromCity")
	private WebElement from;
	@FindBy(id="toCity")
	private WebElement to;
	
	
	
	
	
	
	
	public WebElement getFrom() {
		return from;
	}







	public WebElement getTo() {
		return to;
	}







	public void select(String From,String To)
	{
		dropdown(getFrom(), From);
		dropdown(getTo(), To);
		
	}
	
	
}
