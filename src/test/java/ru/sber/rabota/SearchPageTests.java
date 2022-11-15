package ru.sber.rabota;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sber.rabota.pages.AllPages;
import ru.sber.rabota.pages.SearchPage;

import static io.qameta.allure.Allure.step;

public class SearchPageTests extends TestBase {
    SearchPage searchPage = new SearchPage();
    AllPages allPages = new AllPages();

    @Test
    @DisplayName("Checking the page title and the h1")
    void checkTitleAndH1() {
        step("Open search page", () -> {
            allPages.openPage("/search");
        });

        step("Checking the site title", () -> {
            allPages.checkTitle("Поиск вакансий");
        });

        step("Checking the site h1", () -> {
            allPages.checkH1("Вакансии");
        });
    }


    @Test
    @DisplayName("Checking the functionality of the search on the search page")
    void checkSearchOnSearchPage() {
        step("Open search page", () -> {
            allPages.openPage("/search");
        });

        step("Checking for empty vacancies", () -> {
            searchPage.vacanciesNotNull();
        });

        step("Enter a search query and press enter", () -> {
            searchPage.enterSearchQuery("frontend");
        });

        step("Checking for empty vacancies", () -> {
            searchPage.vacanciesNotNull();
        });
    }

    @Test
    @DisplayName("Checking filters by region and city")
    void checkFiltersByCity() {
        step("Open search page", () -> {
            allPages.openPage("/search");
        });

        step("Enter the region or city ", () -> {
            searchPage.enterLocation("Москва");
        });

        step("Select the region or city from the list", () -> {
            searchPage.selectLocationFromList("г Москва");
        });

        step("Checking the result for the selected location", () -> {
            searchPage.checkResults("г Москва");
        });

    }

    @Test
    @DisplayName("Search for a non existing vacancy")
    void checkBadSearchOnSearchPage() {
        step("Open search page", () -> {
            allPages.openPage("/search");
        });

        step("Checking for empty vacancies", () -> {
            searchPage.vacanciesNotNull();
        });

        step("Enter a search query and press enter", () -> {
            searchPage.enterSearchQuery("frontend1329873912");
        });

        step("Checking for empty vacancies", () -> {
            searchPage.vacanciesIsNull();
        });
    }

}
