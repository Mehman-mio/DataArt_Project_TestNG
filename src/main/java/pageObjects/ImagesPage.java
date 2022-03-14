package pageObjects;

import assertion.Assertions;
import config.Config;
import org.openqa.selenium.WebDriver;
import utils.TestUtils;

public class ImagesPage {

    private WebDriver driver;

    public ImagesPage(WebDriver driver) {
        this.driver = driver;
    }
    //-------------------------------------------------------------//
    //This method for assertion
    public void checkWebPage(){
        TestUtils.sleep(3000);
        try{
            Assertions.expectedImagesPage = Config.getExpectedUrl();
            Assertions.actualPage = driver.getCurrentUrl();
        }
        catch(Throwable pageNavigationError){
            System.out.println("I am in the wrong page");
        }
    }
}