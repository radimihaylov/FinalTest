package pages.admin;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import utils.WaitTool;

public class RegisterPage extends BasePage {

    @FindBy (id = "input-firstname")
    private WebElement inputFirstName;

    @FindBy (id = "input-lastname")
    private WebElement inputLastName;

    @FindBy (id = "input-email")
    private WebElement inputRandomEmail;

    @FindBy (id = "input-password")
    private WebElement inputPassword;

    @FindBy (id = "input-newsletter")
    private WebElement newsletter;

    @FindBy (name = "agree")
    private WebElement agree;

    @FindBy (css = ".text-end > button")
    private WebElement continuebutton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void typeInFirstNameField(String firstName) {
        typeText(inputFirstName, firstName);
    }

    public void typeInLastNameField(String lastName) {
        typeText(inputLastName, lastName);
    }

    public void typeFirsAndLastName(String firstName, String lastName) {
        WaitTool.waitForPageLoad(driver);
        typeInFirstNameField(firstName);
        typeInLastNameField(lastName);
    }

    public void typeRandomEmail() {
        String randomPrefix = RandomStringUtils.secure().nextAlphabetic(7);
        String randomDomain = RandomStringUtils.secure().nextAlphabetic(4);
        String randomEmail = randomPrefix + "@" + randomDomain + ".com";
        typeText(inputRandomEmail, randomEmail);
    }

    public void typeInPasswordField(String password) {
        typeText(inputPassword, password);
    }

    public void clickSlideButtons() {
        Actions builder = new Actions(driver);
        Action clickSlideNewsletterAndAgree = builder
                .click(newsletter)
//                .moveToElement(agree)
//                .click(agree)
                .build();
        clickSlideNewsletterAndAgree.perform();

    }

    public void clickAgreeSlideButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agree);
        WaitTool.waitForElement(driver, By.name("agree"), 10);
        clickElement(agree);
    }

    public void clickContinueButton(){
        clickElement(continuebutton);
    }







}
