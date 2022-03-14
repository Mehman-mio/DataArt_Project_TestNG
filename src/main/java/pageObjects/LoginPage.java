package pageObjects;

import assertion.Assertions;
import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    String expectedMessage = "Error message";

    @FindBy(xpath = "//label[@id='outlined-basic-label'][text()='Email']//following::input[1]") private WebElement emailField;
    @FindBy(xpath = "//label[@id='outlined-basic-label'][text()='Email']//following::input[2]") private WebElement passwordField;
    @FindBy(xpath = "//button") private WebElement loginButton;
    @FindBy(xpath = "//nothing to write because there is no information about error message in requirements") private WebElement errorMessage;


    public void inputValidEmail() throws IOException{
        emailField.sendKeys(Config.getValidEmail());
    }
    public void inputValidPassword() throws IOException {
        passwordField.sendKeys(Config.getValidPassword());
    }
    public void inputInvalidEmail() throws IOException{
        emailField.sendKeys(Config.getInvalidEmail());
    }
    public void inputInvalidPassword() throws IOException{
        passwordField.sendKeys(Config.getInvalidPassword());
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    //-------------------------------------------------------------//
    //These methods are for positive login scenario
    public void loginPagePositiveTestMethods() throws IOException{
        inputValidEmail();
        inputValidPassword();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenario using invalid Password
    public void loginPageWithInvalidPasswordScenarioMethods() throws IOException{
        inputValidEmail();
        inputInvalidPassword();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenario using invalid Email
    public void loginPageWithInvalidEmailScenarioMethods() throws IOException{
        inputInvalidEmail();
        inputValidPassword();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenario leaving empty Email field
    public void loginPageEmptyEmailFieldScenarioTestMethods() throws IOException{
        inputValidPassword();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenarios leaving empty Password field
    public void loginPageEmptyPasswordFieldScenarioTestMethods() throws IOException{
        inputValidEmail();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenarios leaving empty Email and Password fields
    public void loginPageEmptyFieldsTestMethods(){
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //This method for assertion
    public void getActualText(){
        try {
            Assertions.expectedErrorMessage = expectedMessage;
            Assertions.actualErrorMessage = errorMessage.getText();
        }
        catch(Throwable pageNavigationError){
                System.out.println("The error message is not appeared");
        }
    }
}