package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HomePage extends BasePage {

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[3]")
    private WebElement myAccountButton;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[3]")
    private WebElement registerOption;


    private static final String URLPragmatic = "https://auto.pragmatic.bg/";

    public HomePage (WebDriver driver) {
        super(driver);
    }

    public void enterToHomePage() {
        driver.get(URLPragmatic);
    }

    public void clickMyAccountButton() {
        clickElement(myAccountButton);
    }

    public void clickRegisterOption() {
        clickElement(registerOption);
    }


}
