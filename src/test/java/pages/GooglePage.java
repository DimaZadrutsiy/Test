package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GooglePage extends BasePage {

    @FindBy(xpath = "//input[@aria-autocomplete]")
    private WebElement element;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void isPageDisplayed() {
        getWait10().until(ExpectedConditions.visibilityOf(element));
    }
}
