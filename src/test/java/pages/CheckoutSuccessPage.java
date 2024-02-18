package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.time.Duration;

import static org.apache.commons.io.FileUtils.copyFile;

public class CheckoutSuccessPage extends BaseTest {
    WebDriver driver;
    Duration duration;
    WebDriverWait wait;
    By pageTitleWrapper = By.cssSelector("span[data-ui-id=\"page-title-wrapper\"]");
    By continueShoppingLink = By.cssSelector(".action.primary.continue");
    By createAnAccountLink = By.cssSelector("span[data-bind=\"i18n: 'Create an Account'\"]");

    public CheckoutSuccessPage(WebDriver d) {
        this.driver = d;
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);
    }

    public WebElement getPageTitleWrapper() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitleWrapper));
    }

    public void waitForPageLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingLink));
    }
}
