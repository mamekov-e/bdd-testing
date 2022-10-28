package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

import java.util.List;

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @When("^User Navigate to Login Page$")
    public void user_is_on_Login_Page() {
        loginPage.navigateTo_LoginPage();
    }

    @When("^User enters Credentials to Login$")
    public void user_enters_credentials_to_Login(DataTable userCredentials) {
        List<List<String>> data = userCredentials.raw();
        String username = data.get(0).get(0);
        String password = data.get(0).get(1);

        loginPage.enterCredentials(username, password);
    }

    @When("^Message displayed Login Failed$")
    public void user_got_invalid_credentials_msg() {
        loginPage.assertInvalidCredentialsMsg();
    }
}
