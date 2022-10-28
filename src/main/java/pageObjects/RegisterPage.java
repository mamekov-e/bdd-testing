package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/sign_up']")
    WebElement registerLink;

    @FindBy(xpath = "//button[@data-test-id='sign-up-with-email']")
    WebElement emailMethodBtnElement;

    @FindBy(id = "user_name")
    WebElement fullNameElement;

    @FindBy(id = "user_email")
    WebElement emailElement;

    @FindBy(id = "password")
    WebElement passElement;

    @FindBy(xpath = "//input[@data-testid='signup-button']")
    WebElement registerBtnElement;

    @FindBy(className = "text-with-icon")
    WebElement errorPopupElement;

    public void navigateTo_choosing_RegisterMethodPage() {
        registerLink.click();
    }

    public void navigateTo_email_RegisterMethodPage() {
        emailMethodBtnElement.click();
    }

    public void enterCredentials(String fullName, String email, String password) {
        Wait.untilPageLoadComplete(driver);

        fullNameElement.sendKeys(fullName);
        emailElement.sendKeys(email);
        passElement.sendKeys(password);
        registerBtnElement.click();
    }

    public void assertInvalidCredentialsMsg() {
        Wait.untilPageLoadComplete(driver);
        Assert.assertTrue(errorPopupElement.isDisplayed());
    }
}
