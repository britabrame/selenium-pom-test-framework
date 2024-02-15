package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class CustomActions {
    WebDriver driver;
    Actions action;

    public CustomActions(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
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

}
