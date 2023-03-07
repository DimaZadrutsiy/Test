package utils;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class TestUtils {

    private final static By IMG_HEADER = By.xpath("");

    public static void loadBaseUrlPage(WebDriver driver, WebDriverWait wait) {
        driver.get(BaseTest.getBaseUrl());
        waitForPageLoaded(driver);
    }

    public static void waitForPageLoaded(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    public static boolean isIMGHeaderExists(WebDriver driver) {
        boolean isExists = true;
        try {
            driver.findElement(IMG_HEADER);
        } catch (NoSuchElementException e) {
            isExists = false;
        }

        return isExists;
    }
}
