package com.semrush.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JobApplicationFormPages {

    SelenideElement
            jobs = $(".JobsBlock__Jobs-sc-1o1ezaw-0"),
            searchInput = $("#search-jobs"),
            searchButton = $(".JobsBlock__JobsSearchBlock-sc-1o1ezaw-2").$(byText("Search")),
            jobList = $("#jobs-list"),
            jobResult = $(".JobStyled__JobTitle-sc-1ktxghj-0"),
            applyForThisJobButton = $(".JobsApply__JobsApplyBlock-sc-s4c9o0-0"),
            firstNameInput = $("#firstName"),
            emailInput = $("#email"),
            phoneInput = $("#phone"),
            uploadCVInput = $("#upload"),
            submitButton = $(".SubmitButton__Button-sc-1nfzbya-0");

    public JobApplicationFormPages openPage() {
        open("https://careers.semrush.com");

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

    public JobApplicationFormPages clickButton(String buttonNameA) {
        applyForThisJobButton.$(byText(buttonNameA)).click();

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

    public JobApplicationFormPages checkSubmitButton(String buttonNameS) {
        submitButton.shouldHave(text(buttonNameS)).scrollIntoView(true);

        return this;
    }
}
