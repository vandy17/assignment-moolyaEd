package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends BasePage{
	
	//Constructor
			WebDriver driver;
			
			public Search(WebDriver driver)
			{
				super(driver);
			}
			
			//Locators
			
			By search =By.xpath("//input[@placeholder='Search']");
			By searchButton =By.xpath("//button[@class='btn btn-default btn-lg']");
			
			
			//Actual method
			
			public void sendvaluesinsearchfield(String prod)
			{
				driver.findElement(search).sendKeys(prod);
			}
			
			public void clickonsearchbutton()
			{
				driver.findElement(searchButton).click();
			}
			
			public void sendvaluesinsearch(String nonprod)
			{
				driver.findElement(search).sendKeys(nonprod);
			}
			
			public void clicksearchbutton()
			{
				driver.findElement(searchButton).click();
			}
			public void sendemptyvaluesinsearch(String novalue)
			{
				driver.findElement(search).sendKeys(novalue);
			}
			public void clickemptysearchbutton()
			{
				driver.findElement(searchButton).click();
			}
			public void sendvaluesinsearchmulti(String multivalue)
			{
				driver.findElement(search).sendKeys(multivalue);
			}
			public void clicksearchbuttonmulti()
			{
				driver.findElement(searchButton).click();
			}
			public void clear()
			{
				driver.findElement(search).clear();
			}
	}
