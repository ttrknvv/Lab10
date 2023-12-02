package tpolab10.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/header/div[1]/div/span[2]/span")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(1000);
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void submitPhoneNumber() throws InterruptedException {
        phoneNumberField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void submitPassword() throws InterruptedException {
        passwordField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}