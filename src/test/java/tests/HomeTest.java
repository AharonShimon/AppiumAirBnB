package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void setupTest() throws Exception {
        setup();
        homePage = new HomePage(driver);
    }

    @Test
    public void testDenyPermissions() {
        homePage.denyPermissions();
        // Assert that the element is selected
        Assert.assertTrue(homePage.scrollAndClick().equals("false"), "❌ The element is NOT selected!");

        // Print success message
        System.out.println("✅ The element is selected.");

        homePage.clickOnIcon();

        Assert.assertTrue(homePage.ClickOnIconHouseOption().equals("false"),"❌ The element is NOT selected!");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
