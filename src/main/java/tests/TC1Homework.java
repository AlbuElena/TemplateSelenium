package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class TC1Homework extends BaseTest {
	//Place an order as a registered customer
	
	@Parameters({"user", "pass"})
	@Test (priority = 1)
	public void login(String username, String password) {	
		app.click(app.menu.loginLink);
		app.sendKeys(app.account.username, username);
		app.sendKeys(app.account.password, password);
		app.click(app.account.loginBttn);
		assertTrue(app.account.messageIsDisplayed(app.account.checkLoginText));	
		//app.sendKeys(app.menu.searchProduct,  "Pretzels");
	}
	
	@Test (priority = 2)
	public void findAndNavigateToProduct() {		
		app.sendKeys(app.menu.searchProduct,  "Pretzels");
		app.click(app.menu.PretzelsResult);
	}
	
	@Test (priority = 3)
	public void placeAndUpdateOrder() throws InterruptedException{	
		app.click(app.cart.addToCart);
		assertTrue(app.cart.messageIsDisplayed(app.cart.checkAlertAddedToCart));
		app.click(app.cart.viewCart);
		app.click(app.cart.plusButton);
		
		Thread.sleep(4000); //bad practice, dar nu am reusit sa astept pana cand 'Update cart' devine dezablat

		assertEquals(app.round(Float.parseFloat(app.productPrice(app.cart.totalPrice)), 2), 5.98);	
		app.click(app.cart.checkOutButton);
		
	}
	
	@Test (priority = 4)
	public void placeOrder() throws InterruptedException {
		/*optional
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		*/
			/*asta nu a functionat, asa ca am recurs la thread.sleep :(
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(app.order.terms));
			*/
		Thread.sleep(4000);
		app.click(app.order.terms);
		app.click(app.order.placeOrderButton);
	}
	
}
