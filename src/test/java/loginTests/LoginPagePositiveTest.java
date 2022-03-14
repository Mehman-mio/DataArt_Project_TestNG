package loginTests;

import assertion.Assertions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;

public class LoginPagePositiveTest extends BaseTest {

    @Test(priority = 1)
    public void loginPageTest() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPagePositiveTestMethods();
        ImagesPage imagesPage = PageFactory.initElements(driver, ImagesPage.class);
        imagesPage.checkWebPage();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsRightPage();
    }
}