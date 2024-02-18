package resources;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.function.Consumer;

public class CustomActions {
    WebDriver driver;
    Actions action;
    Wait wait;
    Duration duration;

    public CustomActions(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
        duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);

    }

    /**
     * Send keys with a brief delay between keystrokes. This should be used instead of the WebElement.sendKeys() method only when typing must be slowed.
     * @param el web element
     * @param text text to type
     */
    public void slowType(WebElement el, String text) {
        for(char c: text.toCharArray()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            el.sendKeys(Character.toString(c));
        }
    }

    public void hover(WebElement el) {
        action.moveToElement(el).perform();
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        // Wait for file to download
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

    public void search(WebElement searchBox, String searchTerm, WebElement elementToWaitFor) {
        searchBox.clear();
        searchBox.sendKeys(searchTerm + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
    }

    public void waitForPageLoad() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
