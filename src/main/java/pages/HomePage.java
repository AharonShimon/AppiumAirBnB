package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HomePage {
    AndroidDriver driver;

    // Define locators
    private AppiumBy denyButtonForAlert = new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_deny_button\")");
    private AppiumBy OnTheBeachIconOption = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(23)");
    private AppiumBy IconHouseOption = new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").instance(12)");

    // Constructor
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Action
    public void denyPermissions () {
        driver.findElement(denyButtonForAlert).click();
    }

    public String scrollAndClick() {
        String Selected =driver.findElement(OnTheBeachIconOption).getDomAttribute("dispalyed");

        // ✅ Wait for 3 seconds without blocking execution
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(driver -> true);

        return Selected;
    }

    public void clickOnIcon(){
        driver.findElement(IconHouseOption).click();
    }

    public String ClickOnIconHouseOption(){
      String IconFeature = driver.findElement(IconHouseOption).getDomAttribute("dispalyed");
      return IconFeature;

    };




//    public void scrollAndClick() {
//        driver.findElement(OnTheBeachIconOption).getDomAttribute("scrollable");
//        driver.findElement(IconHouseOption).click();
//    }
}
