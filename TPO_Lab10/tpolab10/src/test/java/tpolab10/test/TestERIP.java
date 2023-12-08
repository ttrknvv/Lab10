package tpolab10.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import tpolab10.page.*;

public class TestERIP {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mybank.by/main_unauthorised");
        PageFactory.initElements(driver, this);
    }

    @Test
    public void TestMTERIP() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();

        loginPage.enterPhoneNumber("257411803");
        loginPage.submitPhoneNumber();

        loginPage.enterPassword("Ttrknvv7411803");
        loginPage.submitPassword();

        ERIPPage page = new ERIPPage(driver);
        page.clickProfile();

        page.clickMyProducts();

        page.clickHideCard();

        page.clickBackToMain();

        String expectedText = "SIMPLE MASTERCARD ZP INSTANT BYN";
        String actualText = page.getDateFromValidationMessage();
        Assert.assertEquals(expectedText, actualText);

        driver.quit();
    }
}
