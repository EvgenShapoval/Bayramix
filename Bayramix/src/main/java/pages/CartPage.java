package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends MainPage{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#vmCartModule .product_name > a")
	public WebElement productNameInCart;

	@FindBy(css="#vmCartModule > div.vm_cart_products .quantity")
	public WebElement productQuantityInCart;
	
	@FindBy(css="#vmCartModule > div.vm_cart_products div.prices")
	public WebElement productSumInCart;
}
