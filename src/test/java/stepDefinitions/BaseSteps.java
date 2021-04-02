package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.BasePage;
import pageObjects.LoginSuccessPage;
import testContext.TestContext;

public class BaseSteps {
    BasePage basePage;
    LoginSuccessPage loginSuccessPage;

    public BaseSteps(TestContext context) {
        basePage = context.getPageObjectManager().getBasePage();
        loginSuccessPage = context.getPageObjectManager().getLoginSuccessPage();
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        basePage.click_submit_button();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        basePage.enter_username(username);
        basePage.enter_password(password);
    }

    @Then("login success page is displayed")
    public void login_success_page_is_displayed() {
        Assert.assertTrue(loginSuccessPage.isLoginSuccess(), "Login Failed");
    }

    @Then("error message {string} is displayed")
    public void error_message_is_displayed(String errorMessage) {
        Assert.assertEquals(errorMessage, basePage.getErrorMessage());
    }

    @Then("under construction banner is displayed")
    public void under_construction_banner_is_displayed() {
        Assert.assertTrue(basePage.is_under_construction_banner_displayed());
    }
}
