package tests.android;

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class WikipediaSearchTest extends TestBase {
    @Test
    void searchAppiumTest() {
        step("Вводим в поисковую строку Appium", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Проверяем что результат не нулевой", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void searchJavaTest() {
        step("Вводим в поисковую строку Java (programming language)", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java (programming language)");
        });
        step("Кликаем по Java (programming language) ", () ->
                $(id("org.wikipedia.alpha:id/page_list_item_description")).click());
        $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldHave(text("Error"));
    }
}
