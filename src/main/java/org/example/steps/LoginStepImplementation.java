package org.example.steps;

import com.thoughtworks.gauge.Step;
import org.example.driver.DriverFactory;
import org.example.functions.Login;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginStepImplementation {

    private static final Logger log = LoggerFactory.getLogger(LoginStepImplementation.class);
//    LoginPage loginPage;
//    WebDriver driver;
    Login login;

    @Step("Navigate to the login page")
    public void navigateToLoginPage() {
        DriverFactory.getDriver().get("https://candymapper.com/m/login");
    }

    @Step("Enter credentials and Proceed to Login")
    public void enterCredentialsAndProceedToLogin() {
        login = new Login();
        login.LoginToPage("sample@yahoo.com","abcd");
    }

    @Step("Close Popup Challenge")
    public void implementation1() {


    }
}
