package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        homePage.navigateTo_HomePage();
    }

    @When("^User closes Add popup$")
    public void add_closed() {
        homePage.closeAdd();
    }

    @When("^User opens userDropdown$")
    public void user_opened_UserDropdown() {
        homePage.openUserDropdown();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        homePage.assertUserLogged(true);
    }

    @Then("^Message displayed Logout Successfully$")
    public void message_displayed_Logout_Successfully() throws Throwable {
        homePage.assertUserLogged(false);
    }
}
