package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import pageObjects.RegisterSuccessPage;
import testContext.TestContext;

public class RegisterPageSteps {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    public RegisterPageSteps(TestContext context) {
        homePage = context.getPageObjectManager().getHomePage();
        registerPage = context.getPageObjectManager().getRegisterPage();
        registerSuccessPage = context.getPageObjectManager().getRegisterSuccessPage();
    }

    @When("user fills and registration details")
    public void user_fills_and_registration_details() {
        registerPage.enter_firstName("Raj");
        registerPage.enter_lastName("Kumar");
        registerPage.enter_Phone("1234567890");
        registerPage.enter_email("abc@qwe.com");
        registerPage.enter_address("14 test street");
        registerPage.enter_city("Bangalore");
        registerPage.enter_state("Karnataka");
        registerPage.enter_postalCode("534241");
        registerPage.select_country("INDIA");
        registerPage.enter_username("rajkumar");
        registerPage.enter_password("demo123");
        registerPage.enter_confirmPassword("demo123");
    }

    @Then("user is registered successfully")
    public void user_is_registered_successfully() {
        Assert.assertTrue(registerSuccessPage.is_registration_success(), "Registration failed");
    }
}
