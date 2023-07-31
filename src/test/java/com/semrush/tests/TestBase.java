package com.semrush.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.semrush.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.chrome.ChromeOptions.CAPABILITY;

public class TestBase {

    protected static boolean isRemote = Boolean.getBoolean("isRemote");

    @BeforeAll
    static void configure() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> prop = new HashMap<>();
        prop.put("enableVNC", true);
        prop.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", prop);

        if (isRemote) {
            String selenoidUrl = System.getProperty("selenoid_url");
            String selenoidLoginPassword = System.getProperty("selenoid_login_password");
            selenoidUrl = selenoidUrl.replaceAll("https://", "");
            Configuration.remote = "https://" + selenoidLoginPassword + "@" + selenoidUrl;
            Configuration.pageLoadStrategy = "eager";
        } else {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
            capabilities.setCapability(CAPABILITY, options);
        }

        Configuration.browserCapabilities = capabilities;

        Configuration.baseUrl = System.getProperty("base_url", "https://careers.semrush.com");

        String[] browser = System.getProperty("browser", "chrome:100.0").split(":");
        Configuration.browser = browser[0];
        Configuration.browserVersion = browser[1];


        Configuration.browserVersion = System.getProperty("browser_version", "100");
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.timeout = 10000;
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
