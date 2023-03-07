package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import utils.TestUtils;

import java.lang.reflect.Method;
import java.time.Duration;


public abstract class BaseTest {
    private static final String BASE_URL = "https://www.google.com/";
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public static String getBaseUrl() {

        return BASE_URL;
    }

    @BeforeMethod
    protected void beforeMethod(Method method, ITestResult result) {
        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod(Method method, ITestResult result) {

        driver.quit();
        webDriverWait = null;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait() {
        if (webDriverWait == null) {
            webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        return webDriverWait;
    }

    public HomePage openBaseURL() {
        TestUtils.loadBaseUrlPage(getDriver(), getWait());

        return new HomePage(getDriver());
    }

    //новые методы getPages

    public HomePage getHomePage() {

        return new HomePage(getDriver());
    }
}
