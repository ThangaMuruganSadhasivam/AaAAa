package pas.daa;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Maine extends LoginPage {

@Test
public void tc0() {
		Base b = new Base();
		b.launch();
		b.url("https://adactinhotelapp.com/");
		
		LoginPage page = new LoginPage();
		WebElement user = page.getTxtUserName();
		user.sendKeys("thanga");
		WebElement pwd = page.getTxtPassword();
		pwd.sendKeys("murugan");

}

}
