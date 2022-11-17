import com.codeborne.selenide.*;
import org.openqa.selenium.support.ui.LoadableComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends LoadableComponent<LoginPage> {
    public LoginPage open() {
        Selenide.open("/");
        return this;
    }

    public void Authorization(String login, String password) {
        $(OKValues.LOGIN_BUTTON).setValue(login);
        $(OKValues.PASSWORD_BUTTON).setValue(password).pressEnter();
    }

    @Override
    protected void load() {
        this.open();
    }

    @Override
    protected void isLoaded() throws Error {
        $(OKValues.VK_BUTTON).shouldBe(Condition.visible.because("Page isn't loaded"));
    }
}
