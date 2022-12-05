package org.example.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeAll
    public static void open() {
        Selenide.open("https://ok.ru/");
    }

    @AfterAll
    public static void close() {
        closeWebDriver();
    }
}
