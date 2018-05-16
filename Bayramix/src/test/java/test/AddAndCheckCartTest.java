package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helpers.WebLibrary;
import pages.CartPage;
import pages.GoldMineralPage;
import pages.InternetMagazinPage;
import pages.MainPage;
import pages.ShtukaturkiPage;

public class AddAndCheckCartTest {

	WebDriver driver;
	
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:/soft/java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void afterTest() {
		driver.quit();
		}
			
	@Test
	public void testAddToCart() {
		driver.get("http://www.bayramix.com.ua/");
		
		String productQuantity = "5";
		int intProductQuantity = 5;
		
		MainPage mainPage = new MainPage(driver);
		
//		In the menu select У»нтернет-магазинФ
		mainPage.internetMagazinLink.click();
		
		InternetMagazinPage magazinPage = new InternetMagazinPage(driver);
		
//		Go to the section facade paints and coatings.
		magazinPage.shtukaturkiLink.click();
		
		ShtukaturkiPage shtukaturkiPage = new ShtukaturkiPage(driver);
		
//		On the Shtukaturki page we get information about the price
		String goldPrice = shtukaturkiPage.goldPriceInShtukaturki.getText();
		System.out.println("Gold Price in Shtukaturki Page (String) - " + goldPrice);
		shtukaturkiPage.goldMineralLink.click();
		
		GoldMineralPage goldMineralPage = new GoldMineralPage(driver);
		
//		Cut the String and convert it to Integer
		int intGoldPrice = WebLibrary.cutStingReturnInt(goldPrice, 0, 4);
		int intSumGoldPage = intGoldPrice * intProductQuantity;
		System.out.println("Integer Gold Price = " + intGoldPrice);

//		On the Gold Mineral page we get information about the product name
		String productNameGoldPage = goldMineralPage.productNameInGoldMineralPage.getText();
		goldMineralPage.goldAmountInput.clear();
		
//		Set String productQuantity
		goldMineralPage.goldAmountInput.sendKeys(productQuantity);
		goldMineralPage.addToCartButton.click();
		goldMineralPage.popupShowCartLink.click();
		
		CartPage cartPage = new CartPage(driver);
		
//		On the Cart page we get information about Name, quantity and sum
		String productNameCartPage = cartPage.productNameInCart.getText();
		String quantityInCart = cartPage.productQuantityInCart.getText();
		String sumInCart = cartPage.productSumInCart.getText();
		
//		Cut the String and convert it to Integer
		int intSumInCart = WebLibrary.cutStingReturnInt(sumInCart, 0, 5);
		System.out.println("Integer Sum In Cart = " + intSumInCart);
		
		System.out.println("Product Name In Cart - " + cartPage.productNameInCart.getText());
		System.out.println("Product Quantity In Cart = " + cartPage.productQuantityInCart.getText());
		System.out.println("Product Sum In Cart = " + cartPage.productSumInCart.getText());
		
//		Compare product names
		boolean compareName = productNameGoldPage.equals(productNameCartPage);
		
//		Check the quantity of goods
		boolean compareQuantity = quantityInCart.equals(productQuantity);
		
//		Check that the sum of the order corresponds to the declared on the site
		boolean compareSum = intSumGoldPage == intSumInCart;
		
		Assert.assertTrue("Fail. Different product names. Probably " 
		+ productNameGoldPage + " not equal " + productNameCartPage 
		+ " Else. Incorrect quantity of goods. Probably " 
		+ quantityInCart + " not equal " + productQuantity 
		+ " Else. The sum of the total order corresponds to the declared on the site. "
		+ intSumGoldPage + " not equal " + intSumInCart,	
		compareName & compareQuantity & compareSum);
	}
}
