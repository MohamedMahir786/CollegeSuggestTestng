package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.pageobject.OverviewPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverviewPage_CollegeInner extends BaseClass {   

	HomePageObject homePage;
	ListingPageObject listingPage;
	OverviewPageObject overviewPage;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(5000);
		homePage = new HomePageObject(driver);
		homePage.clickOnEngineeringNITDropDown();
		listingPage = new ListingPageObject(driver);
		listingPage.clickOnNittCollege();
		sleep(2000);
		overviewPage = new OverviewPageObject(driver);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	@Test(priority = 1)

	public void cs_Click_On_NationalInstituteOfTechnologyTiruchirappalli_0001() throws InterruptedException {

		overviewPage.verifyNationalInstituteofTechnologyTiruchirappalli();
		sleep(4000);
	}

	@Test(priority = 2)

	public void cs_Verify_Overview_Text_Is_Present_0002() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyOverviewText();
	}

	@Test(priority = 3)

	public void cs_Verify_NITTrichyOverview_Is_Present_0003() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyNitTrichyOverview();
	}

	@Test(priority = 4)
	public void cs_Verify_OtherColleges_Is_Present_0004() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyOverviewText();
	}

	@Test(priority = 5)
	public void cs_Verify_ReadMore_Button_Is_Present_0005() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyReadMoreButton();
	}

	@Test(priority = 6)
	public void cs_Click_On_ReadMore_Button_0006() throws InterruptedException {
//		sleep(2000);
		overviewPage.clickOnReadMoreButton();
	}

	@Test(priority = 7)
	public void cs_Verify_ReadMore_Content_0007() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyReadMoreContent();
	}

	@Test(priority = 8)
	public void cs_Click_On_ReadMore_Button_0008() throws InterruptedException {
//		sleep(2000);
		overviewPage.clickOnReadLessButton();
	}

	@Test(priority = 9)
	public void cs_Verify_NitTrichyHighlights_Is_Present_0009() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyNitTrichyHighlights();
	}

	@Test(priority = 10)
	public void cs_Verify_RankedInNIRF_Is_Present_0010() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyRankedInNIRF();
	}

	@Test(priority = 11)
	public void cs_Verify_UGMedianSalary_Is_Present_0011() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyUGMedianSalary();
	}

	@Test(priority = 12)
	public void cs_Verify_Ownership_Is_Present_0012() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyOwnership();
	}

	@Test(priority = 13)
	public void cs_Verify_GendersAccepted_Is_Present_0013() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyGendersAccepted();
	}

	@Test(priority = 14)
	public void cs_Verify_EstdYear_Is_Present_0014() throws InterruptedException {
		sleep(2000);
		overviewPage.verifyEstdYear();
	}

	@Test(priority = 15)
	public void cs_Verify_CampusSize_Is_Present_0015() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyCampusSize();
	}

	@Test(priority = 16)
	public void cs_Verify_TotalFaculty_Is_Present_0016() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyTotalFaculty();
	}

	@Test(priority = 17)
	public void cs_Verify_TotalApprovedIntake_Is_Present_0017() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyTotalApprovedIntake();
	}

	@Test(priority = 18)
	public void cs_Verify_NITTrichyPlacementandSalaryTrends_Is_Present_0018() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyNITTrichyPlacementandSalaryTrends();
	}

	@Test(priority = 19)
	public void cs_Verify_TotalOffers_Is_Present_0019() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyTotalOffer();
	}

	@Test(priority = 20)
	public void cs_Verify_MaxPackage_Is_Present_0020() throws InterruptedException {
//		sleep(2000);
		overviewPage.verifyMaxPackage();
	}
	
	@Test(priority = 21)
	public void cs_Verify_Placement_Viewall_Is_Present_0021() throws InterruptedException {
		overviewPage.verifyOnPlacementViewAll();
	}
	
	
	@Test(priority = 22)
	public void cs_Verify_Placement_Viewall_Button_Is_Clicked_0022() throws InterruptedException {
		overviewPage.clickOnPlacementViewAll();
	}
	
	
	
	@Test(priority = 23)
	public void cs_Click_On_Submenu_Of_Overview_0023() throws InterruptedException {
//		sleep(2000);
		overviewPage.clickOnOverviewSubMenu();
	}
	
	@Test(priority = 24)
	public void cs_Verify_Nit_TopCourses_0024() throws InterruptedException {
		overviewPage.verifyNitTrichyTopCourses();
		sleep(5000);
	}
	
	
}
