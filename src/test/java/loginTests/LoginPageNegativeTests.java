package loginTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import prePostConditions.BaseTest;

import java.io.IOException;

public class LoginPageNegativeTests extends BaseTest {

    @Test
    public void loginPageTest() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.LoginPagePositiveTest();
    }
}