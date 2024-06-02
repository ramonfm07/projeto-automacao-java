package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverUtils;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = DriverUtils.getDriver();
        // Realizar configurações adicionais se necessário
    }

    @After
    public void tearDown() {
        DriverUtils.quitDriver();
    }
}
