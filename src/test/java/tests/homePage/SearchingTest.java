package tests.homePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.BaseTest;
import java.util.List;

public class SearchingTest extends BaseTest {

    @Test(description = "dropdown populates with correct autocomplete options")
    public void verifyAutocompleteOptions() {
        customActions.slowType(homePage.getSearch(), "tan");

        List<WebElement> list = homePage.getAutocompleteOptions();
        list.forEach( webElement -> {
            Assert.assertTrue(webElement.getText().toLowerCase().contains("tan"));
        });
    }

    @Test(description = "can press Enter to execute search")
    public void inputSearchAndPressEnter() {
        homePage.getSearch().sendKeys("tank" + Keys.RETURN);

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "catalogsearch/result/?q=tank");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Search results for: 'tank'");
    }



}
