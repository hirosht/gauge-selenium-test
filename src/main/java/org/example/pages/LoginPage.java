package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//div/input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//div/input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//div/button[contains(text(),'Sign in')]")
    WebElement signin;

    @FindBy(xpath = "//*[@id=\"popup-widget50532-close-icon\"]")
    WebElement popupClose;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillEmailAddress(String emailAddress) {
        email.sendKeys(emailAddress);
    }

    public void fillPassword(String passkey) {
        password.sendKeys(passkey);
    }

    public void pressClick() {
        signin.click();
    }
}
