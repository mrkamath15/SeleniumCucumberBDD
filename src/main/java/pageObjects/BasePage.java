package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement username_textField;

    @FindBy(css = "input[name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='password']//following-sibling::span")
    private WebElement error_label;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit_button;

    @FindBy(xpath = "//img[@src='images/mast_construction.gif']")
    private WebElement under_construction_image;

    public void enter_username(String username) {
        username_textField.sendKeys(username);
    }

    public void enter_password(String password) {
        password_textField.sendKeys(password);
    }

    public String getErrorMessage() {
        return error_label.getText();
    }

    public void click_submit_button() {
        submit_button.click();
    }

    public boolean is_under_construction_banner_displayed() {
        return under_construction_image.isDisplayed();
    }

}
