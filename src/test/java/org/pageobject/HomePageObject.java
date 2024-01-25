package org.pageobject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class HomePageObject {

	WebDriver driver;

	// Objects

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchBox;

	@FindBy(xpath = "//*[@id='engineering-colleges-menu-button']")
	WebElement engineeringDropDownButton;

	@FindBy(xpath = "//*[@id='medical-colleges-menu-button']")
	WebElement medicalDropDownButton;

	@FindBy(xpath = "//*[@id='dental-colleges-menu-button']")
	WebElement dentalDropDownButton;

	@FindBy(xpath = "//*[@id='architecture-colleges-menu-button']")
	WebElement architectureDropDownButton;

	@FindBy(xpath = "//*[@id='pharmacy-colleges-menu-button']")
	WebElement pharmacyDropDownButton;

	@FindBy(xpath = "//a[@id='engineering-colleges-menu-button']//*[name()='svg']")
	WebElement engineeringMenuButton;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 IIT Colleges in india')]")
	WebElement iitCollegeEngineering;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 NIT Colleges in india')]")
	WebElement nitCollegeIndia;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 GFTI Colleges in india')]")
	WebElement engineeringGftiCollege;

	@FindBy(id = "medical-colleges-menu-button")
	WebElement medicalMenuButton;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]")
	WebElement medicalPrivateCollege;

	@FindBy(id = "dental-colleges-menu-button")
	WebElement dentalMenuButton;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 Private Colleges in india')]")
	WebElement dentalPrivateCollege;

	@FindBy(id = "architecture-colleges-menu-button")
	WebElement architectureMenuButton;

	@FindBy(xpath = "//li[@role='menuitem']//a[contains(text(),'Top 10 NIT Colleges in india')]")
	WebElement architectureNitCollege;

	@FindBy(id = "pharmacy-colleges-menu-button")
	WebElement pharmacyMenuButton;

	@FindBy(xpath = "//*[@id=\"Pharmacy-colleges-menu\"]/li[2]/a")
	WebElement pharmacyPrivateCollege;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[1]/ul/li[6]/a")
	WebElement footerLinkPrivateCollege;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/a")
	WebElement architectureCollegeFooterLink;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[1]/ul/li[1]/a")
	WebElement medicalCollegeFooterLink;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[2]/ul/li[2]/a")
	WebElement dentalCollegeFooterLink;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[3]/ul/li[2]/a")
	WebElement pharmacyCollegeFooterLink;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[1]/div/button")
	WebElement topCollegeInIndia;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/button")
	WebElement topPlaceInIndiaToStudy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[3]/div/button")
	WebElement topCoursesToStudy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[5]/div/p/div[2]/div[2]/div/div[2]/ul/li[6]/div")
	WebElement nitDurgapurOverview;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[5]/div/p/div[2]/div[2]/div/div[2]/ul/li[7]/div")
	WebElement unlockYourMedicalCollege;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[5]/div/p/div[2]/div[2]/div/div[2]/ul/li[5]/div")
	WebElement nitNagpurCampusTour;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[5]/div/p/div[2]/div[2]/div/div[1]/a")
	WebElement viewAllButton;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root css-1d3kc3b')]//div[2]")
	WebElement nextBlogButton;

	@FindBy(xpath = "//div[@class='MuiBox-root css-1d3kc3b']//div[1]//*[name()='svg']")
	WebElement prevBlogButton;

	@FindBy(xpath = "//*[text()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "//button[@aria-label='search colleges']//*[name()='svg']")
	WebElement validateSearchIcon;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[1]/div/div/div/div[1]/div/div[1]/div/div/div")
	WebElement placeHolderSearchBox;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[1]/div/div[1]")
	WebElement headingTopCollegesInIndia;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[2]/div/div[1]")
	WebElement headingTopPlaceInIndiaToStudy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[2]/div/div[3]/div/div[1]")
	WebElement headingTopCoursesToStudy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[3]/div/div[1]/div")
	WebElement headingExploreCareers;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[6]/div/div/div[1]")
	WebElement headingBlog;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[5]/div/p/div[1]/p[1]")
	WebElement headingWatchOut;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[6]/div/div/div[2]/div[2]")
	WebElement verifyNextBlogButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[6]/div/div/div[2]/div[1]")
	WebElement verifyPrevBlogButton;

	@FindBy(xpath = "//img[@alt='placement']")
	WebElement verifyBanner;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[6]/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/div[1]")
	WebElement registrationForm;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[6]/div/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]")
	WebElement mbbsAddmission;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[1]/div/div[1]/div/p")
	WebElement gftiEngineeringCollegeText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[1]/div/div[1]/div/p")
	WebElement nitArchitectureCollegeText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[1]/div")
	WebElement footerEngineering;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[1]/div/div[2]/div")
	WebElement footerArchitecture;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[1]/div")
	WebElement footerMedical;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[2]/div")
	WebElement footerDental;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[2]/div/div[3]/div")
	WebElement footerPharmacy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[3]/div/div[2]/div")
	WebElement footerOtherLinks;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div[3]/div/div[3]/div[1]")
	WebElement footerFollowUs;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/div[1]/div/a/img")
	WebElement headerCollegeSuggestLogo;

	@FindBy(xpath = "//*[@id=\"logo-icon\"]")
	WebElement collegeSuggestText;

	@FindBy(xpath = "//a[normalize-space()='Top Dental colleges']")
	WebElement topDentalColleges;

	@FindBy(xpath = "//a[text()='Banglore']")
	WebElement collegesInBanglore;

	@FindBy(xpath = "//a[normalize-space()='Aeronautical']")
	WebElement aeronauticalEngineering;

	@FindBy(xpath = "//a[normalize-space()='Indian Institute of Technology Madras']")
	WebElement iitmCollege;

	@FindBy(xpath = "//h2[normalize-space()='Explore By Stream']")
	WebElement exploreByStreamText;

	@FindBy(xpath = "//a[@class='css-1i8t417'][normalize-space()='Engineering']")
	WebElement exploreByStreamEngineering;

	@FindBy(xpath = "//a[@class='css-1i8t417'][normalize-space()='Medical']")
	WebElement exploreByStreamMedical;

	@FindBy(xpath = "//a[@class='css-1i8t417'][normalize-space()='Dental']")
	WebElement exploreByStreamDental;

	@FindBy(xpath = "//a[@class='css-1i8t417'][normalize-space()='Architecture']")
	WebElement exploreByStreamArchitecture;

	@FindBy(xpath = "//a[@class='css-1i8t417'][normalize-space()='Pharmacy']")
	WebElement exploreByStreamPharmacy;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[4]/div/div/div[1]/p[1]")
	WebElement rankExamsText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[4]/div/div/div[1]/p[2]")
	WebElement rankExamsParagraph;

	@FindBy(xpath = "//p[normalize-space()='Rankings']")
	WebElement ranksText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[4]/div/div/div[2]/div/div[1]/div/div[1]/p[2]")
	WebElement ranksTextParagraph;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[4]/div/div/div[2]/div/div[2]/div/div[1]/p[1]")
	WebElement examsText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[4]/div/div/div[2]/div/div[2]/div/div[1]/p[2]")
	WebElement examsParagraph;

	@FindBy(xpath = "//a[normalize-space()='Top Engineering Colleges in India']")
	WebElement topEngineeringCollegeOfRank;

	@FindBy(xpath = "//a[normalize-space()='Top Medical Colleges in India']")
	WebElement topMedicalCollegeOfRank;

	@FindBy(xpath = "//a[normalize-space()='Top Architecture Colleges in India']")
	WebElement topArchitectureCollegeOfRank;

	// Initilaizing Page Objects
	public HomePageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Page Actions

	// Header Section

	// verify the logo of college suggest
	public void verifyHeaderCollegeSuggestLogo() throws InterruptedException {
		Thread.sleep(3000);
		if (headerCollegeSuggestLogo.isDisplayed()) {

			System.out.println("Success :: The 'College Suggest Logo' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'College Suggest Logo' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyHomeButton() throws InterruptedException {
		Thread.sleep(2000);
		if (homeButton.isDisplayed()) {

			System.out.println("Success :: The 'Home Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Home Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyEngineeringButton() {
		if (engineeringMenuButton.isDisplayed()) {

			System.out.println("Success :: The 'Engineering Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Engineering Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyMedicalButton() {
		if (medicalMenuButton.isDisplayed()) {

			System.out.println("Success :: The 'Medical Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Medical Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyDentalButton() {
		if (dentalMenuButton.isDisplayed()) {

			System.out.println("Success :: The 'Dental Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Dental Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyArchitectureButton() {
		if (architectureMenuButton.isDisplayed()) {

			System.out.println("Success :: The 'Architecture Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Architecture Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyPharmacyButton() {
		if (pharmacyMenuButton.isDisplayed()) {

			System.out.println("Success :: The 'Pharmacy Button' of header section  is displayed");
		} else {
			System.out.println("Error ::  The 'Pharmacy Button' of header section  is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnEngineeringGFTIDropDown() throws InterruptedException {
		
		

		Actions obj = new Actions(driver);
		obj.moveToElement(engineeringDropDownButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Engineering' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Engineering' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try {
			engineeringGftiCollege.click();
			System.out.println("Success :: 'Top 10 GFTI Engineering Colleges In India' of engineering is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 GFTI Engineering Colleges In India' of engineering is not displayed");
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

	public void clickOnEngineeringNITDropDown() throws InterruptedException {

		Actions obj = new Actions(driver);
		obj.moveToElement(engineeringDropDownButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Engineering' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Engineering' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try {	
			nitCollegeIndia.click();
			System.out.println("Success :: 'Top 10 NIT Colleges in India' of Engineering is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 NIT Colleges in India' of Engineering  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnIitCollegeEngineering() throws InterruptedException {

		Thread.sleep(3000);
		try {
			iitCollegeEngineering.click();
			System.out.println("Success :: 'Top 10 IIT Colleges in India' of Engineering is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 IIT Colleges in India' of Engineering  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void engineeringNitCollege() {

		try {
			nitCollegeIndia.click();
			System.out.println("Success :: 'Top 10 NIT Colleges in India' of Engineering is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 NIT Colleges in India' of Engineering  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void engineeeringGftiCollege() throws InterruptedException {
		Thread.sleep(3000);
		try {
			engineeringGftiCollege.click();
			System.out.println("Success :: 'Top 10 GFTI Engineering Colleges In India' of engineering is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 GFTI Engineering Colleges In India' of engineering is not displayed");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnHomeButton() throws InterruptedException {

		Thread.sleep(4000);
		try {
			homeButton.click();
			System.out.println("Success :: 'Home Button' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Home Button' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnMedicalPrivateDropDown() throws InterruptedException {

		Actions obj = new Actions(driver);
		obj.moveToElement(medicalDropDownButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Medical' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Medical' is not clicked");
			e.printStackTrace();
		}
		Thread.sleep(3000);
		try {
			medicalPrivateCollege.click();
			System.out.println("Success :: 'Top 10 Private  Colleges In India' of medical is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 Private Colleges In India' of medical is not displayed");
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.navigate().back();
	}

	

	public void clickOnDentalPrivateDropDown() throws InterruptedException {

		Actions obj = new Actions(driver);
		obj.moveToElement(dentalMenuButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Dental' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Dental' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try {
			dentalPrivateCollege.click();
			System.out.println("Success :: 'Top 10 Private  Colleges In India' of dental is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 Private Colleges In India' of dental is not displayed");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		driver.navigate().back();
	}



	public void clickOnArchitectureNitDropDown() throws InterruptedException {

		Actions obj = new Actions(driver);
		obj.moveToElement(architectureMenuButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Architecture' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Architecture' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try {
			architectureNitCollege.click();
			System.out.println("Success :: 'Top 10 NIT Colleges Of India' of architecture is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 NIT Colleges Of India' of architecture is not displayed");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		driver.navigate().back();

	}


	public void clickOnPharmacyPrivateDropDown() throws InterruptedException {

		Actions obj = new Actions(driver);
		obj.moveToElement(pharmacyDropDownButton).perform();
		Thread.sleep(2000);

		try {
			System.out.println("Success :: 'The DropDown Of Pharmacy' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'The DropDown Of Pharmacy' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(3000);
		try {
			pharmacyPrivateCollege.click();
			System.out.println("Success :: 'Top 10 Private Colleges In India' of pharmacy is displayed");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 Private Colleges Of India' of pharmacy is not displayed");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		driver.navigate().back();

	}


	// Search Section

	public void verifySearchIcon() {
		if (validateSearchIcon.isDisplayed()) {
			System.out.println("Success ::  The 'Search Icon' is displayed");

		} else {
			System.out.println("Error ::  The 'Search Icon' is not displayed");
		}
		System.out.println("****************************************");
	}

	public void typeOnSearchBox() throws InterruptedException {
		Thread.sleep(3000);

		searchBox.sendKeys("indian institute of technology madras");
		try {

			System.out.println("Success :: 'Indian Institute of Technology Madras' is typed in search box ");
		} catch (Exception e) {
			System.out.println("Error :: 'Indian Institute of Technology Madras' is not typed in search box ");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnIndianInstituteOfTechnologyMadras() throws InterruptedException {
		Thread.sleep(2000);
		iitmCollege.click();
		try {

			System.out.println("Success :: 'Indian Institute of Technology Madras' is clicked ");
		} catch (Exception e) {
			System.out.println("Error :: 'Indian Institute of Technology Madras' is not clicked ");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyBanner() {
		if (verifyBanner.isDisplayed()) {
			System.out.println("Success :: The 'Banner Image' is displayed");
		} else {
			System.out.println("Error :: The 'Banner Image' is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyplaceHolderSearchBox() {
		if (placeHolderSearchBox.isDisplayed()) {
			System.out.println("Success :: The 'Place Holder'of the searchbox is visible");
		} else {
			System.out.println("Error :: The 'Place Holder'of the searchbox is not visible");
		}
		System.out.println("****************************************");
	}

	// Explore By Stream

	public void verifyExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);
		if (exploreByStreamText.isDisplayed()) {
			System.out.println("Success :: The 'Explore By Stream' heading is displayed");
		} else {
			System.out.println("Error :: The 'Explore By Stream' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyEngineeringOfExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);

		if (exploreByStreamEngineering.isDisplayed()) {
			System.out.println("Success :: The 'Engineering' title card is displayed");
		} else {
			System.out.println("Error :: The 'Engineering' title card is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyMedicalOfExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);

		if (exploreByStreamMedical.isDisplayed()) {
			System.out.println("Success :: The 'Medical' title card is displayed");
		} else {
			System.out.println("Error :: The 'Medical' title card is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyDentalOfExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);

		if (exploreByStreamDental.isDisplayed()) {
			System.out.println("Success :: The 'Dental' title card is displayed");
		} else {
			System.out.println("Error :: The 'Dental' title card is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyArchitectureOfExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);

		if (exploreByStreamArchitecture.isDisplayed()) {
			System.out.println("Success :: The 'Architecture' title card is displayed");
		} else {
			System.out.println("Error :: The 'Architecture' title card is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyPharmacyOfExploreByStreamText() throws InterruptedException {
		Thread.sleep(2000);

		if (exploreByStreamPharmacy.isDisplayed()) {
			System.out.println("Success :: The 'Pharmacy' title card is displayed");
		} else {
			System.out.println("Error :: The 'Pharmacy' title card is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnEngineeringExplorestream() throws InterruptedException {
		Thread.sleep(2000);

		try {
			exploreByStreamEngineering.click();
			System.out.println("Success :: 'Engineering' link card  is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Engineering' link card  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	public void clickOnMedicalExplorestream() throws InterruptedException {
		Thread.sleep(2000);

		try {
			exploreByStreamMedical.click();
			System.out.println("Success :: 'Medical' link card  is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Medical' link card  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	public void clickOnDentalExplorestream() throws InterruptedException {
		Thread.sleep(2000);

		try {
			exploreByStreamDental.click();
			System.out.println("Success :: 'Dental' link card  is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Dental' link card  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	public void clickOnArchitectureExplorestream() throws InterruptedException {
		Thread.sleep(2000);

		try {
			exploreByStreamArchitecture.click();
			System.out.println("Success :: 'Architecture' link card  is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Architecture' link card  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	public void clickOnPharmacyExplorestream() throws InterruptedException {
		Thread.sleep(2000);

		try {
			exploreByStreamPharmacy.click();
			System.out.println("Success :: 'Pharmacy' link card  is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Pharmacy' link card  is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	// Explore Careers Section

	public void verifyHeadingExploreCareers() {
		if (headingExploreCareers.isDisplayed()) {
			System.out.println("Success :: The 'Explore Careers' heading is displayed");
		} else {
			System.out.println("Error :: The 'Explore Careers' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyHeadingTopCollegeInIndia() throws InterruptedException {
		if (headingTopCollegesInIndia.isDisplayed()) {
			System.out.println("Success :: The 'Top Colleges in India' heading is displayed");
		} else {
			System.out.println("Error :: The 'Top Colleges in India' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnTopCollegeInIndia() throws InterruptedException {

		scrollandclick(topCollegeInIndia);
		Thread.sleep(2000);
		if (topCollegeInIndia.isDisplayed()) {
			System.out.println("Success :: The 'Top College In India' section is clicked");
		} else {
			System.out.println("Error :: The 'Top College In India' section is not clicked");
		}
		System.out.println("****************************************");

		topCollegeInIndia.click();
	}

	public void verifyHeadingTopPlaceInIndiaToStudy() throws InterruptedException {
		if (headingTopPlaceInIndiaToStudy.isDisplayed()) {
			System.out.println("Success :: The 'Top Places In India to study' heading is displayed");
		} else {
			System.out.println("Error :: The 'Top Places In India to study' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnTopPlaceInIndiaToStudy() throws InterruptedException {

		topPlaceInIndiaToStudy.click();
		Thread.sleep(2000);
		if (topPlaceInIndiaToStudy.isDisplayed()) {
			System.out.println("Success :: The 'Top Place In India To Study' section is clicked");
		} else {
			System.out.println("Error :: The 'Top Place In India To Study' section is not clicked");
		}
		System.out.println("****************************************");

		topPlaceInIndiaToStudy.click();
	}

	public void verifyHeadingTopCoursesToStudy() throws InterruptedException {
		if (headingTopCoursesToStudy.isDisplayed()) {
			System.out.println("Success :: The 'Top Courses to study' heading is displayed");
		} else {
			System.out.println("Error :: The 'Top Courses to study' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnTopCoursesToStudy() throws InterruptedException {

		topCoursesToStudy.click();
		Thread.sleep(2000);
		if (topCoursesToStudy.isDisplayed()) {
			System.out.println("Success :: The 'Top Courses To Study' section is clicked");
		} else {
			System.out.println("Error :: The 'Top Courses To Study' section is not clicked");
		}
		System.out.println("****************************************");

		topCoursesToStudy.click();
	}

	public void clickOnNitDurgapurOverview() throws InterruptedException {

		scrollandclick(nitDurgapurOverview);
		if (nitDurgapurOverview.isDisplayed()) {
			System.out.println("Success :: The 'Nit Durgapur Campus Tour' watchout vedio is clicked");
		} else {
			System.out.println("Error :: The 'Nit Durgapur Campus Tour' watchout vedio is not clicked");
		}
		System.out.println("****************************************");
	}


	public void clickOnNitNagpurCampusTour() throws InterruptedException {

		scrollandclick(nitNagpurCampusTour);
		if (nitNagpurCampusTour.isDisplayed()) {
			System.out.println("Success :: The 'Nit Nagpur Campus Tour' watchout vedio is clicked");
		} else {
			System.out.println("Error :: The 'Nit Nagpur Campus Tour' watchout vedio is not clicked");
		}
		System.out.println("****************************************");
	}

	public void clickOntopDentalColleges() throws InterruptedException {
		Thread.sleep(2000);
		try {
			topDentalColleges.click();
			System.out.println("Success :: The 'Top Dental Colleges' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Top Dental Colleges' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		homeButton.click();
		Thread.sleep(2000);

	}

	public void clickOnCollegesInBanglore() throws InterruptedException {
		Thread.sleep(3000);

		scrollandclick(collegesInBanglore);

		try {
			System.out.println("Success :: The 'Banglore Colleges' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Banglore Colleges' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		homeButton.click();
		Thread.sleep(2000);
	}

	public void clickOnAeronauticalEngineering() throws InterruptedException {
		Thread.sleep(2000);

		scrollandclick(aeronauticalEngineering);

		try {
			System.out.println("Success :: The 'Aeronatical Engineering' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Aeronatical Engineering' is not clicked");
			e.printStackTrace();
		}
		System.out.println("****************************************");

		homeButton.click();
		Thread.sleep(2000);
	}

	public void clickOnViewAllButton() throws InterruptedException {

		scrollandclick(viewAllButton);
		Thread.sleep(4000);
		if (viewAllButton.isDisplayed()) {
			System.out.println("Success :: The 'View All' button is clicked and youtube page is opened");
		} else {
			System.out.println("Error :: The 'View All' button is not clicked");
		}
		System.out.println("****************************************");
	}

	// Ranking & Exams

	public void verifyTheRankingExams() throws InterruptedException {
		Thread.sleep(2000);
		if (rankExamsText.isDisplayed()) {
			System.out.println("Success :: The 'Rankings & Exams' heading is visible");
		} else {
			System.out.println("Error :: The 'Rankings & Exams' heading is not visible");
		}
		System.out.println("****************************************");
	}

	public void verifyTheRankingExamsParagraph() throws InterruptedException {
		Thread.sleep(2000);
		if (rankExamsText.isDisplayed()) {
			System.out.println("Success :: The 'Rankings & Exams' paragraph is present");
		} else {
			System.out.println("Error :: The 'Rankings & Exams' paragraph is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyTheRank() throws InterruptedException {
		Thread.sleep(2000);
		if (ranksText.isDisplayed()) {
			System.out.println("Success :: The 'Rankings' heading is visible");
		} else {
			System.out.println("Error :: The 'Rankings' heading is not visible");
		}
		System.out.println("****************************************");
	}

	public void verifyTheRankParagraph() throws InterruptedException {
		Thread.sleep(2000);
		if (ranksTextParagraph.isDisplayed()) {
			System.out.println("Success :: The 'Rankings' paragraph is present");
		} else {
			System.out.println("Error :: The 'Rankings' paragraph is not present");
		}
		System.out.println("****************************************");
	}

	public void verifyTheExams() throws InterruptedException {
		Thread.sleep(2000);
		if (examsText.isDisplayed()) {
			System.out.println("Success :: The 'Exams' heading is visible");
		} else {
			System.out.println("Error :: The 'Exams' heading is not visible");
		}
		System.out.println("****************************************");
	}

	public void verifyTheExamsParagraph() throws InterruptedException {
		Thread.sleep(2000);
		if (examsParagraph.isDisplayed()) {
			System.out.println("Success :: The 'Exams' paragraph is present");
		} else {
			System.out.println("Error :: The 'Exams' paragraph is not present");
		}
		System.out.println("****************************************");
	}

	public void clickOnTopEngineeringCollegeOfRanking() throws InterruptedException {
		Thread.sleep(2000);

		scrollandclick(topEngineeringCollegeOfRank);

		try {
			System.out.println("Success :: The 'Top Engineering College' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Top Engineering College' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		try {
			homeButton.click();
			System.out.println("Success :: 'Home Button' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Home Button' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnTopMedicalCollegeOfRanking() throws InterruptedException {
		Thread.sleep(2000);

		scrollandclick(topMedicalCollegeOfRank);

		try {
			System.out.println("Success :: The 'Top Medical College' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Top Medical College' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		try {
			homeButton.click();
			System.out.println("Success :: 'Home Button' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Home Button' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnTopArchitectureCollegeOfRanking() throws InterruptedException {
		Thread.sleep(2000);

		scrollandclick(topArchitectureCollegeOfRank);

		try {
			System.out.println("Success :: The 'Top Architecture College' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Top Architecture College' is not clicked");
			e.printStackTrace();
		}

		Thread.sleep(2000);
		try {
			homeButton.click();
			System.out.println("Success :: 'Home Button' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Home Button' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	// Watchout Section

	public void verifyHeadingWatchOut() {
		if (headingWatchOut.isDisplayed()) {
			System.out.println("Success :: The 'WatchOut' heading is displayed");
		} else {
			System.out.println("Error :: The 'WatchOut' heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnPrivateEngineeringCollegeFooter() throws InterruptedException {

		Thread.sleep(2000);
		scrollandclick(footerLinkPrivateCollege);

		try {
			System.out.println("Success :: 'Top 10 Private Colleges In India' of engineering is clicked");
		} catch (Exception e) {
			System.out.println("Error :: 'Top 10 Private Colleges Of India' of engineering is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		driver.navigate().back();

	}

	public void clickOnGovermentArchitectureFooterLink() throws InterruptedException {

		Thread.sleep(2000);
		scrollandclick(architectureCollegeFooterLink);

		try {
			System.out.println("Success :: 'Top 10 Government Colleges In India' of architecture is clicked");
		} catch (Exception e) {
			System.out.println("Success :: 'Top 10 Government Colleges In India' of architecture is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		driver.navigate().back();
	}

	public void clickOnGovermentMedicalFooterlink() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(medicalCollegeFooterLink);

		try {
			System.out.println("Success :: 'Top 10 Government Colleges In India' of medical is clicked");
		} catch (Exception e) {
			System.out.println("Success :: 'Top 10 Government Colleges In India' of medical is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		driver.navigate().back();

	}

	public void clickOnPrivateDentalFooterlink() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(dentalCollegeFooterLink);

		try {
			System.out.println("Success :: 'Top 10 Private Colleges In India' of dental is clicked");
		} catch (Exception e) {
			System.out.println("Success :: 'Top 10 Private Colleges In India' of dental is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		driver.navigate().back();

	}

	public void clickOnPrivatePharmacyFooterlink() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(pharmacyCollegeFooterLink);

		try {
			System.out.println("Success :: 'Top 10 Private Colleges In India' of pharmacy is clicked");
		} catch (Exception e) {
			System.out.println("Success :: 'Top 10 Private Colleges In India' of pharmacy is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

		Thread.sleep(2000);
		driver.navigate().back();

	}

	// Blog section

	public void verifyHeadingBlogsection() {
		if (headingBlog.isDisplayed()) {
			System.out.println("Success :: The 'Blogs' section heading is displayed");
		} else {
			System.out.println("Error :: The 'Blogs' section heading is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyNextBlogButton() {
		if (verifyNextBlogButton.isDisplayed()) {
			System.out.println("Success :: The 'Next Blog' button is visible");
		} else {
			System.out.println("Error :: The 'Next Blog' button is not visible");
		}
		System.out.println("****************************************");
	}

	public void clickOnNextBlogButton() throws InterruptedException {
		Thread.sleep(4000);
		scrollandclick(nextBlogButton);

		if (registrationForm.isDisplayed()) {
			System.out.println("Success :: Clicked the 'Next Blog' button");
		} else {
			System.out.println("Error :: Failed to click the 'Next Blog' button");
		}
		System.out.println("****************************************");
	}

	public void verifyPrevBlogButton() throws InterruptedException {
		Thread.sleep(4000);
		if (verifyPrevBlogButton.isDisplayed()) {
			System.out.println("Success :: The 'Previous Blog' button is visible");
		} else {
			System.out.println("Error :: The 'Previous Blog' button is not visible");
		}
		System.out.println("****************************************");
	}

	public void clickOnPrevBlogButton() throws InterruptedException {
		Thread.sleep(4000);
		prevBlogButton.click();
		Thread.sleep(3000);
		if (mbbsAddmission.isDisplayed()) {
			System.out.println("Success :: Clicked the 'Previous Blog' button");
		} else {
			System.out.println("Error :: Failed to click the 'Previous Blog' button");
		}
		System.out.println("****************************************");
	}
	// FooterSection

	public void verifyEngineeringSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerEngineering.isDisplayed()) {
			System.out.println("Success ::  The 'Engineering' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Engineering' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyArchitectureSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerArchitecture.isDisplayed()) {
			System.out.println("Success ::  The 'Architecture section' of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Architecture section' of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyMedicalSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerMedical.isDisplayed()) {
			System.out.println("Success ::  The 'Medical' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Medical' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyDentalSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerDental.isDisplayed()) {
			System.out.println("Success ::  The 'Dental' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Dental' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyPharmacySectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerPharmacy.isDisplayed()) {
			System.out.println("Success ::  The 'Pharmacy' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Pharmacy' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyOtherLinkSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerOtherLinks.isDisplayed()) {
			System.out.println("Success ::  The 'Other Links' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Other Links' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	public void verifyFollowUsSectionInFooter() throws InterruptedException {
		Thread.sleep(2000);
		if (footerFollowUs.isDisplayed()) {
			System.out.println("Success ::  The 'Follow Us' section of footer is displayed");

		} else {
			System.out.println("Error ::  The 'Follow Us' section of footer is not displayed");
		}
		System.out.println("****************************************");
	}

	private void scrollandclick(WebElement footerLink) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object element = footerLink;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		Thread.sleep(6000);
		footerLink.click();
		Thread.sleep(6000);

	}

}
