package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/sign_in']")
    WebElement loginLink;

    @FindBy(id = "email")
    WebElement emailElement;

    @FindBy(id = "password")
    WebElement passElement;

    @FindBy(xpath = "//input[@data-testid='login-button']")
    WebElement loginBtnElement;

    @FindBy(className = "text-with-icon")
    WebElement errorPopupElement;

    public void navigateTo_LoginPage() {
        loginLink.click();
    }

    public void enterCredentials(String email, String password) {
        Wait.untilPageLoadComplete(driver);

        emailElement.sendKeys(email);
        passElement.sendKeys(password);
        loginBtnElement.click();
    }

    public void assertInvalidCredentialsMsg() {
        Wait.untilPageLoadComplete(driver);
        Assert.assertTrue(errorPopupElement.isDisplayed());
    }
}
