package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    private WebDriverWait wait;

    // Constructor
    public WaitHelper(AndroidDriver driver, int timeoutInSeconds) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    // Method to wait for visibility of an element
    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Method to wait for an element to be clickable
    public WebElement waitForClickability(By locator, AndroidDriver driver) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }




}


