package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BiscuitsSnacksPage extends SeleniumWrappers{

	public BiscuitsSnacksPage(WebDriver driver) {
		super(driver);
	}
	
	public By shimmer = By.xpath("//a[@title = 'Shimmer Pastel Almond Blend']");

}
