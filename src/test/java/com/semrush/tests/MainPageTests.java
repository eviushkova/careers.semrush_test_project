package com.semrush.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.semrush.tests.TestData.*;
import static io.qameta.allure.Allure.step;

@Owner("Elena Viushkova")
@Tag("ui")
public class MainPageTests extends TestBase {

    static MainPage mainPage = new MainPage();

    void preconditions() {
        step("Open the main page", () ->
            mainPage.openPage()
        );
        step("Decline cookies", () ->
            mainPage.declineCookies()
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check title name on the main page")
    void checkTitleOnTheMainPage() {
        preconditions();

        step("Check title on the main page exists " + TITLE, () ->
            mainPage.checkTitle(TITLE)
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check team members cards in 'Executive Management' block")
    void checkTeamMembersCards() {
        preconditions();

        step("Check if CEO card exists " + CEO, () ->
            mainPage.checkTeamMemberCard(CEO)
        );
        step("Check if Co-founder card exists " + CO_FOUNDER, () ->
            mainPage.checkTeamMemberCard(CO_FOUNDER)
        );
        step("Check if President card exists " + PRESIDENT, () ->
            mainPage.checkTeamMemberCard(PRESIDENT)
        );
        step("Check if Chief Financial Officer card exists " + CHIEF_FINANCIAL_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_FINANCIAL_OFFICER)
        );
        step("Check if Chief Sales Officer card exists " + CHIEF_SALES_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_SALES_OFFICER)
        );
        step("Check if Chief HR Officer card exists " + CHIEF_HR_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_HR_OFFICER)
        );
        step("Check if Chief Operations Officer card exists " + CHIEF_OPERATIONS_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_OPERATIONS_OFFICER)
        );
        step("Check if Chief Marketing Officer card exists " + CHIEF_MARKETING_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_MARKETING_OFFICER)
        );
        step("Check if Chief Information Officer card exists " + CHIEF_INFORMATION_OFFICER, () ->
            mainPage.checkTeamMemberCard(CHIEF_INFORMATION_OFFICER)
        );
        step("Check if General Counsel and Secretary card exists " + GENERAL_COUNSEL_AND_SECRETARY, () ->
            mainPage.checkTeamMemberCard(GENERAL_COUNSEL_AND_SECRETARY)
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check badges in footer")
    void checkBadges() {
        preconditions();

        step("Check if badge exists " + BADGE_GREAT_PLACE, () ->
            mainPage.checkBadgeGreatPlace(BADGE_GREAT_PLACE)
        );
        step("Check if badge exists " + BADGE_FAST500, () ->
            mainPage.checkBadgeFast500(BADGE_FAST500)
        );
        step("Check if badge exists " + BADGE_DIVERSITY, () ->
            mainPage.checkBadgeDiversity(BADGE_DIVERSITY)
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check social links in footer")
    void checkSocialLinks() {
        preconditions();

        step("Check social link " + FACEBOOK, () ->
            mainPage.checkFacebookLink(FACEBOOK)
        );
        step("Check social link " + TIKTOK, () ->
            mainPage.checkTiKTokLink(TIKTOK)
        );
        step("Check social link " + INSTAGRAM, () ->
            mainPage.checkInstagramLink(INSTAGRAM)
        );
        step("Check social link " + GLASSDOOR, () ->
            mainPage.checkGlassdoorLink(GLASSDOOR)
        );
        step("Check social link " + YOUTUBE, () ->
            mainPage.checkYoutubeLink(YOUTUBE)
        );
        step("Check social link " + LINKEDIN, () ->
            mainPage.checkLinkedinLink(LINKEDIN)
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check 'Сore Semrush Values'")
    void checkTitleHowWeHire() {
        preconditions();

        step("Check title 'Sense of Ownership'", () ->
            mainPage.checkBenefitBlockTitlesValue("Sense of Ownership")
        );
        step("Check title 'Sense of Ownership'", () ->
            mainPage.checkBenefitBlockTitlesValue("Constant Changes")
        );
        step("Check title 'Sense of Ownership'", () ->
            mainPage.checkBenefitBlockTitlesValue("Trust")
        );
    }

    @Test
    @Tag("smoke")
    @DisplayName("Check title in 'LocationsCountBlock'")
    void checkTitleOfficeLocations() {
        preconditions();

        step("Check title in 'Office locations' block", () ->
            mainPage.checkOfficeLocationsBlockTitle("13 offices, 1000+ Semrushers")
        );
    }
}
