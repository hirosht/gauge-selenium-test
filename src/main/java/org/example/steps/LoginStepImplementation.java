package org.example.steps;

import com.thoughtworks.gauge.Step;
import org.example.driver.DriverFactory;

public class LoginStepImplementation {
    @Step("Navigate to the login page")
    public void navigateToLoginPage() {
        DriverFactory.getDriver().get("http://www.google.com");
    }
}
