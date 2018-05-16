package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

protected WebDriver driver;
	
	public MainPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	Menu
	@FindBy(css="#menu li.level1.item141 > a")
	public WebElement priceListLink;
	
	@FindBy(css="#menu li.level1.item142 > a")
	public WebElement internetMagazinLink;
		
	@FindBy(css="#menu li.level1.item190 > a")
	public WebElement marketPlaceLink;
	
	@FindBy(css="#menu li.level1.item115 > a")
	public WebElement kontaktyLink;
	
	
//	Search
	@FindBy(css="#searchbox-94 > input[type=\"text\"]:nth-child(1)")
	public WebElement searchBox;
	
//	Search popup
	@FindBy(css="#searchbox-94 > ul > li.more-results.skip")
	public WebElement boxAll;
//	Пункт - Показать все результаты 
	
	@FindBy(css="#searchbox-94 > ul > li:nth-child(7) > h3")
	public WebElement boxProd;
//	Пункт - Продукты.Добро пожаловать
	
}
