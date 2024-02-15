package tests.homePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NavigationMenuTest extends BaseTest {

    @Test(description = "Use hover menu to navigate to What's New page")
    public void navigateToWhatsNewPage() {

        homePage.getWhatsNewLink().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "what-is-new.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "What's New");
    }

    @Test(description = "Use hover menu to navigate to Women page")
    public void navigateToWomenPage() {

        homePage.getWomenLink().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Women");
    }

    @Test(description = "Use hover menu to navigate to Women > Tops")
    public void navigateToWomenTopsPage() {

        homePage.getWomenTopsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/tops-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Tops");
    }

    @Test(description = "Use hover menu to navigate to Women > Tops > Jackets")
    public void navigateToWomenJacketsPage() {

        homePage.getWomenTopsJacketsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/tops-women/jackets-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Jackets");
    }

    @Test(description = "Use hover menu to navigate to Women > Tops > Hoodies & Sweatshirts")
    public void navigateToWomenHoodiesAndSweatshirtsPage() {

        homePage.getWomenTopsHoodiesAndSweatshirtsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/tops-women/hoodies-and-sweatshirts-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Hoodies & Sweatshirts");
    }

    @Test(description = "Use hover menu to navigate to Women > Tops > Tees")
    public void navigateToWomenTeesPage() {

        homePage.getWomenTopsTeesMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/tops-women/tees-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Tees");
    }

    @Test(description = "Use hover menu to navigate to Women > Tops > Bras & Tanks")
    public void navigateToWomenBrasAndTanksPage() {

        homePage.getWomenTopsBrasAndTanksMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/tops-women/tanks-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Bras & Tanks");
    }

    @Test(description = "Use hover menu to navigate to Women > Bottoms")
    public void navigateToWomenBottomsPage() {

        homePage.getWomenBottomsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/bottoms-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Bottoms");
    }

    @Test(description = "Use hover menu to navigate to Women > Bottoms > Pants")
    public void navigateToWomenPantsPage() {

        homePage.getWomenBottomsPantsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/bottoms-women/pants-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Pants");
    }

    @Test(description = "Use hover menu to navigate to Women > Bottoms > Shorts")
    public void navigateToWomenShortsPage() {

        homePage.getWomenBottomsShortsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "women/bottoms-women/shorts-women.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Shorts");
    }

    @Test(description = "Use hover menu to navigate to Men page")
    public void navigateToMenPage() {

        homePage.getMenLink().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Men");
    }

    @Test(description = "Use hover menu to navigate to Men > Tops page")
    public void navigateToMenTopsPage() {

        homePage.getMenTopsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/tops-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Tops");
    }

    @Test(description = "Use hover menu to navigate to Men > Tops > Jackets page")
    public void navigateToMenJacketsPage() {

        homePage.getMensTopsJacketsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/tops-men/jackets-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Jackets");
    }

    @Test(description = "Use hover menu to navigate to Men > Tops > Hoodies & Sweatshirts page")
    public void navigateToMenHoodiesAndSweatshirtsPage() {

        homePage.getMensTopsHoodiesAndSweatshirtsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/tops-men/hoodies-and-sweatshirts-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Hoodies & Sweatshirts");
    }

    @Test(description = "Use hover menu to navigate to Men > Tops > Tees page")
    public void navigateToMenTeesPage() {

        homePage.getMensTopsTeesMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/tops-men/tees-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Tees");
    }

    @Test(description = "Use hover menu to navigate to Men > Tops > Tanks page")
    public void navigateToMenTanksPage() {

        homePage.getMenTopsTanksMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/tops-men/tanks-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Tanks");
    }

    @Test(description = "Use hover menu to navigate to Men > Bottoms page")
    public void navigateToMenBottomsPage() {

        homePage.getMenBottomsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/bottoms-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Bottoms");
    }

    @Test(description = "Use hover menu to navigate to Men > Bottoms > Pants page")
    public void navigateToMenPantsPage() {

        homePage.getMenBottomsPantsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/bottoms-men/pants-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Pants");
    }

    @Test(description = "Use hover menu to navigate to Men > Bottoms > Shorts page")
    public void navigateToMenShortsPage() {

        homePage.getMenBottomsShortsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "men/bottoms-men/shorts-men.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Shorts");
    }

    @Test(description = "Use hover menu to navigate to Gear page")
    public void navigateToGearPage() {

        homePage.getGearLink().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "gear.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Gear");
    }

    @Test(description = "Use hover menu to navigate to Gear > Bags page")
    public void navigateToBagsPage() {

        homePage.getGearBagsMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "gear/bags.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Bags");
    }

    @Test(description = "Use hover menu to navigate to Gear > Fitness Equipment page")
    public void navigateToFitnessEquipmentPage() {

        homePage.getGearFitnessEquipmentMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "gear/fitness-equipment.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Fitness Equipment");
    }

    @Test(description = "Use hover menu to navigate to Gear > Watches page")
    public void navigateToWatchesPage() {

        homePage.getGearWatchesMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "gear/watches.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Watches");
    }

    @Test(description = "Use hover menu to navigate to Training > Video Download page")
    public void navigateToTrainingVideoDownloadPage() {

        homePage.getTrainingVideoDownloadMenuItem().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "training/training-video.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Video Download");
    }

    @Test(description = "Use hover menu to navigate to Sale page")
    public void navigateToSalePage() {

        homePage.getSaleLink().click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                this.properties.getProperty("baseUrl") + "sale.html");

        Assert.assertEquals(
                searchResultsPage.getPageTitleWrapper().getText(),
                "Sale");
    }
}
