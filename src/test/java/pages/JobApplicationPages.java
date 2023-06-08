package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JobApplicationPages {


    // Selenide elements

    SelenideElement
            modalForm = $(".Modal__Close-sc-1vmsgmv-1"),
            cookies = $(".ch2-deny-all-btn"),
            blockTitle = $(".Content__MainBannerTitle-sc-z3mvp8-1"),
            jobs = $(".JobsBlock__Jobs-sc-1o1ezaw-0"),
            searchInput = $("#search-jobs"),
            searchButton = $(".JobsSearch__SearchButton-sc-8zx7e9-6"),
            jobList = $("#jobs-list"),
            applyForThisJobButton = $(".Button-sc-nfo0lm-0"),
            firstNameInput = $("#firstName"),
            emailInput = $("#email"),
            phoneInput = $("#phone"),
            uploadCVInput = $("#upload");

    // Actions

    public JobApplicationPages openPage() {
        open("https://careers.semrush.com");

        return this;
    }

    public JobApplicationPages closeModalForm() {
        modalForm.click();

        return this;
    }

    public JobApplicationPages declineCookies() {
        cookies.click();

        return this;
    }

    public JobApplicationPages checkTitle(String title) {
        blockTitle.shouldHave(text(title));

        return this;
    }

    public JobApplicationPages checkJobsBlock() {
        jobs.scrollIntoView(true);
        jobs.shouldBe(visible);

        return this;
    }

    public JobApplicationPages searchJobs(String role) {
        searchInput.click();
        searchInput.setValue(role).pressEnter();

        return this;
    }

    public JobApplicationPages searchButtonClick() {
        searchButton.click();

        return this;
    }

    public JobApplicationPages checkJobList(String value) {
        jobList.shouldHave(text(value));
        jobList.$(byText(value)).click();

        return this;
    }

    public JobApplicationPages clickButton() {
        applyForThisJobButton.click();

        return this;
    }

    public JobApplicationPages setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public JobApplicationPages setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public JobApplicationPages setPhone(String value) {
        phoneInput.setValue(value);

        return this;
    }

    public JobApplicationPages uploadCV(String cv) {
        uploadCVInput.uploadFile((new File(cv)));

        return this;
    }

    public JobApplicationPages checkApplyButton() {
        applyForThisJobButton.scrollIntoView(true).shouldBe(visible);

        return this;
    }
}
