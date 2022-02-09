package com.pag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage extends Baseclass{

	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(id="nav-search-submit-button")
	private WebElement button;

	public WebElement getSearch() {
		return search;
	}
	public WebElement getButton() {
		return button;
	}
	
	public void amzon(String text) {
		
		send(getSearch(),text);
		clk(getButton());
		
	}
	
	
}
