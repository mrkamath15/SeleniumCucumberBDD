package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage {

    WebDriver driver;

    public LoginSuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Login Successfully']")
    private WebElement login_success_label;

    public boolean isLoginSuccess(){
        return login_success_label.isDisplayed();
    }
}
