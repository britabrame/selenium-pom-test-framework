package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import resources.CustomActions;
import resources.DriverInit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseTest  {
    protected WebDriver driver;
    protected Properties properties;
    protected CustomActions customActions;
    protected Actions actions;
    protected HomePage homePage;
    protected SearchResultsPage searchResultsPage;
    protected CheckoutShippingPage checkoutShippingPage;
    protected CheckoutPaymentPage checkoutPaymentPage;
    protected CheckoutSuccessPage checkoutSuccessPage;

    @BeforeClass
    public void createProps(){
        // Get access to Configuration.properties file
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/Configurations.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setupTestCase(ITestContext context) {
        // Initialize the driver based on configured browser
        DriverInit driverInit = new DriverInit();
//        driver = driverInit.getDriver(properties.getProperty("browser"));
        context.setAttribute("driver", driverInit.getDriver(properties.getProperty("browser")));
        driver = (WebDriver) context.getAttribute("driver");

        // Create page objects using the driver
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        checkoutShippingPage = new CheckoutShippingPage(driver);
        checkoutPaymentPage = new CheckoutPaymentPage(driver);
        checkoutSuccessPage = new CheckoutSuccessPage(driver);

        // Setup utilities
        actions = new Actions(driver);
        customActions = new CustomActions(driver);

        // Navigate to home page
        driver.get(this.properties.getProperty("baseUrl"));


        // Wait for page to fully load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void tearDownTestCase() {
        driver.quit();
    }

}
