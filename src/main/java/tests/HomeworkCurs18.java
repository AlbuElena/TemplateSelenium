package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseTest;

public class HomeworkCurs18 extends BaseTest{
	
	@Parameters({"user", "pass"})
	@Test (priority = 1)
	public void login(String username, String password) {	
		app.click(app.menu.loginLink);
		app.sendKeys(app.account.username, username);
		app.sendKeys(app.account.password, password);
		app.click(app.account.loginBttn);
		assertTrue(app.account.elementIsDisplayed(app.account.checkLoginText));	
	}
	
	@Test (priority = 2)
	public void emptyBasket() throws InterruptedException  {
		app.click(app.menu.shoppingBag);
		List<WebElement> removeProductFromBag = driver.findElements(app.cart.removeProduct);
		int nr = removeProductFromBag.size();
		while (nr>0) {
            removeProductFromBag.get(0).click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class = 'blockUI blockOverlay']"))))  ;  
            removeProductFromBag = driver.findElements(app.cart.removeProduct);
            nr = removeProductFromBag.size();
		}		
	}
	
	@Test (priority = 3)
	public void wishlist()  {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		app.menu.selectCategory(app.menu.fruitsCateg);
		app.click(app.fruits.freshProduceMelonsEach);
		js.executeScript("window.scrollBy(0,250)", "");
		app.productDetails.addElementToWishlist();

		app.menu.selectCategory(app.menu.breakfastCateg);
		app.click(app.breakfast.vitalFarmsPasture);
		js.executeScript("window.scrollBy(0,250)", "");
		app.productDetails.addElementToWishlist();

		app.menu.selectCategory(app.menu.biscuitsCateg);
		app.click(app.biscuits.shimmer);
		js.executeScript("window.scrollBy(0,250)", "");
		app.productDetails.addElementToWishlist();

		app.menu.selectCategory(app.menu.beveragesCateg);
		app.click(app.beverages.zeviaKids);
		js.executeScript("window.scrollBy(0,250)", "");
		app.productDetails.addElementToWishlist();

		app.click(app.menu.wishlistLink);
		app.elementIsDisplayed(app.wishlist.zeviaKidsProduct);
		app.elementIsDisplayed(app.wishlist.shimmerProduct);
		app.elementIsDisplayed(app.wishlist.vitalFarmsProduct);
		app.elementIsDisplayed(app.wishlist.melonsProduct);
		List<WebElement> addToCartButtons = driver.findElements(app.wishlist.addToCartButton);
		for(int i = 0; i<4; i++) {
            assertTrue(addToCartButtons.get(i).isDisplayed());
		}
		app.click(app.wishlist.checkAll);
		app.click(app.wishlist.productActions);
		app.click(app.wishlist.addToCartOption);
		app.click(app.wishlist.applyActionButton);
		assertEquals(driver.findElement(app.wishlist.cartCountIcon).getText(), "3");
		assertEquals(driver.findElement(app.wishlist.ZeviaAlert).getText(), "Product “Zevia Kidz Strawberry Lemonade Zero Calorie Soda” could not be added to cart because some requirements are not met.");
	}

}
