package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByName;

public class Checkout extends BasePage {

	public Checkout(WebDriver driver)
	{
		super(driver);
	}
	
		//Locators 			 
			By search =By.xpath("//input[@placeholder='Search']");
			By searchbutton =By.xpath("//button[@class='btn btn-default btn-lg']");
			By clkatcbtn = By.xpath("//span[text() ='Add to Cart']");
			By shpgcartlink = By.xpath("//a[text()='shopping cart']");
			By chkoutbtn = By.xpath("//a[@class='btn btn-primary']");
			By billcont = By.id("button-payment-address");
			By dlvrydtlscont = By.id("button-shipping-address");
			By dlvrymtdcont = By.id("button-shipping-method");
			By trmscondchkbox = By.xpath("//input[@name='agree']");
			By pymtmtdcont = By.id("button-payment-method");
			By cnforder = By.id("button-confirm");
			
			public void sendvaluesinsearchfield(String prod)
			{
				driver.findElement(search).sendKeys(prod);
			}
			
			public void clickonsearchbutton()
			{
				driver.findElement(searchbutton).click();
			}
			
			public void clickaddtocartbutton()
			{
				driver.findElement(clkatcbtn).click();
			}
			public void clickonshoppingcartlink()
			{
				driver.findElement(shpgcartlink).click();;
			}
			public void clickonchkoutbutton()
			{
				driver.findElement(chkoutbtn).click();
			}
			public void clickoncontinuebutton()
			{
				driver.findElement(billcont).click();
			}
			public void clickondlvrydtlscontbutton()
			{
				driver.findElement(dlvrydtlscont).click();
			}
			public void clickondlvrymtdbutton()
			{
				driver.findElement(dlvrymtdcont).click();
			}
			public void clickontermsandconditionscheckbox()
			{
				driver.findElement(trmscondchkbox).click();
			}
			public void clickonpymtmtdcontbutton()
			{
				driver.findElement(pymtmtdcont).click();
			}
			public void clickonconfirmorderbutton()
			{
				driver.findElement(cnforder).click();
			}
			public void clear()
			{
				driver.findElement(search).clear();
			}
}
