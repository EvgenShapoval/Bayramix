package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFormPage extends MainPage {

	public SearchFormPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="search_searchword")
	public WebElement searchWordField;
	
	@FindBy(id="searchphraseexact")
	public WebElement searchPhraseExactRadio;
	
	@FindBy(id="ordering")
	public WebElement orderingSelect;
	
	@FindBy(css="#ordering > option:nth-child(4)")
	public WebElement alphaOrderingSelect;
		
	@FindBy(id="area_content")
	public WebElement materialsCheckBox;
	
	@FindBy(id="area_virtuemart")
	public WebElement productCheckBox;
	
	@FindBy(css="#searchForm  button")
	public WebElement submitSearchForm;
		
}
