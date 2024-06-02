package steps;

import functionalities.LoginFunctionality;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverUtils;

public class LoginSteps {

    WebDriver driver = DriverUtils.getDriver();
    LoginFunctionality loginFunctionality = new LoginFunctionality(driver);

    @Given("o usuário está na página de login")
    public void usuario_na_pagina_login() {
        String url = DriverUtils.getTestUrl();
        driver.get(url);
    }

    @When("o usuário entra com usuário {string} e senha {string}")
    public void usuario_entra_com_usuario_e_senha(String username, String password) {
        loginFunctionality.performLogin(username, password);
    }

    @Then("o usuário deve ser logado com sucesso")
    public void usuario_deve_ser_logado_com_sucesso() {
        // código para verificar login bem-sucedido
    }
}
