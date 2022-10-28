package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.LogoutPage;

public class LogoutPageSteps {

    TestContext testContext;
    LogoutPage logoutPage;

    public LogoutPageSteps(TestContext context) {
        testContext = context;
        logoutPage = testContext.getPageObjectManager().getLogoutPage();
    }

    @When("^User Logout from the Application$")
    public void user_logged_out() {
        logoutPage.logout();
    }
}
