package tests.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.List;

public class EndToEndTest extends BaseTest {

    @Test
    public void shopAndCheckout() throws InterruptedException {
        // search for tanks from home page
        homePage.searchFor("tank");

        // add item to cart
        searchResultsPage.addItemToCart("Zoe Tank", "L", "Green");
        Assert.assertEquals(searchResultsPage.getSuccessBanner().getText(), "You added Zoe Tank to your shopping cart." );

        // search for shorts from results page
        searchResultsPage.searchFor("shorts");

        //add item to cart
        searchResultsPage.addItemToCart("Erika Running Short", "32", "Purple");
        Assert.assertEquals(searchResultsPage.getSuccessBanner().getText(), "You added Erika Running Short to your shopping cart." );

        // verify items in mini cart
        searchResultsPage.getCart().click();
        List<WebElement> list = searchResultsPage.getMiniCartProductListItems();
        Assert.assertEquals(list.get(0).findElement(By.cssSelector(".product-item-name")).getText(), "Erika Running Short");
        Assert.assertEquals(list.get(1).findElement(By.cssSelector(".product-item-name")).getText(), "Zoe Tank");

        // checkout
        searchResultsPage.getMiniCartProceedToCheckoutButton().click();

        // Shipping info
        checkoutShippingPage.waitForPageLoad();
        checkoutShippingPage.getEmailAddressInput().sendKeys("fakeEmail@email.com");
        checkoutShippingPage.getFirstNameInput().sendKeys("Michael");
        checkoutShippingPage.getLastNameInput().sendKeys("Scott");
        checkoutShippingPage.getCompanyInput().sendKeys("Dunder Mifflin");
        checkoutShippingPage.getStreetAddress1Input().sendKeys("Fake address");
        checkoutShippingPage.getCityInput().sendKeys("Scranton");
        checkoutShippingPage.getStateProvinceSelect().click();
        checkoutShippingPage.getStateProvinceSelectOptionPennsylvania().click();
        checkoutShippingPage.getZipPostalCodeInput().sendKeys("00000");
        checkoutShippingPage.getCountrySelect().click();
        checkoutShippingPage.getCountrySelectOptionUS().click();
        checkoutShippingPage.getPhoneNumberInput().sendKeys("0000000000");
        checkoutShippingPage.getFlatRateRadioButton().click();
        checkoutShippingPage.getNextButton().click();

        // Payment info + place order
        checkoutPaymentPage.waitForPageLoad();
        checkoutPaymentPage.getPlaceOrderButton().click();

        // Verify success
        checkoutSuccessPage.waitForPageLoad();
        Assert.assertEquals(checkoutSuccessPage.getPageTitleWrapper().getText(), "Thank you for your purchase!");
    }


}
