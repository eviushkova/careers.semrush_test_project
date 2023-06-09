package com.semrush.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {

    static MainPage mainPage = new MainPage();

    private static final String TITLE = "New Stars  Are Born Here";
    private static final String CEO = "Oleg Shchegolev";
    private static final String CO_FOUNDER = "Dmitri Melnikov";
    private static final String PRESIDENT = "Eugene Levin";
    private static final String CHIEF_FINANCIAL_OFFICER = "Brian Mulroy";
    private static final String CHIEF_SALES_OFFICER = "Channing Ferrer";
    private static final String CHIEF_HR_OFFICER = "Tatiana Starikova";
    private static final String CHIEF_OPERATIONS_OFFICER = "Vitalii Obishchenko";
    private static final String CHIEF_MARKETING_OFFICER = "Andrew Warden";
    private static final String CHIEF_INFORMATION_OFFICER = "Alex Sukennik";
    private static final String GENERAL_COUNSEL_AND_SECRETARY = "David Mason";
    private static final String BADGE_GREAT_PLACE = "https://www.greatplacetowork.com/certified-company/7038282";
    private static final String BADGE_FAST500 = "https://careers.semrush.com/fast_500.png";
    private static final String BADGE_DIVERSITY = "https://careers.semrush.com/static/diversity-jobs-24bded34fd397afa8137a811ff08967f.png";
    private static final String FACEBOOK = "https://www.facebook.com/Semrushlife";
    private static final String TIKTOK = "https://www.tiktok.com/@semrush_life";
    private static final String INSTAGRAM = "https://www.instagram.com/semrush_life";
    private static final String GLASSDOOR = "https://www.glassdoor.co.uk/Overview/Working-at-Semrush-EI_IE1084676.11,18.htm?countryRedirect=true";
    private static final String YOUTUBE = "https://www.youtube.com/user/SemrushHQ";
    private static final String LINKEDIN = "https://linkedin.com/company/semrush";

    void preconditions() {
        step("Open the main page", () -> {
            mainPage.openPage();
        });
        step("Close modal form", () -> {
            mainPage.closeModalForm();
        });
        step("Decline cookies", () -> {
            mainPage.declineCookies();
        });
    }


    @Test
    @Tag("Smoke")
    @DisplayName("Check title name on the main page")
    void checkTitleOnTheMainPage() {
        preconditions();

        step("Check title on the main page exists " + TITLE, () -> {
            mainPage.checkTitle(TITLE);
        });
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Check team members cards in 'Executive Management' block")
    void checkTeamMembersCards() {
        preconditions();

        step("Check if CEO card exists " + CEO, () -> {
            mainPage.checkTeamMemberCard(CEO);
        });
        step("Check if Co-founder card exists " + CO_FOUNDER, () -> {
            mainPage.checkTeamMemberCard(CO_FOUNDER);
        });
        step("Check if CEO card exists " + PRESIDENT, () -> {
            mainPage.checkTeamMemberCard(PRESIDENT);
        });
        step("Check if CEO card exists " + CHIEF_FINANCIAL_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_FINANCIAL_OFFICER);
        });
        step("Check if CEO card exists " + CHIEF_SALES_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_SALES_OFFICER);
        });
        step("Check if CEO card exists " + CHIEF_HR_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_HR_OFFICER);
        });
        step("Check if CEO card exists " + CHIEF_OPERATIONS_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_OPERATIONS_OFFICER);
        });
        step("Check if CEO card exists " + CHIEF_MARKETING_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_MARKETING_OFFICER);
        });
        step("Check if CEO card exists " + CHIEF_INFORMATION_OFFICER, () -> {
            mainPage.checkTeamMemberCard(CHIEF_INFORMATION_OFFICER);
        });
        step("Check if CEO card exists " + GENERAL_COUNSEL_AND_SECRETARY, () -> {
            mainPage.checkTeamMemberCard(GENERAL_COUNSEL_AND_SECRETARY);
        });
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Check badges in footer")
    void checkBadges() {
        preconditions();

        step("Check if badge exists " + BADGE_GREAT_PLACE, () -> {
            mainPage.checkBadgeGreatPlace(BADGE_GREAT_PLACE);
        });
        step("Check if badge exists " + BADGE_FAST500, () -> {
            mainPage.checkBadgeFast500(BADGE_FAST500);
        });
        step("Check if badge exists " + BADGE_DIVERSITY, () -> {
            mainPage.checkBadgeDiversity(BADGE_DIVERSITY);
        });
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Check social links in footer")
    void checkSocialLinks() {
        preconditions();

        step("Check social link " + FACEBOOK, () -> {
            mainPage.checkFacebookLink(FACEBOOK);
        });
        step("Check social link " + TIKTOK, () -> {
            mainPage.checkTiKTokLink(TIKTOK);
        });
        step("Check social link " + INSTAGRAM, () -> {
            mainPage.checkInstagramLink(INSTAGRAM);
        });
        step("Check social link " + GLASSDOOR, () -> {
            mainPage.checkGlassdoorLink(GLASSDOOR);
        });
        step("Check social link " + YOUTUBE, () -> {
            mainPage.checkYoutubeLink(YOUTUBE);
        });
        step("Check social link " + LINKEDIN, () -> {
            mainPage.checkYLinkedinLink(LINKEDIN);
        });

    }

}
