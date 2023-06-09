package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JobApplicationFormPages {

    SelenideElement
            modalForm = $(".Modal__Close-sc-1vmsgmv-1"),
            cookies = $(".ch2-deny-all-btn"),
            jobs = $(".JobsBlock__Jobs-sc-1o1ezaw-0"),
            searchInput = $("#search-jobs"),
            searchButton = $(".JobsSearch__SearchButton-sc-8zx7e9-6"),
            jobList = $("#jobs-list"),
            jobResult = $(".JobStyled__JobTitle-sc-1ktxghj-0"),
            applyForThisJobButton = $(".Button-sc-nfo0lm-0"),
            firstNameInput = $("#firstName"),
            emailInput = $("#email"),
            phoneInput = $("#phone"),
            uploadCVInput = $("#upload");

    public JobApplicationFormPages openPage() {
        open("https://careers.semrush.com");

        return this;
    }

    public JobApplicationFormPages closeModalForm() {
        modalForm.click();

        return this;
    }

    public JobApplicationFormPages declineCookies() {
        cookies.click();

        return this;
    }

    public JobApplicationFormPages checkJobsBlock() {
        jobs.scrollIntoView(true);
        jobs.shouldBe(visible);

        return this;
    }

    public JobApplicationFormPages searchJobs(String role) {
        searchInput.click();
        searchInput.setValue(role).pressEnter();

        return this;
    }

    public JobApplicationFormPages searchButtonClick() {
        searchButton.click();

        return this;
    }

    public JobApplicationFormPages checkJobList(String value, String link) {
        jobList.shouldHave(text(value));
        jobResult.shouldHave(href(link)).click();

        return this;
    }

    public JobApplicationFormPages clickButton() {
        applyForThisJobButton.click();

        return this;
    }

    public JobApplicationFormPages setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public JobApplicationFormPages setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public JobApplicationFormPages setPhone(String value) {
        phoneInput.setValue(value);

        return this;
    }

    public JobApplicationFormPages uploadCV(String cv) {
        uploadCVInput.uploadFile((new File(cv)));

        return this;
    }

    public JobApplicationFormPages checkApplyButton() {
        applyForThisJobButton.scrollIntoView(true).shouldBe(visible);

        return this;
    }
}
