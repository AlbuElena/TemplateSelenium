package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BreakfastDairyPage extends SeleniumWrappers{

	public BreakfastDairyPage(WebDriver driver) {
		super(driver);
	}
	
	public By vitalFarmsPasture = By.xpath("//a[@title = 'Vital Farms Pasture-Raised Egg Bites Bacon & Cheddar']");

}
