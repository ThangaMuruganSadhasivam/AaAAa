package com.pag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {
	public static WebDriver driver;
	public static WebElement element;
	public void send(WebElement element,String name) {
		element.sendKeys(name);
	}
	public void clk(WebElement element) {
		element.click();
	}

}
