package com.stackoverflow.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public SelenideElement getLoginButton() {
        return $(Selectors.byCssSelector(".login-link"));
    }

    public LoginPage clickOnLoginButton() {
        getLoginButton().click();
        return new LoginPage();
    }
}
