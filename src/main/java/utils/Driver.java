package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
	
	//ThreadLocal
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is : CHROME");
			driver.set(new ChromeDriver(getChromeoptions()));
			//long chromeId = Thread.currentThread().threadId();
			//Log.info("Chrome =--> Thread.id = " + chromeId);
			return driver.get();
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			Log.info("Browser parameter is : FIREFOX");
			driver.set(new FirefoxDriver(getFirefoxOptions()));
			//long firefoxId = Thread.currentThread().threadId();
			//Log.info("Firefox =--> Thread.id = " + firefoxId);
			return driver.get();			
			
		}else if(browser.equalsIgnoreCase("edge")) {
			Log.info("Browser parameter is : EDGE");
			driver.set(new EdgeDriver(getEdgeOptions()));
			//long edgeId = Thread.currentThread().threadId();
			//Log.info("Edge =--> Thread.id = " + edgeId);
			return driver.get();			
			
		}
		return driver.get();
	}
	
	public static FirefoxOptions getFirefoxOptions() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		//firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		firefoxOptions.addArguments("--headless"); //asa era inainte
		
		return firefoxOptions;
	}
	
	public static ChromeOptions getChromeoptions() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--window-size=1580, 1280");
		
		return chromeOptions;
	}
	
	public static EdgeOptions getEdgeOptions() {
		EdgeOptions edgeOptions =  new EdgeOptions();
		//edgeOptions.addArguments("--headless");
		edgeOptions.addArguments("--window-size=1580, 1280");
		
		return edgeOptions;
	}
  
}
