package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternetMagazinPage extends MainPage{

	public InternetMagazinPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#offlajn-accordion-123-1 dt.level2.off-nav-2.parent.last a")
	public WebElement shtukaturkiLink;
}
