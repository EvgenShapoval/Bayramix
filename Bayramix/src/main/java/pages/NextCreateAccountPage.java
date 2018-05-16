package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextCreateAccountPage extends MainPage{

	public NextCreateAccountPage(WebDriver driver) {
		super(driver);
	}

//	This page opens after CreateAccountPage where was submitting the form

	@FindBy(css="#system-message > dd > ul > li")
	public WebElement errorEmailReport;
	
//	#system-message > dd.notice.message > ul > li
//	*[@id="system-message"]/dd[1]/ul/li/text()
//	Ошибка SMTP! Данные были не приняты.
	
	
//	Можно ввести еще пароль(в 2 полях) и тогда на стледующей странице
//	<li>Введённый вами логин некорректен. Пожалуйста</li>
//	#jform_password1
	
}
