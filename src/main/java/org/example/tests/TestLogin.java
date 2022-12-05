package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.MainPage;
import org.example.values.OKValues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 10)
public class TestLogin extends BaseTest {
    @Test
    @DisplayName("Login Test")
    public void testLogin() {
        LoginPage login = new LoginPage();
        login.check();
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        MainPage main = new MainPage();
        assertEquals(OKValues.LOGIN + " " + OKValues.LOGIN, main.getUserName());
    }
}
