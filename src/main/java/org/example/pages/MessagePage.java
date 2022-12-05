package org.example.pages;

import org.example.values.OKValues;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage {
    public MessagePage find(String name) {
        $(byText(name)).click();
        return this;
    }

    public MessagePage printMessage(String message) {
        $(OKValues.MESSAGE).click();
        $(OKValues.MESSAGE).sendKeys(message);
        $(OKValues.MSG_BUTTON).click();
        return this;
    }

    public String getMessageText() {
        return $(OKValues.LAST_MESSAGE).getText();
    }

}
