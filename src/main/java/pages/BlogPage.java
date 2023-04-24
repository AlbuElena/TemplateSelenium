package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers{
	
	public BlogPage(WebDriver driver) {
		super(driver);
	}
	
	//public By blogs = By.xpath("//a[@class = 'button']");

	public By blog1 = By.xpath("//article[@id = 'post-1035']//h2//a[contains(@href, 'mistaken')]");
	public By blog2 = By.xpath("//article[@id = 'post-1023']//h2//a[contains(@href, 'typefaces')]");
	public By blog3 = By.xpath("//article[@id = 'post-1759']//h2//a[contains(@href, 'donut')]");
	public By blog4 = By.xpath("//article[@id = 'post-1033']//h2//a[contains(@href, 'denounce')]");
	
	public By comment = By.xpath("//textarea[@id = 'comment']");
	public By name = By.xpath("//input[@id = 'author']");
	public By email = By.xpath("//input[@id = 'email']");
	public By postCommentButton = By.xpath("//input[@id = 'submit']");
	public By confirmComment = By.xpath("//div[@class = 'klb-post']//em");
	
	public ArrayList<WebElement> lista = new ArrayList<WebElement>();
	
	
}
