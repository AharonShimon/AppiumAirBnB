package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;

    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:deviceName", "Xiaomi 11 Lite 5G NE");
        cap.setCapability("appium:udid", "cd2a2b55");
        cap.setCapability("appium:platformVersion", "14");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:appPackage", "com.airbnb.android");
        cap.setCapability("appium:appActivity", "com.airbnb.android.feat.homescreen.HomeActivity");

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
