package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListingPage_SortBy extends BaseClass {
	ListingPageObject listingPage;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(5000);
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickOnEngineeringNITDropDown();
		listingPage = new ListingPageObject(driver);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// Check if the sort by dropdown is clicked

	@Test(priority = 1)
	public void cs_Verify_DropDown_Is_Clickable_0001() throws InterruptedException {

		listingPage.clickOnDropDownButton();
	}

	// Confirm if the fees dropdown is clickable.

	@Test(priority = 2)
	public void cs_Verify_feesDropDown_Is_Clickable_0002() throws InterruptedException {

		listingPage.clickOnfeesDropDownButton();
	}

	// Check if the Campus dropdown is clickable.

	@Test(priority = 3)
	public void cs_Verify_StateDropDown_Is_Clickable_0003() throws InterruptedException {

		listingPage.clickOnDropDownButton();

		listingPage.clickOnCampusDropDownButton();
	}

	// Confirm the Fees dropdown is clickable.

	@Test(priority = 4)
	public void cs_Verify_FeesDropDown_Is_Clickable_0004() throws InterruptedException {

		listingPage.clickOnDropDownButton();
		
		listingPage.clickOnfeesDropDownButton();
	}
	
	//Check if the Median Salary is Clickable
	
	@Test(priority = 5)
	
	public void cs_Verify_MedianSalary_Is_Clickable_0005() throws InterruptedException {
		
		listingPage.clickOnDropDownButton();
		
		listingPage.clickOnMedianSalaryDropDownButton();
		
	}
	
	//Check if the Placement is Clickable
	
	@Test(priority = 6)
	
	public void cs_Verify_Placement_Is_Clickable_0006() throws InterruptedException {
		
		listingPage.clickOnDropDownButton();
		
		listingPage.clickOnPlacementDropDownButton();
				
	}
	
	// Enter valid information in the search box of the listing.

	@Test(priority = 7)
	public void cs_Enter_Valid_Information_In_SearchBox_Of_Listing_0007() throws InterruptedException {

		listingPage.typeOnSearchBox();
		
	}	
	
	
	// Click on the NIT Rourkela link
	@Test(priority = 8)
	
	public void cs_Click_On_National_Institute_Of_Technology_Rourkela_Is_Clickable() throws InterruptedException {

		listingPage.clickOnNitrCollege();
		
	}	
	
	
}
