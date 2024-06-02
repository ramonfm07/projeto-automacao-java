package actions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginActions {
    LoginPage loginPage;

    public LoginActions(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public void login(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}
