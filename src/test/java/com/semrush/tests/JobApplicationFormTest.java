package com.semrush.tests;

import com.semrush.pages.JobApplicationFormPages;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.semrush.tests.TestData.*;
import static io.qameta.allure.Allure.step;

@Owner("Elena Viushkova")
@Tag("ui")
public class JobApplicationFormTest extends TestBase {

    static JobApplicationFormPages jobApplicationFormPages = new JobApplicationFormPages();

    @Test
    @Tag("smoke")
    @DisplayName("Check of filling out a job application form")
    void checkApplicationJobForm() {

        TestData testData = TestData.generate();

        step("Open the main page", () ->
            jobApplicationFormPages.openPage()
        );
        step("Click on the search input", () ->
            jobApplicationFormPages.searchJobs("")
        );
        step("Type role position in search field", () ->
            jobApplicationFormPages.searchJobs(ROLE)
        );
        step("Click on the button 'Search'", () ->
            jobApplicationFormPages.searchButtonClick()
        );
        step("Click on the job title", () ->
            jobApplicationFormPages.checkJobList(ROLE, SEARCHRESULT)
        );
        step("Click to the button 'Apply for this job'", () ->
            jobApplicationFormPages.clickButton("Apply for this job")
        );
        step("Set first name", () ->
            jobApplicationFormPages.setFirstName(testData.firstName)
        );
        step("Set email", () ->
            jobApplicationFormPages.setEmail(testData.email)
        );
        step("Set phone number", () ->
            jobApplicationFormPages.setPhone(testData.phone)
        );
        step("Upload CV", () ->
            jobApplicationFormPages.uploadCV(UPLOADEDCV)
        );
        step("Check the button 'Apply for this job'", () ->
            jobApplicationFormPages.checkSubmitButton("Apply for this job")
        );
    }
}
