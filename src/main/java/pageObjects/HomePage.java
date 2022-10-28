package pageObjects;

import dataProviders.ConfProperties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement xClick;

    @FindBy(xpath = "//a[@aria-controls='user-dropdown']")
    WebElement userDropdown;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo_HomePage() {
        driver.get(ConfProperties.getProperty("homePage"));
    }

    public void closeAdd() {
        Wait.untilPageLoadComplete(driver);
        xClick.click();
    }

    public void openUserDropdown() {
        Wait.untilJqueryIsDone(driver);
        userDropdown.click();
    }

    public void assertUserLogged(boolean loggedIn) {
        Wait.untilPageLoadComplete(driver);

        if (loggedIn)
            Assert.assertTrue(userDropdown.isDisplayed());
        else
            Assert.assertFalse(false);
    }

}