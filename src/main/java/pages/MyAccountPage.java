package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MyAccountPage extends SeleniumWrappers {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public By username = By.xpath("//input[@id = 'username']");
	public By password = By.xpath("//input[@id = 'password']");
	public By loginBttn = By.xpath("//button[@name= 'login']");
	public By checkLoginText = By.xpath("//div[@class = 'woocommerce-MyAccount-content']/child::p");
	

}
