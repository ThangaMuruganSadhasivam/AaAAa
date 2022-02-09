package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pag.AmazonPage;
import com.pag.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition extends Baseclass{ 
	WebDriver driver;

@Given("User should enter {string} into the amazon page")
public void user_should_enter_into_the_amazon_page(String text) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	AmazonPage a = new AmazonPage();
	a.amzon(text);
}

@When("User should enter the search box value")
public void user_should_enter_the_search_box_value() {
  
  String url = driver.getCurrentUrl();
  System.out.println("Current Url is :"+url);
  Assert.assertEquals("https://www.amazon.in/s?k=Iphone&ref=nb_sb_noss_2", url);
  System.out.println("NExt page is verified...");
}

@When("User should Verify")
public void user_should_Verify() {
	String title = driver.getTitle();
	System.out.println("Title is :"+title);
	
    
}

}
