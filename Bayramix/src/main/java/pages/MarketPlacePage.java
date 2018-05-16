package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlacePage extends MainPage{

	public MarketPlacePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="#adsmanager_innermenu > div > a:nth-child(3)")
	public WebElement myProfilLink;
	
}
