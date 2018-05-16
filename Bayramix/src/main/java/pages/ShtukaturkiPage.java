package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShtukaturkiPage extends MainPage{

	public ShtukaturkiPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content div:nth-child(3) > div:nth-child(2) h2 > a")
	public WebElement goldMineralLink;

	@FindBy(css="#productPrice2 > div.PricesalesPrice > span")
	public WebElement goldPriceInShtukaturki;
}
