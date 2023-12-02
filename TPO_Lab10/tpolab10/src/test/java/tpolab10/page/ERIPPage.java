package tpolab10.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERIPPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[3]/div/div[2]/div[1]/div/div/div[2]/span")
    private WebElement ERIPOperationPuth1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[3]/div/div[3]/div[1]/input")
    private WebElement ERIPInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[3]/div/div[3]/div[2]/button")
    private WebElement showButton;

    @FindBy(xpath = "/html/body/div[11]/div/div/div[2]/div[1]/fieldset/div/ul/li[1]")
    private WebElement elementERIP;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/h1")
    private WebElement verifyData;
    public ERIPPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickERIP() throws InterruptedException {
        ERIPOperationPuth1.click();
        Thread.sleep(2000);
    }
    public void entereNumberERIP(String number)throws InterruptedException {
        ERIPInput.click();
        ERIPInput.sendKeys(number);
        Thread.sleep(2000);
    }
    public void clickShowButton() throws InterruptedException {
        showButton.click();
        Thread.sleep(4000);
    }

    public void clickElement() throws InterruptedException {
        elementERIP.click();
        Thread.sleep(4000);
    }

    public String getDateFromValidationMessage() {
        return verifyData.getText();
    }
}
