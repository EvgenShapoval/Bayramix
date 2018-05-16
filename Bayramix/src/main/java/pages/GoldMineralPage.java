package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoldMineralPage extends MainPage{

	public GoldMineralPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content > div.productdetails-view.productdetails > h1")
	public WebElement productNameInGoldMineralPage;
	
	@FindBy(css="#content .quantity-box > input")
	public WebElement goldAmountInput;
	
	@FindBy(css="#content .addtocart-button > input")
	public WebElement addToCartButton;
	
	@FindBy(css="#facebox a.showcart.floatright")
	public WebElement popupShowCartLink;
}
