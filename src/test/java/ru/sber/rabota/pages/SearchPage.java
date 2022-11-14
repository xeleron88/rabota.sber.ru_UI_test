package ru.sber.rabota.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchPage {
    public void VacanciesNotNull() {
        sleep(3000);
        $(".styled__ListColumn-sc-76mli3-3").shouldNotHave(text("Ничего не нашлось"));
    }

    public void VacanciesIsNull() {
        sleep(3000);
        $(".styled__ListColumn-sc-76mli3-3").shouldHave(text("Ничего не нашлось"));
    }

    public void EnterSearchQuery(String query) {
        $(".styled__Input-sc-76mli3-7").setValue(query).pressEnter();
    }

    public void EnterLocation(String location) {
        $(".styled__Input-sc-1wpi8if-0").setValue(location);
    }

    public void SelectLocationFromList(String location) {
        $(".styled__SearchItem-sc-7q6vjc-3").shouldHave(text(location)).click();
        sleep(5000);
    }

    public void CheckResults(String location) {
        int countOfResultBlocks = $$(".styled__Card-sc-192d1yv-1").size();
        int countOfResultLocations = $$(".kkMmnR").filterBy(text(location)).size();
        assertThat(countOfResultBlocks).isEqualTo(countOfResultLocations);
    }
}
