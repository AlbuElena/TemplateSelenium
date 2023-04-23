package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers {

	
	public CartPage(WebDriver driver) {
		super(driver);
	}

	public By addToCart = By.xpath("//button[@type = 'submit']");
	public By checkAlertAddedToCart = By.xpath("//div[@role = 'alert']");
	public By viewCart = By.xpath("//a[@tabindex = '1']");
	public By plusButton = By.xpath("//div[contains(@class, 'plus')]");
	public By totalPrice = By.xpath("//span[@class = 'woocommerce-Price-amount amount']");
	public By updateCartButton = By.xpath("//button[@name = 'update_cart']");
	public By checkOutButton = By.xpath("//a[contains(@class,  'checkout-button')]");
}
