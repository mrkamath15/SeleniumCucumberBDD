package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"./src/test/resources/features"},
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        //tags = "@Debug",
        //plugin = {"pretty", "html:target/html-report", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        plugin = {"pretty",
                "html:target/cucumberReports/cucumber.html",
                "json:target/cucumberReports/cucumber.json"}

)

public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
