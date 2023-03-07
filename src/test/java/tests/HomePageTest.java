package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test(description = "")
    public void checkIsGoogleDisplayed() {

        openBaseURL();

        HomePage homePage = new HomePage(getDriver());
        homePage.isPageDisplayed();
    }
}
