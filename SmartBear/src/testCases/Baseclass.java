package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baseclass {
	public WebDriver driver;

	@BeforeClass
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window Maximized",true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/books");
		Reporter.log("application opened",true);

	}
	@AfterClass
	public void quitbrowser() {
		driver.quit();
		Reporter.log("application is closed",true);
	}

}
