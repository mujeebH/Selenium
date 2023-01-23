package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_008 extends BaseClass1 {
	@Test
	public void clickOnWishList() throws InterruptedException {
		BasePage b1=new BasePage(driver);
		b1.getWish1().click();
		Thread.sleep(1000);
		Reporter.log("succesfully clicked", true);
	}
		
	}


