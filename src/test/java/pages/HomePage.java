package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.CustomActions;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    Duration duration;
    WebDriverWait wait;
    CustomActions customActions;
    Actions actions;
    By search = By.cssSelector("#search");
    By autocompleteDropdown = By.cssSelector("#search_autocomplete");
    By autocompleteOptions = By.cssSelector(".qs-option-name");

    By whatsNewLink = By.cssSelector("#ui-id-3");
    By womenLink = By.cssSelector("#ui-id-4");
    By womenTopsMenuItem = By.cssSelector("#ui-id-9");
    By womenTopsJacketsMenuItem = By.cssSelector("#ui-id-11");
    By womenTopsHoodiesAndSweatshirtsMenuItem = By.cssSelector("#ui-id-12");
    By womenTopsTeesMenuItem = By.cssSelector("#ui-id-13");
    By womenTopsBrasAndTanksMenuItem = By.cssSelector("#ui-id-14");
    By womenBottomsMenuItem = By.cssSelector("#ui-id-10");
    By womenBottomsPantsMenuItem = By.cssSelector("#ui-id-15");
    By womenBottomsShortsMenuItem = By.cssSelector("#ui-id-16");
    By menLink = By.cssSelector("#ui-id-5");
    By menTopsMenuItem = By.cssSelector("#ui-id-17");
    By menTopsJacketsMenuItem = By.cssSelector("#ui-id-19");
    By menTopsHoodiesAndSweatshirtsMenuItem = By.cssSelector("#ui-id-20");
    By menTopsTeesMenuItem = By.cssSelector("#ui-id-21");
    By menTopsTanksMenuItem = By.cssSelector("#ui-id-22");
    By menBottomsMenuItem = By.cssSelector("#ui-id-18");
    By menBottomsPantsMenuItem = By.cssSelector("#ui-id-23");
    By menBottomsShortsMenuItem = By.cssSelector("#ui-id-24");
    By gearLink = By.cssSelector("#ui-id-6");
    By gearBagsMenuItem = By.cssSelector("#ui-id-25");
    By gearFitnessEquipementMenuItem = By.cssSelector("#ui-id-26");
    By gearWatchesMenuItem = By.cssSelector("#ui-id-27");
    By trainingLink = By.cssSelector("#ui-id-7");
    By trainingVideoDownloadMenuItem = By.cssSelector("#ui-id-28");
    By saleLink = By.cssSelector("#ui-id-8");

    public HomePage(WebDriver d) {
        this.driver = d;
        duration = Duration.ofSeconds(30);
        wait = new WebDriverWait(driver, duration);
        customActions = new CustomActions(driver);
        actions = new Actions(driver);
    }

    public WebElement getSearch(){
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(search)));
    }

    public WebElement getAutocompleteDropdown() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(autocompleteDropdown)));
    }

    public List<WebElement> getAutocompleteOptions() {
        getAutocompleteDropdown();
        wait.until(ExpectedConditions.visibilityOfElementLocated(autocompleteOptions));
        return driver.findElements(autocompleteOptions);
    }

    public WebElement getWhatsNewLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(whatsNewLink)));
    }

    public WebElement getWomenLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenLink)));
    }

    public WebElement getWomenTopsMenuItem() {
        customActions.hover(getWomenLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenTopsMenuItem)));
    }

    public WebElement getWomenTopsJacketsMenuItem() {
        customActions.hover(getWomenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenTopsJacketsMenuItem)));
    }

    public WebElement getWomenTopsHoodiesAndSweatshirtsMenuItem() {
        customActions.hover(getWomenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenTopsHoodiesAndSweatshirtsMenuItem)));
    }

    public WebElement getWomenTopsTeesMenuItem() {
        customActions.hover(getWomenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenTopsTeesMenuItem)));
    }

    public WebElement getWomenTopsBrasAndTanksMenuItem() {
        customActions.hover(getWomenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenTopsBrasAndTanksMenuItem)));
    }

    public WebElement getWomenBottomsMenuItem() {
        customActions.hover(getWomenLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenBottomsMenuItem)));
    }

    public WebElement getWomenBottomsPantsMenuItem() {
        customActions.hover(getWomenBottomsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenBottomsPantsMenuItem)));
    }

    public WebElement getWomenBottomsShortsMenuItem() {
        customActions.hover(getWomenBottomsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womenBottomsShortsMenuItem)));
    }

    public WebElement getMenLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menLink)));
    }

    public WebElement getMenTopsMenuItem() {
        customActions.hover(getMenLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menTopsMenuItem)));
    }

    public WebElement getMensTopsJacketsMenuItem() {
        customActions.hover(getMenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menTopsJacketsMenuItem)));
    }

    public WebElement getMensTopsHoodiesAndSweatshirtsMenuItem() {
        customActions.hover(getMenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menTopsHoodiesAndSweatshirtsMenuItem)));
    }

    public WebElement getMensTopsTeesMenuItem() {
        customActions.hover(getMenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menTopsTeesMenuItem)));
    }

    public WebElement getMenTopsTanksMenuItem() {
        customActions.hover(getMenTopsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menTopsTanksMenuItem)));
    }

    public WebElement getMenBottomsMenuItem() {
        customActions.hover(getMenLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menBottomsMenuItem)));
    }

    public WebElement getMenBottomsPantsMenuItem() {
        customActions.hover(getMenBottomsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menBottomsPantsMenuItem)));
    }

    public WebElement getMenBottomsShortsMenuItem() {
        customActions.hover(getMenBottomsMenuItem());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(menBottomsShortsMenuItem)));
    }

    public WebElement getGearLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(gearLink)));
    }

    public WebElement getGearBagsMenuItem() {
        customActions.hover(getGearLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(gearBagsMenuItem)));
    }

    public WebElement getGearFitnessEquipmentMenuItem() {
        customActions.hover(getGearLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(gearFitnessEquipementMenuItem)));
    }

    public WebElement getGearWatchesMenuItem() {
        customActions.hover(getGearLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(gearWatchesMenuItem)));
    }

    public WebElement getTrainingLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(trainingLink)));
    }

    public WebElement getTrainingVideoDownloadMenuItem() {
        customActions.hover(getTrainingLink());

        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(trainingVideoDownloadMenuItem)));
    }

    public WebElement getSaleLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(saleLink)));
    }

}
