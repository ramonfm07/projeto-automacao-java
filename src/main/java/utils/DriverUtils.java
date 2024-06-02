package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class DriverUtils {

    private static WebDriver driver;
    private static Properties properties = new Properties();

    static {
        try (InputStream input = DriverUtils.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Desculpe, não foi possível encontrar o config.properties");
            } else {
                properties.load(input);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // Inicia o navegador maximizado
            // Adicione mais opções conforme necessário

            driver = new ChromeDriver(options);

            String implicitWait = properties.getProperty("webdriver.implicit.wait");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(implicitWait)));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static String getTestUrl() {
        return properties.getProperty("test.url");
    }
}
