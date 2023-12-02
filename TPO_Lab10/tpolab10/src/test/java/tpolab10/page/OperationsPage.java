package tpolab10.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/button[2]/div/div")
    private WebElement storyOfOperation;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/input")
    private WebElement dateFrom;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/input")
    private WebElement dateTo;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/button[1]")
    private WebElement showButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/div[3]")
    private WebElement dateFromValidationMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[3]")
    private WebElement dateToValidationMessage;

    public OperationsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickStoryOfOperation() throws InterruptedException {
        Thread.sleep(3000);
        storyOfOperation.click();
        Thread.sleep(2000);
    }

    public void enterDateFrom(String date) throws InterruptedException {
        dateFrom.click();
        dateFrom.sendKeys(date);
        Thread.sleep(2000);
    }

    public void clickShowButton() throws InterruptedException {
        showButton.click();
        showButton.click();
        Thread.sleep(2000);
    }

    public void enterDateTo(String date)throws InterruptedException {
        dateTo.click();
        dateTo.sendKeys(date);
        Thread.sleep(2000);
    }

    public String getDateFromValidationMessage() {
        return dateFromValidationMessage.getText();
    }

    public String getDateToValidationMessage() {
        return dateToValidationMessage.getText();
    }
}