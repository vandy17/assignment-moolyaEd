package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import PageObjectModel.AddToCart;
import PageObjectModel.Checkout;
import PageObjectModel.ProductCompare;
import PageObjectModel.Search;


public class ActualTest {
	
WebDriver driver;

	@BeforeClass
	void setup()
	{
		
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	//Search Automation
//	@Test(priority = 1)
//	void searchTest() throws InterruptedException
//	{
//		Search s = new Search(driver);
//		//1. Enter any existing product name into the 'Search' text box field.
//		s.sendvaluesinsearchfield("iphone");
//		Thread.sleep(4000);
//		//2.Click on the button having search icon.
//		s.clickonsearchbutton();
//		Thread.sleep(4000);
//		//This line of script is used to clear the search bar.
//		s.clear();
//		Thread.sleep(2000);
//		//3.Enter non existing product name into the 'Search' text box field - <Refer Test Data>
//		s.sendvaluesinsearch("Shoes");
//		Thread.sleep(4000);
//		//4.Click on the button having search icon 
//		s.clicksearchbutton();
//		Thread.sleep(4000);
//		s.clear();
//		Thread.sleep(2000);
//		//5. Don't enter anything into the 'Search' text box field 
//		s.sendemptyvaluesinsearch("");
//		Thread.sleep(4000);
//		//6.Click on the button having search icon 
//		s.clickemptysearchbutton();
//		Thread.sleep(2000);
//		//7. Enter the search criteria in the 'Search' text box field which can result in multiple products 
//		s.sendvaluesinsearchmulti("mac");
//		Thread.sleep(4000);
//		//Click on the button having search icon 
//		s.clicksearchbuttonmulti();
//		Thread.sleep(4000);
//		s.clear();
//	}
//	
//	//AddToCart Automation
//	@Test(priority = 2)
//	void addToCartTest() throws InterruptedException
//	{
//		AddToCart adtc = new AddToCart(driver);
//		//1.Enter any existing Product name into the Search text box field
//		adtc.sendvaluesinsearchfield("iphone");
//		Thread.sleep(4000);
//		//2. Click on the button having search icon
//		adtc.clickonsearchbutton();
//		Thread.sleep(4000);
//		//3.Click on the Product displayed in the Search results
//		adtc.clickonproductdisplay();
//		Thread.sleep(4000);
//		//4.Click on 'Add to Cart' button in the displayed 'Product Display' page
//		adtc.clickonaddtocartbutton();
//		Thread.sleep(4000);
//		//5.Click on the 'shopping cart!' link in the displayed success message
//		adtc.clickonshoppingcartlink();
//		Thread.sleep(4000);
//		adtc.clear();
//	}
	
	//ProductComparision
	@Test(priority = 3)
	void prodComparision() throws InterruptedException
	{
		ProductCompare prdcmp = new ProductCompare(driver);
		//1.Enter any existing Product name into the Search text box field 
		prdcmp.sendvaluesinsearchfield("iphone");
		Thread.sleep(4000);
		//2. Click on the button having search icon
		prdcmp.clickonsearchbutton();
		Thread.sleep(2000);
		//3. Click on the Product displayed in the Search results
		prdcmp.clickonproductdisplay();
		Thread.sleep(2000);
		//4. Hover the mouse cursor on 'Compare this Product' option from the displayed Product Display Page 
//		prdcmp.hovercursor();
//		Thread.sleep(2000);
		//5.Select 'Compare this Product' option  
		prdcmp.clickoncomparethisproductbutton();
		Thread.sleep(2000);
		//6.Click on 'product comparison' link from the displayed success message
		prdcmp.clickonproductcompaerlink();
		Thread.sleep(2000);
		prdcmp.clear();
	}
	
	@Test(priority = 3)
	void checkout() throws InterruptedException
	{
	
		Checkout chkout = new Checkout(driver);
		//1.Enter any existing Product name into the Search text box field 
		chkout.sendvaluesinsearchfield("iPod Shuffle");
		Thread.sleep(3000);
		chkout.clickonsearchbutton();
		Thread.sleep(3000);
		chkout.clickaddtocartbutton();
		Thread.sleep(3000);
		chkout.clickonshoppingcartlink();
		Thread.sleep(3000);
		Thread.sleep(3000);
		chkout.clickonchkoutbutton();
		Thread.sleep(3000);
		chkout.clickoncontinuebutton();
		Thread.sleep(3000);
		chkout.clickondlvrydtlscontbutton();
		Thread.sleep(3000);
		chkout.clickondlvrymtdbutton();
		Thread.sleep(3000);
		chkout.clickontermsandconditionscheckbox();
		Thread.sleep(3000);
		chkout.clickonpymtmtdcontbutton();
		Thread.sleep(3000);
		chkout.clickonconfirmorderbutton();
		Thread.sleep(3000);
		chkout.clear();
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
