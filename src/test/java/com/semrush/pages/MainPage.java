package com.semrush.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement
            blockTitle = $(".Content__MainBannerTitle-sc-z3mvp8-1"),
            teamMember = $(".Team__RowTeam-sc-bz1m27-0"),
            badgeGreatPlace = $(".great-place"),
            badgeFast500 = $(".fast-500"),
            badgeDiversity = $(".diversity"),
            facebook = $(".SocialLink__Facebook-sc-17bee46-2"),
            tikTok = $(".SocialLink__TikTok-sc-17bee46-8"),
            instagram = $(".SocialLink__Instagram-sc-17bee46-6"),
            glassdoor = $(".SocialLink__GlassDoor-sc-17bee46-7"),
            youtube = $(".SocialLink__Youtube-sc-17bee46-3"),
            linkedin = $(".SocialLink__LinkedIn-sc-17bee46-4"),
            benefitBlock = $(".Content__BenefitTitle-sc-1sf0fme-1"),
            officeLocationsBlock = $(".Count__LocationsCountBlock-sc-9fduka-0");

    public MainPage openPage() {
        open("https://careers.semrush.com");

        return this;
    }

    public MainPage checkTitle(String title) {
        blockTitle.shouldHave(text(title));

        return this;
    }

    public MainPage checkTeamMemberCard(String role) {
        teamMember.shouldHave(text(role));

        return this;
    }

    public MainPage checkBadgeGreatPlace(String link) {
        badgeGreatPlace.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkBadgeFast500(String link) {
        badgeFast500.shouldHave(attribute("src", link));

        return this;
    }

    public MainPage checkBadgeDiversity(String link) {
        badgeDiversity.shouldHave(attribute("src", link));

        return this;
    }

    public MainPage checkFacebookLink(String link) {
        facebook.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkTiKTokLink(String link) {
        tikTok.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkInstagramLink(String link) {
        instagram.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkGlassdoorLink(String link) {
        glassdoor.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkYoutubeLink(String link) {
        youtube.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkLinkedinLink(String link) {
        linkedin.parent().shouldHave(href(link));

        return this;
    }

    public MainPage checkBenefitBlockTitlesValue(String title) {
        benefitBlock.$(byText(title));

        return this;
    }

    public MainPage checkOfficeLocationsBlockTitle(String title) {
        officeLocationsBlock.shouldHave(text(title));

        return this;
    }
}
