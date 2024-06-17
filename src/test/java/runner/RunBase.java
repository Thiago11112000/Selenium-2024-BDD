package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RunBase {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver initDriver(String browser) {
        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case "chrome-ci":
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--headless");
                option.addArguments("--disable-gpu");
                option.addArguments("--window-size=1920,1080");
                option.addArguments("--disable-extensions");
                option.addArguments("--no-sandbox");
                driver = new ChromeDriver(option);
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                throw new IllegalArgumentException("O navegador EDGE AINDA NÃO É SUPORTADO");
            default:
                throw new IllegalArgumentException("Navegador não encontrado. Passe um navegador válido");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
    }

