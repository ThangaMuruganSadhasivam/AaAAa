package org.sam;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sample1 {

	@Test
	private void tco() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\asv\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		WebElement li = driver.findElement(By.xpath("//input[@type='text']"));
		li.sendKeys("Greens");
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement x : findElements) {
			String text = x.getText();
			System.out.println(text);
		}
		
	}
	
	
}
