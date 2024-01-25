package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;


public class HomePage_WatchOut extends BaseClass {
	HomePageObject homePage;

	// Verify if the 'Watch Out' heading is present on the page.

	@Test(priority = 1)
	public void cs_Verify_WatchOutHeading_Is_Present_0001() throws InterruptedException {
		sleep(5000);
		homePage.verifyHeadingWatchOut();
	}

	// Verify if the 'Nit Durgapur Campus Tour' video in the 'Watch Out' section is clickable.

	@Test(priority = 2)
	public void cs_Verify_NitDurgapurWatchOutVideo_Is_Clickable_0002() throws InterruptedException {
		sleep(3000);
		homePage.clickOnNitDurgapurOverview();
	}


	// Verify if the 'NIT Nagpur Watch Out Video' in the 'Watch Out' section is clickable.

	@Test(priority = 3)
	public void cs_Verify_NitNagpurWatchOutVideo_Is_Clickable_0004() throws InterruptedException {
		sleep(3000);
		homePage.clickOnNitNagpurCampusTour();
	}

	// Verify if the 'View All' button is clickable.

	@Test(priority = 4)
	public void cs_Verify_ViewAllButton_Is_Clickable_0005() throws InterruptedException {
		sleep(3000);
		homePage.clickOnViewAllButton();
	}
	
	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
		homePage = new HomePageObject(driver);
	}
}
