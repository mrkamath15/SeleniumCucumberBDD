package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.FlightsResultsPage;
import testContext.TestContext;

public class FlightsResultsPageSteps {
    FlightsResultsPage flightsResultsPage;

    public FlightsResultsPageSteps(TestContext context) {
        flightsResultsPage = context.getPageObjectManager().getFlightsResultsPage();
    }

    @Then("back to home image is displayed")
    public void back_to_home_image_is_displayed() {
        Assert.assertTrue(flightsResultsPage.is_backToHome_image_displayed());
    }
}
