package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends MainPage {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

//	Next page - search results
	@FindBy(css="#searchForm div:nth-child(6)")
	public WebElement searchResults;

}
