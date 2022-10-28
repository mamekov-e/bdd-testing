package cucumber;

import managers.PageObjectManager;
import managers.MyWebDriverManager;

public class TestContext {
    private MyWebDriverManager myWebDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() {
        myWebDriverManager = new MyWebDriverManager();
        pageObjectManager = new PageObjectManager(myWebDriverManager.getDriver());
    }

    public MyWebDriverManager getWebDriverManager() {
        return myWebDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
