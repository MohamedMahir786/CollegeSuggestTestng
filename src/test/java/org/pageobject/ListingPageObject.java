package org.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPageObject {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[2]/div/div[2]/button/p")
	WebElement readMoreButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[2]/div/div[1]/p[4]")
	WebElement readMoreText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[2]/div/div[2]/button")
	WebElement maximizeReadMoreButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[1]/div/div[1]/div/div[2]/div/img")
	WebElement bannerReadMoreSection;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div/div/div/div")
	WebElement dropDownButton;

	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[3]")
	WebElement feesDropDownButton;

	@FindBy(xpath = "//*[@id='menu-']/div[3]/ul/li[2]")
	WebElement campusDropdownButton;

	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[4]")
	WebElement medianSalaryDropDownButton;

	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[5]")
	WebElement placementDropDownButton;

	@FindBy(xpath = "(//input[@id=':r0:'])[1]")
	WebElement searchBox;

	@FindBy(xpath = "(//input[@aria-label='Checkbox demo'])[1]")
	WebElement bookMark;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement addToCompare;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[1]/div/div[2]/div[6]/div[1]/div[3]/span/input")
	WebElement bookMark1;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[1]/div/div[2]/div[6]/div[2]/label/span[1]")
	WebElement addToCompare1;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[1]/div/div[2]/button")
	WebElement clickOnLoadMore;

	@FindBy(xpath = "//a[normalize-space()='Indian Institute of Technology Madras']")
	WebElement indianInstituteOfTechnologyMadras;

	@FindBy(xpath = "//p[contains(text(),'Filter')]")
	WebElement filterText;

	@FindBy(xpath = "//p[normalize-space()='State']")
	WebElement stateText;

	@FindBy(xpath = "//p[normalize-space()='City']")
	WebElement cityText;

	@FindBy(xpath = "//p[normalize-space()='Ownership']")
	WebElement ownershipText;

	@FindBy(xpath = "//p[normalize-space()='Category']")
	WebElement categoryText;

	@FindBy(xpath = "//p[normalize-space()='Course']")
	WebElement courseText;

	@FindBy(xpath = "//*[@id='statebh-header']")
	WebElement filterStateButton;

	@FindBy(xpath = "//input[@value='Tamil Nadu']")
	WebElement tamilNaduState;
	
	@FindBy(xpath = "//div[@id='ownershipbh-header']")
	WebElement filterOwnershipButton;
	
	@FindBy(xpath = "//input[@value='Government']")
	WebElement ownershipGoverment;

	@FindBy(xpath = "//div[@class='MuiBox-root css-1x6mxvh']")
	WebElement clearallButton;
	
	@FindBy(xpath = "//a[normalize-space()='National Institute of Technology Rourkela']")
	WebElement nitrCollege;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[2]/a")
	WebElement nittCollege;
	
	
	public ListingPageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNittCollege() throws InterruptedException {
		Thread.sleep(2000);
		nittCollege.click();
		try {
			System.out.println("Success: 'National Institute of Technology Tiruchirappalli' college is clicked");
		} catch (Exception e) {
			System.out.println("Error:'National Institute of Technology Tiruchirappalli' college is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}	
	
	
	public void clickOnIndianInstituteOfTechnologyMadras() throws InterruptedException {
		indianInstituteOfTechnologyMadras.click();
		Thread.sleep(2000);
	}

	// ReadMore Section
	public void clickOnReadMoreButton() throws InterruptedException {
		Thread.sleep(2000);

		try {
			readMoreButton.click();
			System.out.println("Success ::The 'Read More' button is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Read More' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyReadMoreText() {
		if (readMoreText.isDisplayed()) {
			System.out.println("Success ::  The 'Read More ' text content is displayed");

		} else {
			System.out.println("Error ::  The 'Read More' text content is not displayed");
		}
		System.out.println("****************************************");
	}

	public void clickOnMaximizeReadMoreButton() throws InterruptedException {

		Thread.sleep(2000);

		try {
			maximizeReadMoreButton.click();
			System.out.println("Success ::The 'Read Less' button is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Read Less' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void verifyBannerImageOfReadMoreSection() throws InterruptedException {
		Thread.sleep(4000);
		if (bannerReadMoreSection.isDisplayed()) {

			System.out.println("Success :: The 'Banner Image' of read more section  is displayed");
		} else {
			System.out.println("Error ::  The 'Banner Image' of read more section  is not displayed");
		}
		System.out.println("****************************************");
	}

	// Sort By Section
	public void clickOnDropDownButton() throws InterruptedException {

		Thread.sleep(2000);

		try {
			dropDownButton.click();
			System.out.println("Success ::The 'Drop Down Button of Sort By' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Drop Down Button of Sort By' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnfeesDropDownButton() throws InterruptedException {

		Thread.sleep(3000);

		try {
			feesDropDownButton.click();
			System.out.println("Success ::The 'Drop Down of Fees' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Drop Down of Fees' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnCampusDropDownButton() throws InterruptedException {

		Thread.sleep(2000);

		try {
			campusDropdownButton.click();
			System.out.println("Success ::The 'Drop Down of Campus' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Drop Down Button of Campus' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnPlacementDropDownButton() throws InterruptedException {

		Thread.sleep(2000);

		try {
			placementDropDownButton.click();
			System.out.println("Success ::The 'Drop Down of Placement' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Drop Down Button of Placement' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickOnMedianSalaryDropDownButton() throws InterruptedException {

		Thread.sleep(2000);

		try {
			medianSalaryDropDownButton.click();
			System.out.println("Success ::The 'Drop Down of Median Salary' is clicked");
		} catch (Exception e) {
			System.out.println("Error :: The 'Drop Down Button of Median Salary' is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void typeOnSearchBox() throws InterruptedException {
		Thread.sleep(2000);
		searchBox.sendKeys("National Institute Of Technology Rourkela");
		Thread.sleep(2000);
		try {
			System.out.println("Success: 'National Institute Of Technology Rourkela' college is typed");
		} catch (Exception e) {
			System.out.println("Error:'National Institute Of Technology Rourkela' college is not typed");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}
	
	public void clickOnNitrCollege() throws InterruptedException {
		Thread.sleep(2000);
		nitrCollege.click();
		try {
			System.out.println("Success: 'National Institute Of Technology Rourkela' college is clicked");
		} catch (Exception e) {
			System.out.println("Error:'National Institute Of Technology Rourkela' college is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}	
	

	// Bookmark Section
	public void clickOnBookMark() throws InterruptedException {
		Thread.sleep(3000);
		try {
			bookMark.click();
			System.out.println("Success: Clicked the 'Bookmark' button for Institute Of Chemical Technology");
		} catch (Exception e) {
			System.out.println("Error: Unable to click the 'Bookmark' button for Institute Of Chemical Technology");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void clickAddToCompare() throws InterruptedException {
		Thread.sleep(3000);
		try {
			addToCompare.click();
			System.out.println("Success: Clicked the 'Add To Compare' button for Institute Of Chemical Technology");
		} catch (Exception e) {
			System.out
					.println("Error: Unable to click the 'Add To Compare' button for Institute Of Chemical Technology");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void removeClickedBookMark() throws InterruptedException {
		Thread.sleep(2000);
		try {
			bookMark.click();
			System.out.println("Success: The 'Bookmark' button for Institute Of Chemical Technology is removed");
		} catch (Exception e) {
			System.out.println("Error: The 'Bookmark' button for Institute Of Chemical Technology is not removed");
			e.printStackTrace();
		}

		System.out.println("****************************************");

	}

	public void removeClickedAddToCompare() throws InterruptedException {
		Thread.sleep(3000);
		try {
			addToCompare.click();
			System.out.println("Success: The 'Add To Compare' button for Institute Of Chemical Technology is removed");
		} catch (Exception e) {
			System.out.println("Error: The 'Add To Compare' button for Institute Of Chemical Technology is removed");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void clickOnBookMark1() throws InterruptedException {

		scrollandclick(bookMark1);
		Thread.sleep(4000);
	}

	public void clickOnAddToCompare1() throws InterruptedException {

		addToCompare1.click();
		Thread.sleep(3000);
	}

	// Filter Section

	public void verifyFilterText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			filterText.isDisplayed();
			System.out.println("Success: The 'Filter' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'Filter' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void verifyStateText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			stateText.isDisplayed();
			System.out.println("Success: The 'State' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'State' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void verifyCityText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			cityText.isDisplayed();
			System.out.println("Success: The 'City' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'City' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void verifyOwnerShipText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			ownershipText.isDisplayed();
			System.out.println("Success: The 'Ownership ' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'Ownership' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void verifyCategoryText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			categoryText.isDisplayed();
			System.out.println("Success: The 'Category ' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'Category' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void verifyCourseText() throws InterruptedException {
		Thread.sleep(2000);
		try {
			courseText.isDisplayed();
			System.out.println("Success: The 'Course' text is present ");
		} catch (Exception e) {
			System.out.println("Error: The 'Course' text is not present");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}

	public void clickOnStateFilterTamilnadu() throws InterruptedException {
	    // Add a pause of 2 seconds
	    Thread.sleep(2000);

	    // Click the 'Filter' button
	    if (clickElement(filterStateButton, "Filter")) {
	        // Add a pause of 2 seconds
	        Thread.sleep(2000);

	        // Click the 'Jharkhand' filter button
	        clickElement(tamilNaduState, "Jharkhand");

	        // Click the 'Filter' button again
	        clickElement(filterStateButton, "Filter");

	        // Add a longer pause of 5 seconds
	        Thread.sleep(5000);
	        System.out.println("****************************************");
	    }
	}

	// Function to click an element with error handling
	private boolean clickElement(WebElement element, String elementName) {
	    try {
	        element.click();
	        System.out.println("Success: The '" + elementName + "' filter button is clicked");
	        return true;
	    } catch (Exception e) {
	        System.out.println("Error: The '" + elementName + "' filter button is not clicked");
	        e.printStackTrace();
	        return false;
	    }
	    
	}
	public void clickOnOwnershipGovernment() throws InterruptedException {
	    clickAndPrint(filterOwnershipButton, "Ownership", 2000);
	    clickAndPrint(ownershipGoverment, "Government", 2000);
	    clickAndPrint(filterOwnershipButton, "Ownership", 4000);

	    System.out.println("****************************************");
	}

	// Function to click an element and print success/error messages
	private void clickAndPrint(WebElement element, String elementName, int waitTime) throws InterruptedException {
	    try {
	        element.click();
	        System.out.println("Success: The '" + elementName + "' filter button is clicked");
	    } catch (Exception e) {
	        System.out.println("Error: The '" + elementName + "' filter button is not clicked");
	        e.printStackTrace();
	    }

	    // Add a pause after clicking an element
	    Thread.sleep(waitTime);
	}
	
	public void clickOnclearAll() throws InterruptedException {
		Thread.sleep(2000);
		try {
			clearallButton.click();
			System.out.println("Success: The 'Clear All' button is clicked");
		} catch (Exception e) {
			System.out
					.println("Error: The 'Clear All' button is not clicked");
			e.printStackTrace();
		}

		System.out.println("****************************************");
	}	
	

	// Load More Section
	public void clickOnLoadMore() throws InterruptedException {
		scrollandclick(clickOnLoadMore);
		Thread.sleep(4000);
	}


	private void scrollandclick(WebElement scroll) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object element = scroll;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		Thread.sleep(6000);
		((WebElement) element).click();
		Thread.sleep(6000);

	}
}
