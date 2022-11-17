import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage {
    public MessagePage find(String name) {
        $(byText(name)).click();
        return this;
    }

    public MessagePage printMessage(String message) {
        $(OKValues.MESSAGE).setValue(message);
        $(OKValues.MSG_BUTTON).click();
        return this;
    }
}
