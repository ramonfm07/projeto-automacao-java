package functionalities;

import org.openqa.selenium.WebDriver;
import actions.LoginActions;

public class LoginFunctionality {
    LoginActions loginActions;

    public LoginFunctionality(WebDriver driver) {
        loginActions = new LoginActions(driver);
    }

    public void performLogin(String username, String password) {
        loginActions.login(username, password);
    }
}
