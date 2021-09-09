package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	private void tc0(String s,String s1) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\asv\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);
	}
	@DataProvider(name="data")
	private Object[][] getData()
	{
		return new Object[][]
				{
			{"welcomejava","java"},{"javawelcome","hijava"},{"sjdbe","jjfsdk"}
			};
				}
	}


