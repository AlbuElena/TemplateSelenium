package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	public By loginLink = By.linkText("My account");
	public By searchProduct = By.xpath("//input[@id = 'dgwt-wcas-search-input-1']");
	public By PretzelsResult = By.xpath("//span[@class = 'dgwt-wcas-st-title']");
	public By blogLink = By.xpath("//nav[contains(@class,' horizontal')]//a[@href = 'https://keyfood.ro/blog/']");
	public By allCategories = By.xpath("//a[@data-target = '#all-categories']");
	public By fruitsCateg = By.xpath("//ul[@id = 'menu-sidebar-menu']//li//a[@href = 'https://keyfood.ro/product-category/fruits-vegetables/']");
	public By breakfastCateg = By.xpath("//ul[@id = 'menu-sidebar-menu']//li//a[@href = 'https://keyfood.ro/product-category/breakfast-dairy/']");
	public By biscuitsCateg = By.xpath("//ul[@id = 'menu-sidebar-menu']//li//a[@href = 'https://keyfood.ro/product-category/biscuits-snacks/']");
	public By beveragesCateg = By.xpath("//ul[@id = 'menu-sidebar-menu']//li//a[@href = 'https://keyfood.ro/product-category/beverages/']");
	public By wishlistLink = By.linkText("Wishlist");
	public By shoppingBag = By.xpath("//i[@class = 'klbth-icon-shopping-bag']");
	
	public void selectCategory(By locator) {
		driver.findElement(allCategories).click();
		driver.findElement(locator).click();
	}
	
	
	

}
