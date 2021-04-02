package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsResultsPage {

    public FlightsResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@src='images/home.gif']")
    private WebElement backToHome_image;

    public boolean is_backToHome_image_displayed() {
        return backToHome_image.isDisplayed();
    }
}
