package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "REGISTER")
    private WebElement register_link;

    @FindBy(linkText = "SIGN-ON")
    private WebElement signOn_link;

    @FindBy(linkText = "SUPPORT")
    private WebElement support_link;

    @FindBy(linkText = "CONTACT")
    private WebElement contact_link;

    @FindBy(linkText = "Flights")
    private WebElement flights_link;

    @FindBy(linkText = "Hotels")
    private WebElement hotels_link;

    @FindBy(linkText = "Car Rentals")
    private WebElement car_rentals_link;

    @FindBy(linkText = "Destinations")
    private WebElement destinations_link;

    @FindBy(linkText = "Vacations")
    private WebElement vacations_link;

    public void click_register_link() {
        register_link.click();
    }

    public void click_signOn_link() {
        signOn_link.click();
    }

    public void click_support_link() {
        support_link.click();
    }

    public void click_contact_link() {
        contact_link.click();
    }

    public void click_flights_link() {
        flights_link.click();
    }

    public void click_hotels_link() {
        hotels_link.click();
    }

    public void click_car_rentals_link() {
        car_rentals_link.click();
    }

    public void click_destinations_link() {
        destinations_link.click();
    }

    public void click_vacations_link() {
        vacations_link.click();
    }
}
