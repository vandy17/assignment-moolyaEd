package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassword extends BasePage {

	public ForgetPassword(WebDriver driver)
	{
		super(driver);
	}
	
		//Locators 		
		By clkmyact = By.xpath("//span[text() ='My Account']");
		By clklogin = By.xpath("//a[text() ='Login']");
		By clckfrgtpass = By.xpath("//a[text() ='Forgotten Password']");
		By email = By.id("input-email");
		By clkcont = By.xpath("//input[@value='Continue']");
		
}
