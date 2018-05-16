package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainPage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#system li:nth-child(3) > a")
	public WebElement createAccountLink;
	
}
