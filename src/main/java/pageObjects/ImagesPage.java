package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ImagesPage {
    private WebDriver driver;
    public ImagesPage(WebDriver driver){

        this.driver = driver;
    }
//    @FindBy(xpath = "//a[@id='menuOnlinePayment']") private WebElement menuPaymentButton;
//
//    public void clickİnvoiceButton() {
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        menuPaymentButton.click();
//    }
}