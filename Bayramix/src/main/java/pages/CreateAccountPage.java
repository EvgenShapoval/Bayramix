package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends MainPage{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="jform_name")
	public WebElement nameField;
	
	@FindBy(id="jform_username")
	public WebElement usernameField;
		
	@FindBy(id="jform_password1")
	public WebElement password1Field;
	
	@FindBy(id="jform_password2")
	public WebElement password2Field;
	
	@FindBy(id="jform_email1")
	public WebElement email1Field;
	
	@FindBy(id="jform_email2")
	public WebElement email2Field;
	
	@FindBy(css="#system button")
	public WebElement registrationButton;
	
//	Page after submitting the form - NextCreateAccountPage

}
