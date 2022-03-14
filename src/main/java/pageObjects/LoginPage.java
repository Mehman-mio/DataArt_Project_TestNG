package pageObjects;

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
    @FindBy(xpath = "//label[@id='outlined-basic-label'][text()='Email']//following::input[1]") private WebElement emailField;
    @FindBy(xpath = "//label[@id='outlined-basic-label'][text()='Email']//following::input[2]") private WebElement passwordField;
    @FindBy(xpath = "//button") private WebElement loginButton;

    //These methods are for positive login scenario
    public void inputValidEmail() throws IOException{
        emailField.sendKeys(Config.getValidEmail());
    }
    public void inputValidPassword() throws IOException {
        passwordField.sendKeys(Config.getValidPassword());
    }
    public void LoginPagePositiveTest() throws IOException{
        inputValidEmail();
        inputValidPassword();
        clickLoginButton();
    }
    //-------------------------------------------------------------//
    //These methods are for negative login scenario

    public void inputInvalidEmail() throws IOException{
        emailField.sendKeys(Config.getInvalidEmail());
    }
    public void inputInvalidPassword() throws IOException{
        emailField.sendKeys(Config.getInvalidPassword());
    }
    public void LoginPageNegativeTest() throws IOException{
        inputInvalidEmail();
        inputInvalidPassword();
        clickLoginButton();
    }



    public void clickLoginButton() {
        loginButton.click();
    }

}