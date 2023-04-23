package utils;

import org.openqa.selenium.WebDriver;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.CartPage;
import pages.CheckoutPage;


public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage account = new MyAccountPage(driver);
	public CartPage cart = new CartPage(driver);
	public CheckoutPage order = new CheckoutPage(driver);
	
}
