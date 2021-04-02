package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginSuccessPage;
import testContext.TestContext;

public class HomePageSteps {
    WebDriver driver;
    HomePage homePage;
    LoginSuccessPage loginSuccessPage;

    public HomePageSteps(TestContext context) {
        driver = context.getDriverManager().getDriver();
        homePage = context.getPageObjectManager().getHomePage();
        loginSuccessPage = context.getPageObjectManager().getLoginSuccessPage();
    }

    @Given("user is in home page")
    public void user_is_in_home_page() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getAppUrl());
    }

    @When("user clicks on Register link")
    public void user_clicks_on_register_link() {
        homePage.click_register_link();
    }

    @When("user clicks on sign-on link")
    public void user_clicks_on_sign_on_link() {
        homePage.click_signOn_link();
    }

    @When("user clicks on support link")
    public void user_clicks_on_support_link() {
        homePage.click_support_link();
    }

    @When("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        homePage.click_contact_link();
    }

    @When("user clicks on flights link")
    public void user_clicks_on_flights_link() {
        homePage.click_flights_link();
    }

    @When("user clicks on hotels link")
    public void user_clicks_on_hotels_link() {
        homePage.click_hotels_link();
    }

    @When("user clicks on car rental link")
    public void user_clicks_on_car_rental_link() {
        homePage.click_car_rentals_link();
    }

    @When("user clicks on destinations link")
    public void user_clicks_on_destinations_link() {
        homePage.click_destinations_link();
    }

    @When("user clicks on vacations link")
    public void user_clicks_on_vacations_link() {
        homePage.click_vacations_link();
    }
}
