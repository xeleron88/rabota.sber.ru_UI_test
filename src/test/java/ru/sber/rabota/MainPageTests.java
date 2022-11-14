package ru.sber.rabota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sber.rabota.pages.*;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AllPages allPages = new AllPages();

    @Test
    @DisplayName("Checking title on the main page")
    void checkTitle() {
        step("Open homepage", () -> {
            allPages.openPage("/");
        });

        step("Check title", () -> {
            allPages.checkTitle("Работа в Сбере");
        });
    }

    @Test
    @DisplayName("Checking the top menu for correct data")
    void checkTopMenu() {
        String[] menuItems = {"Вакансии", "Карьерные медиа", "Выпускникам и студентам"};

        step("Open homepage", () -> {
            allPages.openPage("/");
        });

        step("Check title", () -> {
            for (String menuItem : menuItems) {
                mainPage.checkTopMenu(menuItem);
            }
        });


    }
    @Test
    @DisplayName("Checking the functionality of the search on the main page")
    void checkSearchMainPage() {
        step("Open homepage", () -> {
            allPages.openPage("/");
        });

        step("Enter the query and press enter", () -> {
            mainPage.checkSearchMainPage("QA");
        });

        step("The result should not return 'Ничего не нашлось' ", () -> {
            searchPage.VacanciesNotNull();
        });
    }

    }


