package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_Footer extends BaseClass {
	HomePageObject homePage;

	// Verify if the 'Engineering' section in the footer is present.

	@Test(priority = 1)
	public void cs_Verify_EngineeringSection_In_Footer_Is_Present_0001() throws InterruptedException {
		sleep(2000);
		homePage.verifyEngineeringSectionInFooter();
	}

	// Verify if the 'Architecture' section in the footer is present.

	@Test(priority = 2)
	public void cs_Verify_ArchitectureSection_In_Footer_Is_Present_0002() throws InterruptedException {

		homePage.verifyArchitectureSectionInFooter();
	}

	// Verify if the 'Medical' section in the footer is present.

	@Test(priority = 3)
	public void cs_Verify_MedicalSection_In_Footer_Is_Present_0003() throws InterruptedException {

		homePage.verifyMedicalSectionInFooter();

	}

	// Verify if the 'Dental' section in the footer is present.

	@Test(priority = 4)
	public void cs_Verify_DentalSection_In_Footer_Is_Present_0004() throws InterruptedException {

		homePage.verifyDentalSectionInFooter();

	}

	// Verify if the 'Pharmacy' section in the footer is present.

	@Test(priority = 5)
	public void cs_Verify_PharmacySection_In_Footer_Is_Present_0005() throws InterruptedException {

		homePage.verifyPharmacySectionInFooter();

	}

	// Verify if the 'OtherLinks' section in the footer is present.

	@Test(priority = 7)
	public void cs_Verify_OtherLinksSection_In_Footer_Is_Present_0007() throws InterruptedException {

		homePage.verifyOtherLinkSectionInFooter();

	}

	// Verify if the 'FollowUs' section in the footer is present.

	@Test(priority = 8)
	public void cs_Verify_FollowUsSection_In_Footer_Is_Present_0008() throws InterruptedException {

		homePage.verifyFollowUsSectionInFooter();

	}

	// Click Engineering College in footer, go to home.

	@Test(priority = 9)
	public void cs_Verify_EngineeringCollegeLink_In_Footer_Is_Clickable_0009() throws InterruptedException {
		
		homePage.clickOnPrivateEngineeringCollegeFooter();
	}

	// Click Architecture College in footer, go to home.

	@Test(priority = 10)
	public void cs_Verify_ArchitectureCollegeLink_In_Footer_Is_Clickable_0010() throws InterruptedException {

		homePage.clickOnGovermentArchitectureFooterLink();

	}

	// Click Medical College in footer, go to home.

	@Test(priority = 11)
	public void cs_Verify_MedicalCollegeLink_In_Footer_Is_Clickable_0011() throws InterruptedException {

		homePage.clickOnGovermentMedicalFooterlink();

	}

	// Click Dental College in footer, go to home.

	@Test(priority = 12)
	public void cs_Verify_DentalCollegeLink_In_Footer_Is_Clickable_0012() throws InterruptedException {

		homePage.clickOnPrivateDentalFooterlink();

	}

	// Click Pharmacy College in footer, go to home.

	@Test(priority = 13)
	public void cs_Verify_PharmacyCollegeLink_In_Footer_Is_Clickable_0013() throws InterruptedException {

		homePage.clickOnPrivatePharmacyFooterlink();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
		homePage = new HomePageObject(driver);
	}
}
