package org.example.pages;

import com.codeborne.selenide.Condition;
import org.example.values.OKValues;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void openMessages() {
        $(OKValues.TOOLBAR).click();
    }

    public String getUserName() {
        return $(OKValues.USER_NAME).getText();
    }

    public void check() {
        $(OKValues.TOOLBAR).shouldBe(Condition.visible);
    }
}
