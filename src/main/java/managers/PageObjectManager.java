package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    private WebDriver driver;
    private HomePage homePage;

    private LoginPage loginPage;

    private RegisterPage registerPage;

    private LogoutPage logoutPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public RegisterPage getRegisterPage() {
        return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
    }

    public LogoutPage getLogoutPage() {
        return (logoutPage == null) ? logoutPage = new LogoutPage(driver) : logoutPage;
    }

}
