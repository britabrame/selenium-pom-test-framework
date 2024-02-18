package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.CustomActions;
import tests.BaseTest;

import java.time.Duration;

public class CheckoutShippingPage extends BaseTest {
    WebDriver driver;
    Duration duration;
    WebDriverWait wait;
    CustomActions customActions;
    Actions actions;
    By emailAddressInput = By.cssSelector("#customer-email");
    By firstNameInput = By.cssSelector("input[name=\"firstname\"]");
    By lastNameInput = By.cssSelector("input[name=\"lastname\"]");
    By companyInput = By.cssSelector("input[name=\"company\"]");
    By streetAddress1Input = By.cssSelector("input[name=\"street[0]\"]");
    By cityInput = By.cssSelector("input[name=\"city\"]");
    By stateProvinceSelect = By.cssSelector("select[name=\"region_id\"]");
    By stateProvinceSelectOptionPennsylvania = By.cssSelector("option[data-title=\"Pennsylvania\"]");
    By zipPostalCodeInput = By.cssSelector("input[name=\"postcode\"]");
    By countrySelect = By.cssSelector("select[name=\"country_id\"]");
    By countrySelectOptionUS = By.cssSelector("option[data-title=\"United States\"]");
    By phoneNumberInput = By.cssSelector("input[name=\"telephone\"]");
    By flatRateRadioButton = By.cssSelector("input[value=\"flatrate_flatrate\"]");
    By tableRateRadioButton = By.cssSelector("input[value=\"tablerate_bestway\"]");
    By nextButton = By.cssSelector(".button.action.continue.primary");

    By pageTitle = By.cssSelector(".step-title");

    public CheckoutShippingPage(WebDriver d) {
        this.driver = d;
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);
        customActions = new CustomActions(driver);
        actions = new Actions(driver);
    }

    public WebElement getEmailAddressInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressInput));
    }

    public WebElement getFirstNameInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
    }

    public WebElement getLastNameInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
    }

    public WebElement getCompanyInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(companyInput));
    }

    public WebElement getStreetAddress1Input() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(streetAddress1Input));
    }

    public WebElement getCityInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cityInput));
    }

    public WebElement getStateProvinceSelect() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceSelect));
    }

    public WebElement getStateProvinceSelectOptionPennsylvania() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceSelectOptionPennsylvania));

    }

    public WebElement getZipPostalCodeInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeInput));
    }

    public WebElement getCountrySelect() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(countrySelect));
    }

    public WebElement getCountrySelectOptionUS() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(countrySelectOptionUS));
    }

    public WebElement getPhoneNumberInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput));
    }

    public WebElement getFlatRateRadioButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(flatRateRadioButton));
    }

    public WebElement getTableRateRadioButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(tableRateRadioButton));
    }

    public WebElement getNextButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
    }

    public void waitForPageLoad() {
        getEmailAddressInput();
        getNextButton();
    }
}
