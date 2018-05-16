package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MarketPlacePage;
import pages.NextCreateAccountPage;

public class CreateAccountTest {

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
	public void errorFillingForm() {
		driver.get("http://bayramix.com.ua/marketplace.html");
		
		MarketPlacePage marketPlacePage = new MarketPlacePage(driver);
		
//		Click on “Мой профиль”
		marketPlacePage.myProfilLink.click();
		
		LoginPage loginPage = new LoginPage(driver);
		
//		Choose “Ещё нет учетной записи?”
		loginPage.createAccountLink.click();
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		
//		Fill in the fields: Name, Login, Password and Email
		createAccountPage.nameField.sendKeys("Евгений");
		createAccountPage.usernameField.sendKeys("Evgen5");
		
		createAccountPage.password1Field.sendKeys("885885");
		createAccountPage.password2Field.sendKeys("885885");
		
		createAccountPage.email1Field.sendKeys("ogbook44@gmail.com");
//		Error in second Email
		createAccountPage.email2Field.sendKeys("book@gmail.com");

		
		createAccountPage.registrationButton.click();
		
		NextCreateAccountPage nextCreateAccountPage = new NextCreateAccountPage(driver);
		
		String errorReport = nextCreateAccountPage.errorEmailReport.getText();
		System.out.println(errorReport);
		
//		Check for the message “Адреса электронной почты не совпадают. Пожалуйста”
		Assert.assertTrue("Fail. Expected message - Адреса электронной почты не совпадают. Пожалуйста -. "
				+ "Actual message " + errorReport, 
				errorReport.contains("очты не совпада"));
	}	
}
