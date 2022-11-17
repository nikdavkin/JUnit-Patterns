public class LoginPageDecorator extends LoginPage {
    @Override
    public LoginPage open() {
        super.open().Authorization(OKValues.LOGIN,OKValues.PASSWORD);
        return this;
    }
}
