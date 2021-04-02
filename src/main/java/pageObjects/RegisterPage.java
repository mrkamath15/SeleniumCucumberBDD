package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName_textField;

    @FindBy(css = "input[name='lastName']")
    private WebElement lastName_textField;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone_textField;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement email_textField;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address_textField;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement city_textField;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement state_textField;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCode_textField;

    @FindBy(css = "select[name='country']")
    private WebElement country_dropDown;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement username_textField;

    @FindBy(css = "input[name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPassword_textField;

    public void enter_confirmPassword(String password) {
        confirmPassword_textField.sendKeys(password);
    }

    public void enter_password(String password) {
        password_textField.sendKeys(password);
    }

    public void enter_username(String username) {
        username_textField.sendKeys(username);
    }

    public void select_country(String country) {
        Select selectCountry = new Select(country_dropDown);
        selectCountry.selectByVisibleText(country);
    }

    public void enter_postalCode(String postcode) {
        postalCode_textField.sendKeys(postcode);
    }

    public void enter_firstName(String firstName) {
        firstName_textField.sendKeys(firstName);
    }

    public void enter_lastName(String lastName) {
        lastName_textField.sendKeys(lastName);
    }

    public void enter_Phone(String phone) {
        phone_textField.sendKeys(phone);
    }

    public void enter_email(String email) {
        email_textField.sendKeys(email);
    }

    public void enter_address(String address) {
        address_textField.sendKeys(address);
    }

    public void enter_city(String city) {
        city_textField.sendKeys(city);
    }

    public void enter_state(String state) {
        state_textField.sendKeys(state);
    }

}
