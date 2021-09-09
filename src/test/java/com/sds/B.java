package com.sds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
@Test(dataProvider="testdata",dataProviderClass=A.class)
public void tc1(String s) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\asv\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txt.sendKeys(s,Keys.ENTER);
	

}
}
