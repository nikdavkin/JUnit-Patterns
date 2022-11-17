import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void openMessages(){
        $(OKValues.TOOLBAR).click();
    }
}
