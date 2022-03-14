package loginTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;

public class LoginPagePositiveTest extends BaseTest {

    @Test
    public void loginPageTest() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.LoginPagePositiveTest();
    }
}