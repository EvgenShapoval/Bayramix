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
//	������ SMTP! ������ ���� �� �������.
	
	
//	����� ������ ��� ������(� 2 �����) � ����� �� ���������� ��������
//	<li>�������� ���� ����� �����������. ����������</li>
//	#jform_password1
	
}
