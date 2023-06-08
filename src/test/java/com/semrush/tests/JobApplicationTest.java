package com.semrush.tests;

import org.junit.jupiter.api.Test;
import pages.JobApplicationPages;

import static io.qameta.allure.Allure.step;

public class JobApplicationTest extends TestBase {

    static JobApplicationPages JobApplicationPages = new JobApplicationPages();

    private static final String TITLE = "New Stars  Are Born Here";
    private static final String ROLE = "QA Automation Engineer";
    private static final String SEARCHRESULT = "QA Automation Engineer (Force Team)";
    private static final String NAME = "Elena";
    private static final String EMAIL = "elenav@test.com";
    private static final String PHONE = "+35790909090";
    private static final String UPLOADEDCV = "src/test/resources/dummy.pdf";

    @Test
    void checkApplicationJobForm () {
        step("Open the main page", () -> {
            JobApplicationPages.openPage();
        });
        step("Close modal form", () -> {
            JobApplicationPages.closeModalForm();
        });
        step("Decline cookies", () -> {
            JobApplicationPages.declineCookies();
        });
        step("Check title on the main page", () -> {
            JobApplicationPages.checkTitle(TITLE);
        });
        step("Check jobs block on the main page", () -> {
            JobApplicationPages.checkJobsBlock();
        });
        step("Click on the search input", () -> {
            JobApplicationPages.searchJobs("");
        });
        step("Type role position in search field", () -> {
            JobApplicationPages.searchJobs(ROLE);
        });
        step("Click on the button 'Search'", () -> {
            JobApplicationPages.searchButtonClick();
        });
        step("Close modal form", () -> {
            JobApplicationPages.closeModalForm();
        });
        step("Click on the job title", () -> {
            JobApplicationPages.checkJobList(SEARCHRESULT);
        });
        step("Click to the button 'Apply for this job'", () -> {
            JobApplicationPages.clickButton();
        });
        step("Set first name", () -> {
            JobApplicationPages.setFirstName(NAME);
        });
        step("Set email", () -> {
            JobApplicationPages.setEmail(EMAIL);
        });
        step("Set phone number", () -> {
            JobApplicationPages.setPhone(PHONE);
        });
        step("Upload CV", () -> {
            JobApplicationPages.uploadCV(UPLOADEDCV);
        });
        step("Check the button 'Apply for this job'", () -> {
            JobApplicationPages.checkApplyButton();
        });
    }
}
