package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    WebDriver driver;
    Duration duration;
    WebDriverWait wait;

    By pageTitleWrapper = By.cssSelector("[data-ui-id=\"page-title-wrapper\"]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);
    }

    public WebElement getPageTitleWrapper() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitleWrapper));
    }
}
