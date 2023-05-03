package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ProductDetailsPage extends SeleniumWrappers{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public By addToWishlist = By.xpath("//div[@class= 'product-actions']//span[@class = 'tinvwl_add_to_wishlist-text']");
	public By closeButton = By.xpath("//button[@class = 'button tinvwl_button_close']");
	
	public void addElementToWishlist () {
		driver.findElement(addToWishlist).click();
		driver.findElement(closeButton).click();
	}
	

}
