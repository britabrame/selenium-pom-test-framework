package listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TestListener implements ITestListener {
    WebDriver driver;
    String filePath = "src\\test\\java\\screenshots\\";

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("***** Error: " + result.getName() + " test has failed *****");
        String methodName=result.getName().toString().trim();
        ITestContext context = result.getTestContext();
        driver = (WebDriver) context.getAttribute("driver");
        WebDriver driver = (WebDriver)context.getAttribute("driver");
        takeScreenShot(methodName, driver);
        takeDomSnapshot();

    }

    public void takeScreenShot(String methodName, WebDriver driver) {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
            System.out.println("*** Placed screen shot in " + filePath + " ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeDomSnapshot() {
        String pageSrc = driver.getPageSource();
        try {
            PrintWriter out = new PrintWriter(filePath + "domSnapshot.html");
            out.println(pageSrc);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
