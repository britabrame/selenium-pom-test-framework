package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SearchResultsPage {
    WebDriver driver;
    Duration duration;
    WebDriverWait wait;
    By search = By.cssSelector("#search");
    By searchResults = By.cssSelector(".search.results");
    By pageTitleWrapper = By.cssSelector("[data-ui-id=\"page-title-wrapper\"]");
    // List item from search results
    By productItem = By.cssSelector("li.item.product.product-item:not([class*=\"odd\"])");
    By productItemDetails = By.cssSelector(".product.details.product-item-details");
    By productName = By.cssSelector("a.product-item-link");
    By addToCartButton = By.cssSelector("button[title=\"Add to Cart\"]");
    By successBanner = By.cssSelector("div[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"");
    By cartLink = By.cssSelector("a[class=\"action showcart\"]");
    By miniCart = By.cssSelector("#ui-id-1");
    By miniCartProceedToCheckoutButton = By.cssSelector("#top-cart-btn-checkout");
    By miniCartItemsListItem = By.cssSelector("li[class=\"item product product-item\"]");
    By productItemLink = By.cssSelector("a[class=\"product-item-link\"]");
    By productItemPhoto = By.cssSelector(".product-image-photo");
//    By productItemPhotoLoadingMask = By.cssSelector(".product-image-photo.swatch-option-loading");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(this.driver, duration);
    }

    public WebElement getPageTitleWrapper() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitleWrapper));
    }

    public List<WebElement> getProductItemDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productItemDetails));
        return driver.findElements(productItemDetails);
    }

    public List<WebElement> getProductItems(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productItemDetails));
        return driver.findElements(productItem);
    }

    public WebElement getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
    }

    public void addItemToCart(String name, String size, String color) {
        // Get the list of all products from search results. Add the item with matching name to cart.
        List<WebElement> list = getProductItems();
        for (WebElement webElement : list) {
            String currentProductName = wait.until(ExpectedConditions.visibilityOf(webElement.findElement(productItemLink))).getText();
            if (currentProductName.equals(name)) {
                // Select size, wait for loading mask to stop
                wait.until(ExpectedConditions.elementToBeClickable(webElement.findElement(By.cssSelector("div[option-label=\"" + size + "\"]")))).click();
                wait.until(ExpectedConditions.visibilityOf(webElement.findElement(productItemPhoto)));

                // Select color, wait for loading mask to stop
                wait.until(ExpectedConditions.elementToBeClickable(webElement.findElement(By.cssSelector("div[option-label=\"" + color + "\"]")))).click();
                wait.until(ExpectedConditions.visibilityOf(webElement.findElement(productItemPhoto)));

                // Click add to cart, wait for loading mask to stop
                wait.until(ExpectedConditions.elementToBeClickable(webElement.findElement(addToCartButton))).click();
                wait.until(ExpectedConditions.visibilityOf(webElement.findElement(productItemPhoto)));
                break;
            }
        }
    }

    public WebElement getSuccessBanner() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successBanner));
    }

    public WebElement getSearch(){
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(search)));
    }

    public WebElement getCart() {
        return wait.until(ExpectedConditions.elementToBeClickable(cartLink));
    }

    public WebElement getMiniCart() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(miniCart));
    }

    public List<WebElement> getMiniCartProductListItems() {
        wait.until(ExpectedConditions.elementToBeClickable(miniCartItemsListItem));
        return getMiniCart().findElements(miniCartItemsListItem);
    }

    public WebElement getMiniCartProceedToCheckoutButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(miniCartProceedToCheckoutButton));
    }

    public WebElement getSearchResults() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));
    }

    public void searchFor(String searchTerm) {
        getSearch().clear();
        getSearch().sendKeys(searchTerm + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));
    }


}
