package org.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPageObject {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/p[1]")
	WebElement nationalInstituteofTechnologyTiruchirappalli;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/div[3]/p")
	WebElement overviewText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/p")
	WebElement nitTrichyOverviewText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/p")
	WebElement otherCollegesText;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Read More'])[1]")
	WebElement readMoreButton;

	@FindBy(xpath = "//span[contains(text(),'The National Institute of Technology is a public t')]")
	WebElement readMoreContent;

	@FindBy(xpath = "//button[normalize-space()='Read Less']")
	WebElement readLessButton;

	@FindBy(xpath = "//p[normalize-space()='NIT Trichy Highlights']")
	WebElement nitTrichyHighlightsText;

	@FindBy(xpath = "//p[normalize-space()='Ranked in NIRF']")
	WebElement rankedInNIRF;

	@FindBy(xpath = "//p[normalize-space()='UG Median Salary']")
	WebElement ugMedianSalary;

	@FindBy(xpath = "//p[normalize-space()='Ownership']")
	WebElement ownerShip;

	@FindBy(xpath = "//p[normalize-space()='Genders Accepted']")
	WebElement gendersAccepted;

	@FindBy(xpath = "//p[normalize-space()='Estd. Year']")
	WebElement estdYear;

	@FindBy(xpath = "//p[normalize-space()='Campus Size']")
	WebElement campusSize;

	@FindBy(xpath = "//p[normalize-space()='Total Faculty']")
	WebElement totalFaculty;

	@FindBy(xpath = "//p[normalize-space()='Total Approved Intake']")
	WebElement totalApprovedIntake;

	@FindBy(xpath = "//p[normalize-space()='NIT Trichy Placement and Salary Trends']")
	WebElement nitTrichyPlacementandSalaryTrends;

	@FindBy(xpath = "//p[normalize-space()='Total Offers']")
	WebElement totalOffers;

	@FindBy(xpath = "//p[normalize-space()='Max Package']")
	WebElement maxPackage;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div[2]/div/div[4]/a/p")
	WebElement viewallPlacement;

	@FindBy(xpath = "//a[normalize-space()='Overview']")
	WebElement overViewSubMenu;

	@FindBy(xpath = "//p[normalize-space()='NIT Trichy Top Courses & Fees']")
	WebElement nitTrichyTopCourses;

	public OverviewPageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyNationalInstituteofTechnologyTiruchirappalli() throws InterruptedException {

		if (nationalInstituteofTechnologyTiruchirappalli.isDisplayed()) {
			System.out.println("Success ::  The 'National Institute of Technology Tiruchirappalli ' text is displayed");

		} else {
			System.out
					.println("Error ::  The 'National Institute of Technology Tiruchirappalli' text is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyOverviewText() throws InterruptedException {
		Thread.sleep(2000);

		if (overviewText.isDisplayed()) {
			System.out.println("Success ::  The 'Over View ' text is displayed");

		} else {
			System.out.println("Error ::  The 'Over View' text is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyNitTrichyOverview() throws InterruptedException {
		Thread.sleep(2000);

		if (nitTrichyOverviewText.isDisplayed()) {
			System.out.println("Success ::  The 'NIT Trichy Overview ' text is displayed");

		} else {
			System.out.println("Error ::  The 'NIT Trichy Overview' text is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyOtherColleges() throws InterruptedException {
		Thread.sleep(2000);

		if (otherCollegesText.isDisplayed()) {
			System.out.println("Success ::  The 'Other Colleges ' text is displayed");

		} else {
			System.out.println("Error ::  The 'Other Colleges' text is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyReadMoreButton() throws InterruptedException {
		Thread.sleep(2000);

		if (readMoreButton.isDisplayed()) {
			System.out.println("Success ::  The 'Read More' button is present ");

		} else {
			System.out.println("Error ::   The 'Read More' button is not present");
		}
		System.out.println("****************************************");
	}

	public void clickOnReadMoreButton() throws InterruptedException {

		Thread.sleep(2000);
		scrollandclick(readMoreButton);
		try {
			System.out.println("Success ::  The 'Read More' button is clicked ");
		} catch (Exception e) {
			System.out.println("Error ::   The 'Read More' button is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyReadMoreContent() throws InterruptedException {
		Thread.sleep(2000);

		if (readMoreButton.isDisplayed()) {
			System.out.println("Success ::  The 'Read More' content is present ");

		} else {
			System.out.println("Error ::   The 'Read More' content is not present");
		}
		System.out.println("****************************************");
	}

	public void clickOnReadLessButton() throws InterruptedException {

		Thread.sleep(2000);
		readLessButton.click();
		try {
			System.out.println("Success ::  The 'Read Less' button is clicked ");
		} catch (Exception e) {
			System.out.println("Error ::   The 'Read Less' button is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyNitTrichyHighlights() throws InterruptedException {
		Thread.sleep(2000);

		if (nitTrichyHighlightsText.isDisplayed()) {
			System.out.println("Success ::  The 'Nit Trichy Highlights' text is present ");

		} else {
			System.out.println("Error :: The 'Nit Trichy Highlights' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyRankedInNIRF() throws InterruptedException {
		Thread.sleep(2000);

		if (rankedInNIRF.isDisplayed()) {
			System.out.println("Success ::  The 'Ranked in NIRF' text is present ");

		} else {
			System.out.println("Error :: The 'Ranked in NIRF' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyUGMedianSalary() throws InterruptedException {
		Thread.sleep(2000);

		if (ugMedianSalary.isDisplayed()) {
			System.out.println("Success ::  The 'UG Median Salary' text is present ");

		} else {
			System.out.println("Error :: The 'UG Median Salary' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyOwnership() throws InterruptedException {
		Thread.sleep(2000);

		if (ownerShip.isDisplayed()) {
			System.out.println("Success ::  The 'Ownership' text is present ");

		} else {
			System.out.println("Error :: The 'Ownership' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyGendersAccepted() throws InterruptedException {
		Thread.sleep(2000);

		if (gendersAccepted.isDisplayed()) {
			System.out.println("Success ::  The 'Genders Accepted' text is present ");

		} else {
			System.out.println("Error :: The 'Genders Accepted' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyEstdYear() throws InterruptedException {
		Thread.sleep(2000);

		if (estdYear.isDisplayed()) {
			System.out.println("Success ::  The 'Estd. Year' text is present ");

		} else {
			System.out.println("Error :: The 'Estd. Year' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyCampusSize() throws InterruptedException {
		Thread.sleep(2000);

		if (campusSize.isDisplayed()) {
			System.out.println("Success ::  The 'Campus Size' text is present ");

		} else {
			System.out.println("Error :: The 'Campus Size' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyTotalFaculty() throws InterruptedException {
		Thread.sleep(2000);

		if (totalFaculty.isDisplayed()) {
			System.out.println("Success ::  The 'Total Faculty' text is present ");

		} else {
			System.out.println("Error :: The 'Total Faculty' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyTotalApprovedIntake() throws InterruptedException {
		Thread.sleep(2000);

		if (totalApprovedIntake.isDisplayed()) {
			System.out.println("Success ::  The 'Total Approved Intake' text is present ");

		} else {
			System.out.println("Error :: The 'Total Approved Intake' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyNITTrichyPlacementandSalaryTrends() throws InterruptedException {
		Thread.sleep(2000);

		if (nitTrichyPlacementandSalaryTrends.isDisplayed()) {
			System.out.println("Success ::  The 'NIT Trichy Placement and Salary Trends' text is present ");

		} else {
			System.out.println("Error :: The 'NIT Trichy Placement and Salary Trends' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyTotalOffer() throws InterruptedException {
		Thread.sleep(2000);

		if (totalOffers.isDisplayed()) {
			System.out.println("Success ::  The 'Total Offers' text is present ");

		} else {
			System.out.println("Error :: The 'Total Offers' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyMaxPackage() throws InterruptedException {
		Thread.sleep(2000);

		if (maxPackage.isDisplayed()) {
			System.out.println("Success ::  The 'Max Package' text is present ");

		} else {
			System.out.println("Error :: The 'Max Package' text is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyOnPlacementViewAll() throws InterruptedException {
		Thread.sleep(2000);

		if (viewallPlacement.isDisplayed()) {
			System.out.println("Success :: 'View All' in placement is present ");

		} else {
			System.out.println("Error :: 'View All' in placement is not present");
		}
		System.out.println("****************************************");
	}

	public void clickOnPlacementViewAll() throws InterruptedException {
		Thread.sleep(2000);

		scrollandclick(viewallPlacement);
		try {
			System.out.println("Success ::  The 'View All' button of NIT Trichy Placement and Salary Trends clicked ");
		} catch (Exception e) {
			System.out
					.println("Error ::   The 'View All' button of NIT Trichy Placement and Salary Trends not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnOverviewSubMenu() throws InterruptedException {
		Thread.sleep(2000);
		overViewSubMenu.click();
		try {
			System.out.println("Success ::  The 'Over View' sub menu header is clicked ");
		} catch (Exception e) {
			System.out.println("Error :: The 'Over View' sub menu header is not clicked ");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyNitTrichyTopCourses() throws InterruptedException {
		Thread.sleep(2000);

		if (nitTrichyTopCourses.isDisplayed()) {
			System.out.println("Success :: 'NIT Trichy Top Courses & Fees'highlight text is present ");

		} else {
			System.out.println("Error :: 'NIT Trichy Top Courses & Fees'highlight text is present ");
		}
		System.out.println("****************************************");
	}

	private void scrollandclick(WebElement scroll) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object element = scroll;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		Thread.sleep(3000);
		((WebElement) element).click();
		Thread.sleep(3000);

	}

}
