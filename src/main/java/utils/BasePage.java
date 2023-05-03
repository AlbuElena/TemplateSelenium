package utils;

import org.openqa.selenium.WebDriver;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.BlogPage;
import pages.FruitsVegetablesPage;
import pages.ProductDetailsPage;
import pages.BreakfastDairyPage;
import pages.BiscuitsSnacksPage;
import pages.BeveragesPage;
import pages.WishlistPage;
import pages.LoginPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage account = new MyAccountPage(driver);
	public CartPage cart = new CartPage(driver);
	public CheckoutPage order = new CheckoutPage(driver);
	public BlogPage blog = new BlogPage(driver);
	public LoginPage login = new LoginPage(driver);
	public FruitsVegetablesPage fruits = new FruitsVegetablesPage(driver);
	public ProductDetailsPage productDetails = new ProductDetailsPage(driver);
	public BreakfastDairyPage breakfast = new BreakfastDairyPage(driver);
	public BiscuitsSnacksPage biscuits = new BiscuitsSnacksPage(driver);
	public BeveragesPage beverages = new BeveragesPage(driver);
	public WishlistPage wishlist = new WishlistPage(driver);
}
