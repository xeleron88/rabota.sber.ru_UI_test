package ru.sber.rabota.properties;

public class Property {
    public static String browser() {
        return System.getProperty("browser", "chrome");
    }

    public static String browserVersion() {
        return System.getProperty("browserVersion", "chrome");
    }

    public static String browserSize() {
        return System.getProperty("browserSize", "1920x1080");
    }

    public static String remoteUrl() {
        return System.getProperty("remoteUrl", "");
    }
}
