package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://demoqa.com")
     String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowserName();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();

    @Key("remote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("videoUrl")
    @DefaultValue("https://selenoid.autotests.cloud/video/")
    String getVideoUrl();

    @Key("videoFormat")
    @DefaultValue(".mp4")
    String getVideoFormat();

}
