package org.collegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_RankingExams extends BaseClass {

    // Creating an instance of HomePageObject
    HomePageObject homePage;

    // verify the presence of Ranking Exam text
    @Test(priority = 1)
    public void cs_Verify_RankingExam_Text_Is_Present_0001() throws InterruptedException {
        sleep(2000);
        homePage.verifyTheRankingExams();
    }

    // verify the presence of Ranking Exam paragraph
    @Test(priority = 2)
    public void cs_Verify_RankingExam_Paragraph_Is_Present_0002() throws InterruptedException {
        homePage.verifyTheRankingExamsParagraph();
    }

    // verify the presence of Rankings heading
    @Test(priority = 3)
    public void cs_Verify_Rankings_Heading_Is_Present_0003() throws InterruptedException {
        homePage.verifyTheRank();
    }

    // verify the presence of Rankings paragraph
    @Test(priority = 4)
    public void cs_Verify_Rankings_Paragraph_Is_Present_0004() throws InterruptedException {
        homePage.verifyTheRankParagraph();
    }

    //  verify the presence of Exams heading
    @Test(priority = 5)
    public void cs_Verify_Exams_Heading_Is_Present_0005() throws InterruptedException {
        homePage.verifyTheExams();
    }

    //  verify the presence of Exams paragraph
    @Test(priority = 6)
    public void cs_Verify_Exams_Paragraph_Is_Present_0006() throws InterruptedException {
        homePage.verifyTheExamsParagraph();
    }

    //  verify that Top Engineering College is clickable
    @Test(priority = 7)
    public void cs_Verify_TopEngineeringCollege_Is_Clickable_0007() throws InterruptedException {
        homePage.clickOnTopEngineeringCollegeOfRanking();
    }

    //  verify that Top Medical College is clickable
    @Test(priority = 8)
    public void cs_Verify_TopMedicalCollege_Is_Clickable_0008() throws InterruptedException {
        homePage.clickOnTopMedicalCollegeOfRanking();
    }

    // verify that Top Architecture College is clickable
    @Test(priority = 9)
    public void cs_Verify_TopArchitectureCollege_Is_Clickable_0009() throws InterruptedException {
        homePage.clickOnTopArchitectureCollegeOfRanking();
    }

    // Utility method to introduce a delay and initialize the HomePageObject
    private void sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
        homePage = new HomePageObject(driver);
    }
}
