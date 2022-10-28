package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void BeforeStep() {
        // some report init
    }

    @After
    public void AfterSteps() {
        testContext.getWebDriverManager().quitDriver();
    }
}
