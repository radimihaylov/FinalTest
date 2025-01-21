package admin;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void TestRegister() {
        webApp.homePage().enterToHomePage();
        webApp.homePage().clickMyAccountButton();
        webApp.homePage().clickRegisterOption();
        webApp.registerPage().typeFirsAndLastName("Radoslav", "Mihaylov");
        webApp.registerPage().typeRandomEmail();
        webApp.registerPage().typeInPasswordField("1234567");
        webApp.registerPage().clickSlideButtons();
        webApp.registerPage().clickAgreeSlideButton();
        webApp.registerPage().clickContinueButton();
        webApp.congratulationPage().checkPage();
        webApp.congratulationPage().checkPage2();

    }

    @Test
    public void assertCheck () {
        driver.get("https://auto.pragmatic.bg/index.php?route=account/success&language=en-gb&customer_token=8ba91d7b2ddc779ce007e77615");
        WebElement checkText = driver.findElement(By.cssSelector("#content>h1"));
//        String textCheckOnThePage = checkText.getText();
        Assert.assertEquals(checkText.getText(), "Your Account Has Been Created!");

    }

}
