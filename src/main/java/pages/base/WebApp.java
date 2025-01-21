package pages.base;

import org.openqa.selenium.WebDriver;
import pages.admin.CongratulationPage;
import pages.admin.HomePage;
import pages.admin.RegisterPage;

public class WebApp {

    private WebDriver driver;
    private HomePage homePage;
    private RegisterPage registerPage;
    private CongratulationPage congratulationPage;

    public WebApp(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(driver);
        }
        return registerPage;
    }

    public CongratulationPage congratulationPage() {
        if (congratulationPage == null) {
            congratulationPage = new CongratulationPage(driver);
        }
        return congratulationPage;
    }



}
