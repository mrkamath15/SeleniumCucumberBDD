package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.FlightsPage;
import pageObjects.FlightsResultsPage;
import testContext.TestContext;

public class FlightsPageSteps {

    FlightsPage flightsPage;
    FlightsResultsPage flightsResultsPage;

    public FlightsPageSteps(TestContext context) {
        flightsPage = context.getPageObjectManager().getFlightsPage();
    }

    @When("user selects one way trip")
    public void user_selects_one_way_trip() {
        flightsPage.click_oneWayTrip();
    }

    @When("user selects round way trip")
    public void user_selects_round_way_trip() {
        flightsPage.click_roundTrip();
    }

    @When("user selects {int} passengers")
    public void user_selects_passengers(Integer count) {
        flightsPage.select_passenger_count(count);
    }

    @When("user departs from {string}")
    public void user_departs_from(String fromCity) {
        flightsPage.select_depart_from(fromCity);
    }

    @When("user departs on {string} month and {int} day")
    public void user_departs_on_month_and_day(String month, Integer day) {
        flightsPage.select_departOn_month(month);
        flightsPage.select_departOn_day(day);
    }

    @When("user arrives in {string}")
    public void user_arrives_in (String toCity) {
        flightsPage.select_arriving_in(toCity);
    }

    @When("user returns on {string} month and {int} day")
    public void user_returns_on_month_and_day(String month, Integer day) {
        flightsPage.select_returnOn_month(month);
        flightsPage.select_returnOn_day(day);
    }

    @When("user prefers first class service")
    public void user_prefers_first_class_service() {
        flightsPage.click_first_class_button();
    }

    @When("user prefers business class service")
    public void user_prefers_business_class_service() {
        flightsPage.click_business_class_button();
    }

    @When("user prefers {string} airline")
    public void user_prefers_airline(String airline) {
        flightsPage.select_airline(airline);
    }

    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        flightsPage.click_continue_button();
    }

}
