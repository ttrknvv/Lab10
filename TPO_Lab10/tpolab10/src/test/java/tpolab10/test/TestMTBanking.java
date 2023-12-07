package tpolab10.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tpolab10.page.*;

public class TestMTBanking {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mybank.by/main_unauthorised");
        PageFactory.initElements(driver, this);
    }

    @Test
    public void testCorrectData() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();

        loginPage.enterPhoneNumber("257411803");
        loginPage.submitPhoneNumber();

        loginPage.enterPassword("Ttrknvv7411803");
        loginPage.submitPassword();

        OperationsPage operationsPage = new OperationsPage(driver);
        operationsPage.clickStoryOfOperation();

        operationsPage.enterDateFrom("12/34/5678");
        operationsPage.clickShowButton();

        String expectedText = "Значение поля должно соответствовать типу «Дата»";
        String actualText = operationsPage.getDateFromValidationMessage();
        Assert.assertEquals(expectedText, actualText);

        expectedText = "Поле обязательно для заполнения";
        actualText = operationsPage.getDateToValidationMessage();
        Assert.assertEquals(expectedText, actualText);

        operationsPage.enterDateTo("25/01/2026");
        operationsPage.clickShowButton();

        expectedText = "Значение поля не должно быть позже чем 07.12.2023";
        actualText = operationsPage.getDateToValidationMessage();
        Assert.assertEquals(expectedText, actualText);

        driver.quit();
    }




}