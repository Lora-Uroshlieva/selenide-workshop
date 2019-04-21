package com.stackoverflow.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    public ElementsCollection getLoginFormLabels() {
        return $$(Selectors.byXpath("//label"));
    }

    public SelenideElement getForgotPasswordLink() {
        return $(Selectors.byXpath("//a[.='Forgot password?']"));
    }

    public ForgotPasswordPage clickOnForgotPasswordLink() {
        getForgotPasswordLink().click();
        return new ForgotPasswordPage();
    }
}
