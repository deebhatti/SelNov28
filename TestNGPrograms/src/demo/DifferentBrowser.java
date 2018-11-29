package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DifferentBrowser {
	
	@Test
	public void openBrowser(){
//		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

}
