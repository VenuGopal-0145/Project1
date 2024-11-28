package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class LogIn extends Base{
	WebDriver driver;
	
	@Test
	public void LogIn() throws IOException {
		
		driver=IntializeDriver();
		driver.navigate().to(prop.getProperty("URL"));
		
		LandingPage land=new LandingPage(driver);
		land.myAccountDropdown().click();
		land.LogInOption().click();
		
	}
	

}
