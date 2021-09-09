package com.sds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C {
	@Test(dataProvider="testdata",dataProviderClass=D.class)
public void tc0(String s) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\asv\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txt.sendKeys(s,Keys.ENTER);

}
}
