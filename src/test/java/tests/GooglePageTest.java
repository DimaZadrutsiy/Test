package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GooglePageTest extends BaseTest {

    @Test(description = "")
    public void checkIsGoogleDisplayed() {

        openBaseURL();

        GooglePage googlePage = new GooglePage(getDriver());
        googlePage.isPageDisplayed();
    }
}
