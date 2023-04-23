package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public By terms = By.xpath("//span[@class = 'woocommerce-terms-and-conditions-checkbox-text']");
	public By placeOrderButton = By.xpath("//button[@id = 'place_order']");


}
