package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
    Select select;

    public FlightsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTrip_radio_button;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement oneWayTrip_radio_button;

    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement passengerCount_dropdown;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departFrom_dropdown;

    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement departOnMonth_dropdown;

    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement departOnDay_dropdown;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivingIn_dropdown;

    @FindBy(xpath = "//select[@name='toMonth']")
    private WebElement returningOnMonth_dropdown;

    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement returningOnDay_dropdown;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyClass_radio_button;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessClass_radio_button;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement firstClass_radio_button;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement airline_dropdown;

    @FindBy(name = "findFlights")
    private WebElement continue_button;

    public void click_roundTrip() {
        roundTrip_radio_button.click();
    }

    public void click_oneWayTrip() {
        oneWayTrip_radio_button.click();
    }

    public void select_passenger_count(int count) {
        select_dropdown_value(passengerCount_dropdown, String.valueOf(count));
    }

    public void select_depart_from(String city) {
        select_dropdown_value(departFrom_dropdown, city);
    }

    public void select_departOn_month(String month) {
        select_dropdown_value(departOnMonth_dropdown, month);
    }

    public void select_departOn_day(int day) {
        select_dropdown_value(departOnDay_dropdown, String.valueOf(day));
    }

    public void select_arriving_in(String city) {
        select_dropdown_value(arrivingIn_dropdown, city);
    }

    public void select_returnOn_month(String month) {
        select_dropdown_value(returningOnMonth_dropdown, month);
    }

    public void select_returnOn_day(int day) {
        select_dropdown_value(returningOnDay_dropdown, String.valueOf(day));
    }

    public void click_economy_class_button() {
        economyClass_radio_button.click();
    }

    public void click_business_class_button() {
        businessClass_radio_button.click();
    }

    public void click_first_class_button() {
        firstClass_radio_button.click();
    }

    public void select_airline(String airline) {
        select_dropdown_value(airline_dropdown, airline);
    }

    public void click_continue_button() {
        continue_button.click();
    }

    private void select_dropdown_value(WebElement element, String value) {
        select = new Select(element);
        select.selectByVisibleText(value);
    }


}
