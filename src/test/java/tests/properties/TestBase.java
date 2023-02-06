package tests.properties;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.config.WebDriverConfig;
import owner.config.WebDriverProvider;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    protected static WebDriverProvider webDriverProvider;
    protected static WebDriverConfig webDriverConfig;
    @BeforeAll
    public static void beforeAll() {
        webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        webDriverProvider  = new WebDriverProvider();
        webDriverProvider.setupDriverConfig();
    }
    @BeforeEach
    public void beforeEach() {
        open(webDriverConfig.getBaseUrl());
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}