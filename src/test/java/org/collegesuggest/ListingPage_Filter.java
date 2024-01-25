package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListingPage_Filter extends BaseClass {
	ListingPageObject listingPage;

	@BeforeClass
	public void setup() throws InterruptedException {
		// Initial setup: Wait, navigate to the Engineering dropdown, select GFTI colleges, and initialize ListingPageObject.
		sleep(5000);
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickOnEngineeringNITDropDown();
		listingPage = new ListingPageObject(driver);
	}

	@AfterClass
	public void teardown() {
		// Close the browser after all tests are executed.
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// Test to verify the presence of the filter section.
	@Test(priority = 1)
	public void cs_Verify_Filter_Section_Is_Present_0001() throws InterruptedException {
		listingPage.verifyFilterText();
	}

	// Test to verify the presence of the state section.
	@Test(priority = 2)
	public void cs_Verify_State_Section_Is_Present_0002() throws InterruptedException {
		listingPage.verifyStateText();
	}

	// Test to verify the presence of the city section.
	@Test(priority = 3)
	public void cs_Verify_City_Section_Is_Present_0003() throws InterruptedException {
		listingPage.verifyCityText();
	}

	// Test to verify the presence of the ownership section.
	@Test(priority = 4)
	public void cs_Verify_Ownership_Section_Is_Present_0004() throws InterruptedException {
		listingPage.verifyOwnerShipText();
	}

	// Test to verify the presence of the category section.
	@Test(priority = 5)
	public void cs_Verify_Category_Section_Is_Present_0005() throws InterruptedException {
		listingPage.verifyCategoryText();
	}

	// Test to verify the presence of the course section.
	@Test(priority = 6)
	public void cs_Verify_Course_Section_Is_Present_0006() throws InterruptedException {
		listingPage.verifyCourseText();
	}

	// Test to verify if the state filter for Jharkhand is clickable.
	@Test(priority = 7)
	public void cs_Verify_State_Filter_Tamilnadu_Is_Clickable_0007() throws InterruptedException {
		listingPage.clickOnStateFilterTamilnadu();
	}

	// Test to verify if the ownership filter for Private is clickable.
	@Test(priority = 8)
	public void cs_Verify_Ownership_Filter_Private_Is_Clickable_0008() throws InterruptedException {
		listingPage.clickOnOwnershipGovernment();
	}

	// Test to verify if the "Clear All" filter section is clickable.
	@Test(priority = 9)
	public void cs_Verify_Clear_All_Filter_Section_Is_Clickable_0009() throws InterruptedException {
		listingPage.clickOnclearAll();
	}
}
