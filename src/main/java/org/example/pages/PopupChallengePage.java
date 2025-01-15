package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupChallengePage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"popup-widget50532-close-icon\"]")
    WebElement popupClose;

    public PopupChallengePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressPopupClose() {
        if(popupClose.isDisplayed() == Boolean.TRUE){
            popupClose.click();
        }
    }
}
