package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.MainPage;
import pages.SearchFormPage;
import pages.SearchResultsPage;

public class SearchFormTest {

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
	public void testSearchForm() {
		driver.get("http://www.bayramix.com.ua/");
		
		MainPage mainPage = new MainPage(driver);

		Actions actions = new Actions(driver);
		
//		On the main page enter in the search field "фасадны"
//		in the pop-up go to the search form page
		actions.moveToElement(mainPage.searchBox).click().sendKeys("фасадны").pause(1000).
		moveToElement(mainPage.boxAll).pause(1000).click().perform();
		
////	Alternative code to search
//		mainPage.searchBox.sendKeys("фасадны");
//		mainPage.boxAll.click();
		
		SearchFormPage searchFormPage = new SearchFormPage(driver);
		
//		On the page Search Form
		searchFormPage.searchWordField.sendKeys("е краски");
//		Append "е краски" to the search string
		
		searchFormPage.searchPhraseExactRadio.click();
		
		searchFormPage.orderingSelect.click();
		searchFormPage.alphaOrderingSelect.click();
		
		searchFormPage.materialsCheckBox.click();
		searchFormPage.productCheckBox.click();
		
		searchFormPage.submitSearchForm.click();
		
		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		
//		On the next page Search Form  - search results
		String searchResult = searchResultsPage.searchResults.getText();
		System.out.println(searchResult);
		
		Assert.assertTrue("Fail. Expected message - Результат поиска: найдено 2 объекта -. "
				+ "Actual message " + searchResult,
				searchResult.equals("Результат поиска: найдено 2 объекта."));
	}
}
