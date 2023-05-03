package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class WishlistPage extends SeleniumWrappers{

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	public By zeviaKidsProduct = By.xpath("//td[@class = 'product-name']//a[contains(@href, 'zevia')]");
	public By shimmerProduct = By.xpath("//td[@class = 'product-name']//a[contains(@href, 'shimmer')]");
	public By vitalFarmsProduct = By.xpath("//td[@class = 'product-name']//a[contains(@href, 'vital')]");
	public By melonsProduct = By.xpath("//td[@class = 'product-name']//a[contains(@href, 'melons')]");
	public By addToCartButton = By.xpath("//button[@name= 'tinvwl-add-to-cart']//span[@class = 'tinvwl-txt']");
	public By checkAll = By.xpath("//input[@class = 'global-cb']");
	public By productActions = By.xpath("//select[@id= 'tinvwl_product_actions']");
	public By addToCartOption = By.xpath("//option[@value = 'add_selected']");
	public By applyActionButton = By.xpath("//button[@title = 'Apply Action']");
	public By cartCountIcon = By.xpath("//span[@class = 'cart-count-icon']");
	public By ZeviaAlert = By.xpath("//ul[@role = 'alert']//li");
	

}
