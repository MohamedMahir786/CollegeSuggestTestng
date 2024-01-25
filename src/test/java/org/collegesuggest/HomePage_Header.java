package org.collegesuggest;

import java.awt.AWTException;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_Header extends BaseClass {
	HomePageObject homePage;

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
		homePage = new HomePageObject(driver);
	}

	// Verify if the College Suggest logo is displayed in the header.

	@Test(priority = 1)
	public void cs_Verify_CollegeSuggest_Logo_Is_Displayed_0001() throws InterruptedException {
		sleep(4000);
		homePage.verifyHeaderCollegeSuggestLogo();
	}

	// Check if the "Home" button is displayed in the header.

	@Test(priority = 2)
	public void cs_Verify_HomeButton_Is_Available_In_Header_0002() throws InterruptedException {

		homePage.verifyHomeButton();
	}

	// Verify if the "Engineering" button is present in the header.

	@Test(priority = 3)
	public void cs_Verify_EngineeringButton_Is_Available_In_Header_0003() throws InterruptedException {

		homePage.verifyEngineeringButton();
	}

	// Verify if the "Medical" button is present in the header.

	@Test(priority = 4)
	public void cs_Verify_MedicalButton_Is_Available_In_Header_0004() throws InterruptedException {

		homePage.verifyMedicalButton();
	}

	// Verify if the "Dental" button is present in the header.

	@Test(priority = 5)
	public void cs_Verify_DentalButton_Is_Available_In_Header_0005() throws InterruptedException {

		homePage.verifyDentalButton();
	}

	// Verify if the "Architecture" button is present in the header.

	@Test(priority = 6)
	public void cs_Verify_ArchitectureButton_Is_Available_In_Header_0006() throws InterruptedException {

		homePage.verifyArchitectureButton();
	}

	// Verify if the "Pharmacy" button is present in the header.

	@Test(priority = 7)
	public void cs_Verify_PharmacyButton_Is_Available_In_Header_0007() throws InterruptedException {

		homePage.verifyPharmacyButton();

	}

	// Click the "Engineering College" header menu and return to the home page.

	@Test(priority = 8)
	public void cs_Verify_EngineeringCollege_Link_Is_Clickable_In_Header_0008() throws InterruptedException, AWTException {
		sleep(6000);
		homePage.clickOnEngineeringGFTIDropDown();
		
	}

	// Click the "Medical College" header menu and return to the home page.

	@Test(priority = 9)
	public void cs_Verify_MedicalCollege_Link_Is_Clickable_In_Header_0009() throws InterruptedException {
		sleep(2000);
		homePage.clickOnMedicalPrivateDropDown();

	}

	// Click the "Dental College" header menu and return to the home page.

	@Test(priority = 10)
	public void cs_Verify_DentalCollege_Link_Is_Clickable_In_Header_0010() throws InterruptedException {
		sleep(2000);
		homePage.clickOnDentalPrivateDropDown();


	}

	// Click the "Architecture College" header menu and return to the home page.

	@Test(priority = 11)
	public void cs_Verify_ArchitectureCollege_Link_Is_Clickable_In_Header_0011() throws InterruptedException {
		sleep(2000);
		homePage.clickOnArchitectureNitDropDown();

	}

	// Click the "Pharmacy College" header menu and return to the home page.

	@Test(priority = 12)
	public void cs_Verify_PharmacyCollege_Link_Is_Clickable_In_Header_0012() throws InterruptedException {
		sleep(2000);
		homePage.clickOnPharmacyPrivateDropDown();

	}
}
