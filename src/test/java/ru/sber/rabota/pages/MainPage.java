package ru.sber.rabota.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPage {
    public void checkTopMenu(String menuItem) {

        $$(".styled__HeaderLinkWrapper-sc-s1lnm1-4").findBy(text(menuItem)).shouldHave(text(menuItem));

    }

    public void checkSearchMainPage(String searchQuery) {
        $(".styled__Input-sc-1x2hexv-0").setValue(searchQuery).pressEnter();
    }
}
