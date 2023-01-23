package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_009 extends BaseClass1 {
	@Test
	public void clickOnWishList() throws InterruptedException {
		BasePage b1=new BasePage(driver);
		b1.getShpngcrt().click();
		Thread.sleep(1000);
		Reporter.log("user is able to click on shopping cart button", true);
		
	}
		
	}


