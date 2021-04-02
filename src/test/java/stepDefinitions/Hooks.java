package stepDefinitions;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import testContext.TestContext;

public class Hooks {
    WebDriver driver;

    public Hooks(TestContext context) {
        driver = context.getDriverManager().getDriver();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
