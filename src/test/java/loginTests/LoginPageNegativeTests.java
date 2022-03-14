package loginTests;

import assertion.Assertions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import prePostConditions.BaseTest;

import java.io.IOException;

public class LoginPageNegativeTests extends BaseTest {

    @Test(priority = 1)
    public void loginPageNegativeTestWithInvalidPassword() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageWithInvalidPasswordScenarioMethods();
        loginPage.getActualText();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsErrorMessage();
    }
    @Test(priority = 2)
    public void loginPageNegativeTestWithInvalidEmail() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageWithInvalidEmailScenarioMethods();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsErrorMessage();
    }
    @Test(priority = 3)
    public void loginPageNegativeTestEmptyEmailField() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageEmptyEmailFieldScenarioTestMethods();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsErrorMessage();
    }
    @Test(priority = 4)
    public void loginPageNegativeTestEmptyPasswordField() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageEmptyPasswordFieldScenarioTestMethods();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsErrorMessage();
    }
    @Test(priority = 5)
    public void loginPageNegativeTestEmptyFields() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageEmptyFieldsTestMethods();
        Assertions assertions = PageFactory.initElements(driver, Assertions.class);
        assertions.assert_IfThereIsErrorMessage();
    }
}