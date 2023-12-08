package tpolab10.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERIPPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/header/div/div/div/div/button/div")
    private WebElement iconProfile;

    @FindBy(xpath = "/html/body/div[12]/div/div/div/div/div/div/div[1]/span/div/div/div/div[3]")
    private WebElement buttonProfile;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[1]/div/div/div[1]/button[2]/div/div")
    private WebElement showProducts;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/span/div/input")
    private WebElement buttonDestroy;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/header/div/div/span")
    private WebElement buttonBackMain;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div[1]/div/div/div/div/div/div")
    private WebElement clickToverifyData;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/header/div/div[2]/div/h1")
    private WebElement verifyData;
    public ERIPPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickProfile() throws InterruptedException {
        Thread.sleep(4000);
        iconProfile.click();
        Thread.sleep(4000);
        buttonProfile.click();
        Thread.sleep(4000);
    }
    public void clickMyProducts()throws InterruptedException {
        showProducts.click();
        Thread.sleep(4000);
    }
    public void clickHideCard() throws InterruptedException {
        buttonDestroy.click();
        Thread.sleep(4000);
    }

    public void clickBackToMain() throws InterruptedException {
        buttonBackMain.click();
        Thread.sleep(8000);
    }

    public String getDateFromValidationMessage() throws InterruptedException {

        clickToverifyData.click();
        Thread.sleep(4000);
        return verifyData.getText();
    }
}
