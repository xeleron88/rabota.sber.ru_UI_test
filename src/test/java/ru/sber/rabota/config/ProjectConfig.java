package ru.sber.rabota.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/remote.properties",
})
public interface ProjectConfig extends Config {

    @DefaultValue("https://rabota.sber.ru")
    String baseURL();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("100.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("")
    String browserMobileView();

    @DefaultValue("")
    String remoteDriverUrl();

    String videoStorage();
}