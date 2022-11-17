import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;

public final class OKValues {
    public static final By LOGIN_BUTTON = byXpath("//*[@id='field_email']");
    public static final String URL = "https://ok.ru/";
    public static final String LOGIN = "technoPol7";
    public static final String PASSWORD = "technoPolis2022";
    public static final By PASSWORD_BUTTON = byXpath("//*[@id='field_password']");
    public static final By TOOLBAR = byXpath("//*[@class='toolbar_nav_i_ic']");
    public static final By MESSAGE = byXpath("//*[contains(@data-tsid,'write_msg_input')]");
    public static final By MSG_BUTTON = byXpath("//*[@data-tsid='button_send']");
    public static final By VK_BUTTON = byXpath("//*[contains(@class,'vk_id')]");
}
