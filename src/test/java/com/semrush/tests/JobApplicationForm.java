package com.semrush.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.JobApplicationFormPages;

import static io.qameta.allure.Allure.step;

public class JobApplicationForm extends TestBase {

    static JobApplicationFormPages jobApplicationFormPages = new JobApplicationFormPages();


    private static final String ROLE = "QA Automation Engineer";
    private static final String SEARCHRESULT = "/en/jobs/qa-automation-engineer-gkt-team-barcelona/";
    private static final String UPLOADEDCV = "src/test/resources/dummy.pdf";


    @Test
    @Tag("smoke")
    @DisplayName("Check of filling out a job application form")
    void checkApplicationJobForm() {

        TestData testData = TestData.generate();

        step("Open the main page", () -> {
            jobApplicationFormPages.openPage();
        });
        step("Close modal form", () -> {
            jobApplicationFormPages.closeModalForm();
        });
        step("Decline cookies", () -> {
            jobApplicationFormPages.declineCookies();
        });
        step("Click on the search input", () -> {
            jobApplicationFormPages.searchJobs("");
        });
        step("Type role position in search field", () -> {
            jobApplicationFormPages.searchJobs(ROLE);
        });
        step("Click on the button 'Search'", () -> {
            jobApplicationFormPages.searchButtonClick();
        });
        step("Close modal form", () -> {
            jobApplicationFormPages.closeModalForm();
        });
        step("Click on the job title", () -> {
            jobApplicationFormPages.checkJobList(ROLE, SEARCHRESULT);
        });
        step("Click to the button 'Apply for this job'", () -> {
            jobApplicationFormPages.clickButton("Apply for this job");
            // Action-sc-clo9bl-0 Button-sc-nfo0lm-0 gKnwqK
        });
        step("Set first name", () -> {
            jobApplicationFormPages.setFirstName(testData.firstName);
        });
        step("Set email", () -> {
            jobApplicationFormPages.setEmail(testData.email);
        });
        step("Set phone number", () -> {
            jobApplicationFormPages.setPhone(testData.phone);
        });
        step("Upload CV", () -> {
            jobApplicationFormPages.uploadCV(UPLOADEDCV);
        });
        step("Check the button 'Apply for this job'", () -> {
            jobApplicationFormPages.checkSubmitButton("Apply for this job");
        });
    }
}
