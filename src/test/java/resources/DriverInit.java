package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {
    private WebDriver driver;

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                    break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }
}
