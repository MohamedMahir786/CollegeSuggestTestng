package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_SearchBox extends BaseClass {
	HomePageObject homePage;

	// Verify the presence of the search icon.

	@Test(priority = 1)

	public void cs_Verify_SearchIcon_Presence_0001() throws InterruptedException {
		sleep(2000);
		homePage.verifySearchIcon();

	}

	// Verify the presence of the search box placeholder.

	@Test(priority = 2)

	public void cs_Verify_SearchBoxPlaceholder_Presence_0002() throws InterruptedException {

		homePage.verifyplaceHolderSearchBox();

	}

	// Verify the display of the banner.

	@Test(priority = 3)
	public void cs_Verify_Banner_Display_0003() throws InterruptedException {

		homePage.verifyBanner();
	}

	// Enter valid information into the search box.

	@Test(priority = 4)
	public void cs_Enter_Valid_Information_In_SearchBox_0004() throws InterruptedException {

		homePage.typeOnSearchBox();

	}
	
	//Check iitm college is clickable.
	
	@Test(priority = 5)

	public void cs_Verify_IITM_College_Is_Clickable_0005() throws InterruptedException {
		homePage.clickOnIndianInstituteOfTechnologyMadras();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
		homePage = new HomePageObject(driver);
	}
}
