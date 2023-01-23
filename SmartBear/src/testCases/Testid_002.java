package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testid_002 extends BaseClass1 {
	@Test
	public void clickonBestSellers() {
		BasePage b2=new BasePage(driver);
		b2.getBestsellerpge().click();
		Reporter.log("clicked",true);
		//assertEquals(null, null, null);
			
			
		}
		
	}


