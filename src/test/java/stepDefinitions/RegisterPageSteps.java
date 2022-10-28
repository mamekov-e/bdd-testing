package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pageObjects.RegisterPage;

import java.util.List;

public class RegisterPageSteps {

    TestContext testContext;
    RegisterPage registerPage;

    public RegisterPageSteps(TestContext context) {
        testContext = context;
        registerPage = testContext.getPageObjectManager().getRegisterPage();
    }

    @When("^User Navigate to Register Page$")
    public void user_is_on_Login_Page() {
        registerPage.navigateTo_choosing_RegisterMethodPage();
        registerPage.navigateTo_email_RegisterMethodPage();
    }

    @When("^User enters Credentials to Register$")
    public void user_enters_credentials_to_Login(DataTable userCredentials) {
        List<List<String>> data = userCredentials.raw();
        String fullName = data.get(0).get(0);
        String username = data.get(0).get(1);
        String password = data.get(0).get(2);

        registerPage.enterCredentials(fullName, username, password);
    }

    @When("^Message displayed Register Failed$")
    public void user_got_invalid_credentials_msg() {
        registerPage.assertInvalidCredentialsMsg();
    }
}
