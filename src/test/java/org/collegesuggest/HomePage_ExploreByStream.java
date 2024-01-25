package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_ExploreByStream extends BaseClass {

    HomePageObject homePage;

    //  verify if the "Explore By Stream" text is present
    @Test(priority = 1)
    public void cs_Verify_ExploreByStream_Text_Is_Present_0001() throws InterruptedException {
        sleep(2000);
        homePage.verifyExploreByStreamText();
    }

    // verify if the "Engineering" section of "Explore By Stream" is present
    @Test(priority = 2)
    public void cs_Verify_ExploreByStream_Engineering_Is_Present_0002() throws InterruptedException {
        homePage.verifyEngineeringOfExploreByStreamText();
    }

    // verify if the "Medical" section of "Explore By Stream" is present
    @Test(priority = 3)
    public void cs_Verify_ExploreByStream_Medical_Is_Present_0003() throws InterruptedException {
        homePage.verifyMedicalOfExploreByStreamText();
    }

    // verify if the "Dental" section of "Explore By Stream" is present
    @Test(priority = 4)
    public void cs_Verify_ExploreByStream_Dental_Is_Present_0004() throws InterruptedException {
        homePage.verifyDentalOfExploreByStreamText();
    }

    // verify if the "Architecture" section of "Explore By Stream" is present
    @Test(priority = 5)
    public void cs_Verify_ExploreByStream_Architecture_Is_Present_0005() throws InterruptedException {
        homePage.verifyArchitectureOfExploreByStreamText();
    }

    // verify if the "Pharmacy" section of "Explore By Stream" is present
    @Test(priority = 6)
    public void cs_Verify_ExploreByStream_Pharmacy_Is_Present_0006() throws InterruptedException {
        homePage.verifyPharmacyOfExploreByStreamText();
    }

    // verify if the "Engineering" section of "Explore By Stream" is clickable
    @Test(priority = 7)
    public void cs_Verify_ExploreByStream_Engineering_Is_Clickable_0007() throws InterruptedException {
        sleep(2000);
        homePage.clickOnEngineeringExplorestream();
    }

    // verify if the "Medical" section of "Explore By Stream" is clickable
    @Test(priority = 8)
    public void cs_Verify_ExploreByStream_Medical_Is_Clickable_0008() throws InterruptedException {
        sleep(2000);
        homePage.clickOnMedicalExplorestream();
    }

    // verify if the "Dental" section of "Explore By Stream" is clickable
    @Test(priority = 9)
    public void cs_Verify_ExploreByStream_Dental_Is_Clickable_0009() throws InterruptedException {
        sleep(2000);
        homePage.clickOnDentalExplorestream();
    }

    // verify if the "Architecture" section of "Explore By Stream" is clickable
    @Test(priority = 10)
    public void cs_Verify_ExploreByStream_Architecture_Is_Clickable_0010() throws InterruptedException {
        sleep(2000);
        homePage.clickOnArchitectureExplorestream();
    }

    // verify if the "Pharmacy" section of "Explore By Stream" is clickable
    @Test(priority = 11)
    public void cs_Verify_ExploreByStream_Pharmacy_Is_Clickable_0011() throws InterruptedException {
        sleep(2000);
        homePage.clickOnPharmacyExplorestream();
    }

    private void sleep(int milliseconds) throws InterruptedException {
        
        Thread.sleep(milliseconds);
        homePage = new HomePageObject(driver);
    }
}
