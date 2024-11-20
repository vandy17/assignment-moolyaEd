package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart extends BasePage{

	public AddToCart(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	By search =By.xpath("//input[@placeholder='Search']");
	By searchButton =By.xpath("//button[@class='btn btn-default btn-lg']");
	By prodselect = By.xpath("//img[@title='iPhone']");
	By addtocartbutton = By.id("button-cart");
	By shoppingcartlink = By.xpath("//a[text()='shopping cart']");
	
	
	//Actual method
	
	public void sendvaluesinsearchfield(String prod)
	{
		driver.findElement(search).sendKeys(prod);
	}
	
	public void clickonsearchbutton()
	{
		driver.findElement(searchButton).click();
	}
	
	//
	public void clickonproductdisplay()
	{
		driver.findElement(prodselect).click();
	}
	
	public void clickonaddtocartbutton()
	{
		driver.findElement(addtocartbutton).click();
	}
	public void clickonshoppingcartlink()
	{
		driver.findElement(shoppingcartlink).click();
	}
	public void clear()
	{
		driver.findElement(search).clear();
	}
	
}
