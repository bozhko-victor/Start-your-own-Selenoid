package ru.mycompany;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SomeTests extends TestBase {

    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");

        $(byName("q")).setValue("selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));

        //  скриншот сохраняется в папке build/reports/tests/test
        String pngFileName = screenshot("screenshot_results");
    }

}
