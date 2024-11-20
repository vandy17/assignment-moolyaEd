package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductCompare extends BasePage{

		
		public ProductCompare(WebDriver driver)
		{
			super(driver);
		}
		
		//Locators
		By search =By.xpath("//input[@placeholder='Search']");
		By searchButton =By.xpath("//button[@class='btn btn-default btn-lg']");
		By prodselect = By.xpath("//img[@title='iPhone']");
		By img = By.xpath("//img[@class='img-responsive']");
		By Cmpthisprodbutton = By.xpath("//i[@class='fa fa-exchange']");
		By prodcomplink = By.xpath("//a[text()='product comparison']");
		
		
		//Actual method 
		
		
		public void sendvaluesinsearchfield(String prod)
		{
			driver.findElement(search).sendKeys(prod);
		}
		
		public void clickonsearchbutton()
		{
			driver.findElement(searchButton).click();
		}
		
		public void hovercursor()
		{
				//Creating object of an Actions class
				Actions action = new Actions(driver);
				//Performing the mouse hover action on the target element.
				action.moveToElement((WebElement) img).build().perform();
				
		}
		//
		public void clickonproductdisplay()
		{
			driver.findElement(prodselect).click();
		}
		
		public void clickoncomparethisproductbutton()
		{
			driver.findElement(Cmpthisprodbutton).click();
		}
		public void clickonproductcompaerlink()
		{
			driver.findElement(prodcomplink).click();
		}
		public void clear()
		{
			driver.findElement(search).clear();
		}
}



