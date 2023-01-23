package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testid_001 extends BaseClass1 {
	@Test
	public void ToclickonSortBy() {
		BasePage b1=new BasePage(driver);
		b1.getSortBy().click();
		Reporter.log("clicked",true);
	}
	

}
