public class TestBot {
    private final String LOGIN;
    private final String PASSWORD;

    public TestBot(String LOGIN, String PASSWORD) {
        this.LOGIN = LOGIN;
        this.PASSWORD = PASSWORD;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
