package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeClass  // Runs ONCE before all tests
    public void setupTest() throws Exception {
        setup(); // Initializes Appium session ONCE
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void testDenyPermissions() {
        homePage.denyPermissions();
    }

    @Test(priority = 2)
    public void testClickOnWowPlaces() {
        homePage.clickOnWowPlacesOption();
        Assert.assertEquals(homePage.getDomPropOfFirstElementWowPalces(), "true", "Element did not appear as expected!");
    }

    @Test(priority = 3)
    public void testClickOnBeachesIcon() {
        homePage.clickOnBeachesIcon();
    }

    @AfterClass  // Runs ONCE after all tests
    public void tearDownTest() {
        tearDown(); // Closes Appium session
    }
}
