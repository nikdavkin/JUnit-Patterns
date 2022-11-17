import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.junit.jupiter.api.Assertions.*;


@Timeout(value = 100, unit = TimeUnit.SECONDS)
public class MyTest {

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://ok.ru/";
        System.out.println("Start of the tests");
    }

    @Test
    @DisplayName("Message Test")
    public void ok() {
        LoginPage login = new LoginPage();
        MainPage main = new MainPage();
        MessagePage message = new MessagePage();
        login.open().Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        main.openMessages();
        message.find("Спутник").printMessage("Привет");
        //Почему-то не работает, если есть непрочитанное сообщение от спутника. Поэтому сначала надо прочитать, а потом запускать тест.
        closeWebDriver();
    }

    @DisplayName("Multiple test")
    @Tag("example")
    @Test
    public void groupTest() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertAll("nums",
                () -> assertEquals(nums[0], 0),
                () -> assertEquals(nums[1], 1),
                () -> assertEquals(nums[2], 2),
                () -> assertEquals(nums[3], 3),
                () -> assertEquals(nums[4], 4),
                () -> assertEquals(nums[5], 5),
                () -> assertEquals(nums[6], 6),
                () -> assertEquals(nums[7], 7),
                () -> assertEquals(nums[8], 8),
                () -> assertEquals(nums[9], 9)
        );
    }

    @Disabled("Test isn't working right now")
    @Test
    public void disabledTest() {
        assertEquals(10, 10);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4})
    public void parameterizedTest(int number) {
        assertTrue(number < 5);
    }

    @DisplayName("LoadableComponentTest")
    @Test
    public void loadableComponentLoginTest() {
        LoginPage login = new LoginPage();
        login.load();
        login.isLoaded();//Если в isLoaded неправильный XPath, тест не проходит => Метод работает
        login.Authorization(OKValues.LOGIN, OKValues.PASSWORD);
        closeWebDriver();
    }

    @DisplayName("DecoratorTest")
    @Test
    public void decoratorTest() {
        LoginPageDecorator decorator = new LoginPageDecorator();
        decorator.open();
        closeWebDriver();
    }

    @ParameterizedTest(name = "Проверяем несколько тест ботов")
    @ValueSource(strings = {OKValues.LOGIN, "Nikita123"})
    public void ValueObjectDataProviderTest(String argument) {
        TestBot testBot1 = new TestBot(OKValues.LOGIN, OKValues.PASSWORD);
        TestBot testBot2 = new TestBot("Nikita", "Nikita123");
        assertTrue(testBot1.getLOGIN().equals(argument) || testBot2.getPASSWORD().equals(argument), "Error");
    }

    @AfterAll
    public static void endMessage() {
        System.out.println("End of the tests");
    }
}
