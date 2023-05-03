package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BeveragesPage extends SeleniumWrappers {

	public BeveragesPage(WebDriver driver) {
		super(driver);
	}
	
	public By zeviaKids = By.xpath("//a[@title = 'Zevia Kidz Strawberry Lemonade Zero Calorie Soda']");

}
