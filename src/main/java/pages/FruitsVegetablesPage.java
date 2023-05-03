package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class FruitsVegetablesPage extends SeleniumWrappers{

	public FruitsVegetablesPage(WebDriver driver) {
		super(driver);
		}
	
	public By freshProduceMelonsEach = By.xpath("//a[@title = 'Fresh Produce Melons Each']");


}
