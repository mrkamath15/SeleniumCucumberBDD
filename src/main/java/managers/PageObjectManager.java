package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    private HomePage homePage;
    private LoginSuccessPage loginSuccessPage;
    private RegisterPage registerPage;
    private RegisterSuccessPage registerSuccessPage;
    private BasePage basePage;
    private FlightsPage flightsPage;
    private FlightsResultsPage flightsResultsPage;
    WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? new HomePage(driver) : homePage;
    }

    public LoginSuccessPage getLoginSuccessPage() {
        return (loginSuccessPage == null) ? new LoginSuccessPage(driver) : loginSuccessPage;
    }

    public RegisterPage getRegisterPage() {
        return (registerPage == null) ? new RegisterPage(driver) : registerPage;
    }

    public RegisterSuccessPage getRegisterSuccessPage() {
        return (registerSuccessPage == null) ? new RegisterSuccessPage(driver) : registerSuccessPage;
    }

    public BasePage getBasePage() {
        return (basePage == null) ? new BasePage(driver) : basePage;
    }

    public FlightsPage getFlightsPage() {
        return (flightsPage == null) ? new FlightsPage(driver) : flightsPage;
    }

    public FlightsResultsPage getFlightsResultsPage() {
        return (flightsResultsPage == null) ? new FlightsResultsPage(driver) : flightsResultsPage;















    }
}
