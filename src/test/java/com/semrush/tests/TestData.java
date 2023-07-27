package com.semrush.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    public String firstName;
    public String email;
    public String phone;

    public static final String
            TITLE = "New Stars  Are Born Here",
            CEO = "Oleg Shchegolev",
            CO_FOUNDER = "Dmitri Melnikov",
            PRESIDENT = "Eugene Levin",
            CHIEF_FINANCIAL_OFFICER = "Brian Mulroy",
            CHIEF_SALES_OFFICER = "Channing Ferrer",
            CHIEF_HR_OFFICER = "Tatiana Starikova",
            CHIEF_OPERATIONS_OFFICER = "Vitalii Obishchenko",
            CHIEF_MARKETING_OFFICER = "Andrew Warden",
            CHIEF_INFORMATION_OFFICER = "Alex Sukennik",
            GENERAL_COUNSEL_AND_SECRETARY = "David Mason",
            BADGE_GREAT_PLACE = "https://www.greatplacetowork.com/certified-company/7038282",
            BADGE_FAST500 = "https://careers.semrush.com/fast_500.png",
            BADGE_DIVERSITY = "https://careers.semrush.com/static/diversity-jobs-24bded34fd397afa8137a811ff08967f.png",
            FACEBOOK = "https://www.facebook.com/Semrushlife",
            TIKTOK = "https://www.tiktok.com/@semrush_life",
            INSTAGRAM = "https://www.instagram.com/semrush_life",
            GLASSDOOR = "https://www.glassdoor.co.uk/Overview/Working-at-Semrush-EI_IE1084676.11,18.htm?countryRedirect=true",
            YOUTUBE = "https://www.youtube.com/user/SemrushHQ",
            LINKEDIN = "https://linkedin.com/company/semrush",
            ROLE = "QA Automation Engineer",
            SEARCHRESULT = "/en/jobs/qa-automation-engineer-solar-team-beograd/",
            UPLOADEDCV = "src/test/resources/dummy.pdf";

    public static TestData generate() {
        Faker faker = new Faker(new Locale("en"));
        TestData testData = new TestData();
        testData.firstName = faker.name().firstName();
        testData.email = faker.internet().emailAddress();
        testData.phone = faker.phoneNumber().subscriberNumber(11);

        return testData;
    }
}
