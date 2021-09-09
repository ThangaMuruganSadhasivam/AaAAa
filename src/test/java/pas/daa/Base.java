package pas.daa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thanga\\eclipse-workspace\\asv\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void url(String website) {
		driver.get(website);

	}
	public void send(WebElement element,String name) {
		element.sendKeys(name);
		

	}
}
