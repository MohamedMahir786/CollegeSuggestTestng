package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_ExploreCareers extends BaseClass {
	HomePageObject homePage;

	// Verify the presence of the 'Explore Careers' section heading.

	@Test(priority = 1)

	public void cs_Verify_ExploreCareersSection_Heading_Is_Present_0001() throws InterruptedException {
		sleep(2000);
		homePage.verifyHeadingExploreCareers();
	}

	// Verify the presence of the 'Top Colleges in India' heading.

	@Test(priority = 2)

	public void cs_Verify_TopCollegeInIndia_Heading_Is_Present_0002() throws InterruptedException {
		sleep(2000);
		homePage.verifyHeadingTopCollegeInIndia();
	}

	// Verify the presence of the 'Top Places In India to study' heading.

	@Test(priority = 3)

	public void cs_Verify_TopPlacesInIndiaToStudy_Heading_Is_Present_0003() throws InterruptedException {

		homePage.verifyHeadingTopPlaceInIndiaToStudy();
	}

	// Verify the presence of the 'Top Courses to study' heading.

	@Test(priority = 4)

	public void cs_Verify_TopCoursesToStudy_Heading_Is_Present_0004() throws InterruptedException {

		homePage.verifyHeadingTopCoursesToStudy();

	}

	// Verify that the 'Top Colleges in India' link is clickable.

	@Test(priority = 5)

	public void cs_Verify_TopCollegeInIndia_Is_Clickable_0005() throws InterruptedException {

		homePage.clickOnTopCollegeInIndia();
	}

	// Verify that the 'Top Places In India to study' link is clickable.

	@Test(priority = 6)

	public void cs_Verify_TopPlacesInIndiaToStudy_Is_Clickable_0006() throws InterruptedException {
		sleep(2000);
		homePage.clickOnTopPlaceInIndiaToStudy();
	}

	// Verify that the 'Top Courses to study' link is clickable.

	@Test(priority = 7)
	public void cs_Verify_TopCoursesToStudy_Is_Clickable_0007() throws InterruptedException {

		homePage.clickOnTopCoursesToStudy();

	}

	@Test(priority = 8)

	public void cs_Verify_TopDentalColleges_Is_Clickable_0008() throws InterruptedException {

		homePage.clickOntopDentalColleges();

	}

	@Test(priority = 9)

	public void cs_Verify_CollegesInBanglore_Is_Clickable_0009() throws InterruptedException {
		homePage.clickOnCollegesInBanglore();
	}

	@Test(priority = 10)

	public void cs_Verify_AeronauticalEngineering_Is_Clickable_0010() throws InterruptedException {
		sleep(2000);
		homePage.clickOnAeronauticalEngineering();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
		homePage = new HomePageObject(driver);
	}
}
