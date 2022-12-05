package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.MainPage;
import org.example.pages.MessagePage;
import org.example.values.OKValues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 20)
public class TestSendMessage extends BaseTest {
    @Test
    @DisplayName("Message Test")
    public void testMessage(){
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        MainPage main = new MainPage();
        main.check();
        main.openMessages();
        MessagePage message = new MessagePage();
        message.find("Никита Давыдов").printMessage("Привет");
        assertTrue(message.getMessageText().contains("Привет"));
    }
}
