package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;



public class HomePage {
    AndroidDriver driver;
    WaitHelper waitHelper;
    WebDriverWait webDriverWait;

    // Define locators for top swipes locators
    private AppiumBy denyButtonForAlert = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_deny_button\")");

    private AppiumBy OnTheBeachIconOptionLaction = new AppiumBy.ByAndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.view.View\").instance(12))");

    private AppiumBy GreatViewsOption = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(9)");

    private AppiumBy WowPlacesOptionLactio = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(15)");

    private AppiumBy CastlePlacesOption = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(18)");

    private AppiumBy BeachOnHouseFirsOption = new AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"מועדף על ידי אורחים. מיקונוס, יוון. דירוג ממוצע של 4.96 מתוך 5. Calafati Beach . 1–6 במאי . ₪1,718 ללילה. \")");

    private AppiumBy firstOptionOfWowLaction = new AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"פונטה דלגדה, פורטוגל. דירוג ממוצע של 4.92 מתוך 5. במרחק 5,479 קילומטרים . 24–29 בנוב׳ . ₪579 ללילה. \")");

    // Constructor
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.waitHelper = new WaitHelper(driver, 10);
    }

    // Action
    public void denyPermissions () {
        waitHelper.waitForVisibility(denyButtonForAlert);
        driver.findElement(denyButtonForAlert).click();

    }


    public void clickOnWowPlacesOption(){
        // Wait for the element to be clickable before clicking

        waitHelper.waitForVisibility(WowPlacesOptionLactio);

        // Click on the element after it's clickable
        driver.findElement(WowPlacesOptionLactio).click();

    }



    public void clickOnFirstelment(){
        driver.findElement(firstOptionOfWowLaction).click();
    }



    public String getDomPropOfFirstElementWowPalces(){
        waitHelper.waitForClickability(firstOptionOfWowLaction,driver);
        return driver.findElement(firstOptionOfWowLaction).getDomAttribute("focusable");
    };





    public void clickOnBeachesIcon() {
        // Create WebDriverWait instance to wait for 10 seconds
         new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for another element to be visible (using the existing waitHelper)
        waitHelper.waitForVisibility(OnTheBeachIconOptionLaction);

        // Click on the element after it's clickable
        driver.findElement(OnTheBeachIconOptionLaction).click();

        // Wait for another element to be visible (using the existing waitHelper)
        waitHelper.waitForVisibility(OnTheBeachIconOptionLaction);  // Assuming this method does not require the driver anymore

    }



}
