package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.time.Duration;

public class CheckoutPaymentPage extends BaseTest {
    WebDriver driver;
    Duration duration;
    WebDriverWait wait;
    By billingAddressSameAsShipppingCheckBox = By.cssSelector("#billing-address-same-as-shipping-checkmo");
    By billingAddressDetails = By.cssSelector(".billing-address-details");
    By placeOrderButton = By.cssSelector(".action.primary.checkout");

    public CheckoutPaymentPage(WebDriver d) {
        this.driver = d;
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);
    }

    public WebElement getBillingAddressSameAsShippingCheckBox() {
        return wait.until(ExpectedConditions.elementToBeClickable(billingAddressSameAsShipppingCheckBox));
    }

    public WebElement getPlaceOrderButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
    }

    public void waitForPageLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(billingAddressDetails));
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderButton));
    }
}
