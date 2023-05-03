package tests;

import org.testng.annotations.Test;
import utils.BaseTest;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

public class TC2Homework extends BaseTest{
	
	@Test (priority =1)
	public void navigateToBlog() {
		app.click(app.menu.blogLink);	
	}
	
	@Test (priority =2)
	public void checkBlogs() {
		assertTrue(app.elementIsDisplayed(app.blog.blog1));
			//if(app.messageIsDisplayed(app.blog.blog4)) {System.out.println("1");}; // verificari pt mine
		assertTrue(app.elementIsDisplayed(app.blog.blog2));
			//if(app.messageIsDisplayed(app.blog.blog4)) {System.out.println("2");};
		assertTrue(app.elementIsDisplayed(app.blog.blog3));
			//if(app.messageIsDisplayed(app.blog.blog4)) {System.out.println("3");};
		assertTrue(app.elementIsDisplayed(app.blog.blog4));
			//if(app.messageIsDisplayed(app.blog.blog4)) {System.out.println("4");};			
	}
	
	/*
	// nu funtioneaza pt bu face click poe Blog si deci nu gaseste al doilea blog din lista: xpath: //article[@id = 'post-1023']//h2//a[contains(@href, 'typefaces')]]
	@Test (priority =3)
	public void postCommentInBlogs() throws InterruptedException {
			app.blog.lista.add(app.getElement(app.blog.blog1));
			app.blog.lista.add(app.getElement(app.blog.blog2));
			app.blog.lista.add(app.getElement(app.blog.blog3));
			app.blog.lista.add(app.getElement(app.blog.blog4));
											
	for(int i=0; i<4; i++) {
		Thread.sleep(4000);
		app.blog.lista.get(i).click();  
		System.out.println("aaaaa");
		app.sendKeys(app.blog.comment, "Mesajul meu este: " + i);
		app.sendKeys(app.blog.name, "Acesta este numele meu");
		app.sendKeys(app.blog.email, "myEmail@abc.com");
	    app.click(app.blog.postCommentButton);
	    assertTrue(app.messageIsDisplayed(app.blog.confirmComment));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(4000);
		app.click(app.menu.blogLink);	
		}
	}
	*/

	@Test (priority =4)
	public void postCommentInBlog1() {
		app.click(app.menu.blogLink);	
		app.click(app.blog.blog1);
		app.sendKeys(app.blog.comment, "Mesaj blog1 : ");
		app.sendKeys(app.blog.name, "Acesta este numele meu");
		app.sendKeys(app.blog.email, "myEmail@abc.com");
		app.click(app.blog.postCommentButton);
		assertTrue(app.elementIsDisplayed(app.blog.confirmComment));
	}
	
	@Test (priority =5)
	public void postCommentInBlog2() {
		app.click(app.menu.blogLink);	
		app.click(app.blog.blog2);
		app.sendKeys(app.blog.comment, "Mesaj blog2 : ");
		app.sendKeys(app.blog.name, "Acesta este numele meu");
		app.sendKeys(app.blog.email, "myEmail@abc.com");
		app.click(app.blog.postCommentButton);
		assertTrue(app.elementIsDisplayed(app.blog.confirmComment));
	}
	
	@Test (priority =6)
	public void postCommentInBlog3() {
		app.click(app.menu.blogLink);	
		app.click(app.blog.blog3);
		app.sendKeys(app.blog.comment, "Mesaj blog3 : ");
		app.sendKeys(app.blog.name, "Acesta este numele meu");
		app.sendKeys(app.blog.email, "myEmail@abc.com");
		app.click(app.blog.postCommentButton);
		assertTrue(app.elementIsDisplayed(app.blog.confirmComment));
	}
	
	@Test (priority =7)
	public void postCommentInBlog4() {
		app.click(app.menu.blogLink);	
		app.click(app.blog.blog4);
		app.sendKeys(app.blog.comment, "Mesaj blog4 : ");
		app.sendKeys(app.blog.name, "Acesta este numele meu");
		app.sendKeys(app.blog.email, "myEmail@abc.com");
		app.click(app.blog.postCommentButton);
		assertTrue(app.elementIsDisplayed(app.blog.confirmComment));
	}

}
