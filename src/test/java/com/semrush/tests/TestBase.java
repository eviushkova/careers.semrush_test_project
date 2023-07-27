package com.semrush.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;


public class TestBase {

    @BeforeAll
    static void configure() {

        String selenoidUrl = System.getProperty("selenoid_url");
        String selenoidLoginPassword = System.getProperty("selenoid_login_password");
        selenoidUrl = selenoidUrl.replaceAll("https://", "");
        Configuration.remote = "https://" + selenoidLoginPassword + "@" + selenoidUrl;
        Configuration.pageLoadStrategy = "eager";

        Configuration.baseUrl = System.getProperty("base_url", "https://careers.semrush.com");

        String[] browser = System.getProperty("browser", "chrome:100.0").split(":");
        Configuration.browser = browser[0];
        Configuration.browserVersion = browser[1];


        Configuration.browserVersion = System.getProperty("browser_version", "100");
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.timeout = 10000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> prop = new HashMap<>();
        prop.put("enableVNC", true);
        prop.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", prop);

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if (Configuration.remote != null) {
            Attach.addVideo();
        }
        Selenide.closeWebDriver();
    }
}
