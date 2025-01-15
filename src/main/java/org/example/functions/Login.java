package org.example.functions;

import org.example.driver.DriverFactory;
import org.example.pages.LoginPage;
import org.example.pages.PopupChallengePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    LoginPage loginPage;
    PopupChallengePage popupChallengePage;

    public Login() {
         PageFactory.initElements(driver, this);
         loginPage = new LoginPage(DriverFactory.getDriver());
         popupChallengePage = new PopupChallengePage(DriverFactory.getDriver());
    }

    public void LoginToPage(String emailAddress, String passkey) {
        popupChallengePage.pressPopupClose();
        loginPage.fillEmailAddress(emailAddress);
        loginPage.fillPassword(passkey);
        loginPage.pressClick();
    }
}
