package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

public class CongratulationPage extends BasePage {

//    @FindBy (id = "content")
    @FindBy (css = "#content>h1")
    WebElement contentPage;


    public CongratulationPage(WebDriver driver) {
        super(driver);
    }

    public void checkPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content>h1")));
//        Assert.assertTrue(contentPage.getText().contains("Your Account Has Been Created!"));
//        String actual = contentPage.getText();
//        Assert.assertEquals(actual,  "Your Account Has Been Created!");
        Assert.assertEquals(contentPage.getText(), "Your Account Has Been Created!");
//        System.out.println(actual);

    }

}

