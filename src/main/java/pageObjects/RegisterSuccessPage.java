package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPage {

    public RegisterSuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//font[contains(text(),'Thank you for registering.')]")
    private WebElement registerSuccess_label;

    public boolean is_registration_success() {
        return registerSuccess_label.isDisplayed();
    }
}
