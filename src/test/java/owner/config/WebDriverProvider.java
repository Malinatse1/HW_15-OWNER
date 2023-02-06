package owner.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverProvider {
    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    public static void setupDriverConfig(){
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();

        if (config.isRemote()) {
            Configuration.remote = config.getRemoteUrl();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }
}