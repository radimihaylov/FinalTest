package admin;

import base.BaseTest;
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
//        webApp.congratulationPage().checkPage();
 
    }

}
