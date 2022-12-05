package org.example.pages;

import com.codeborne.selenide.Condition;
import org.example.values.OKValues;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void Authorization(String login, String password) {
        $(OKValues.LOGIN_BUTTON).setValue(login);
        $(OKValues.PASSWORD_BUTTON).setValue(password).pressEnter();
    }

    public void check() {
        $(OKValues.LOGIN_BUTTON).shouldBe(Condition.visible);
        $(OKValues.PASSWORD_BUTTON).shouldBe(Condition.visible);
    }
}
