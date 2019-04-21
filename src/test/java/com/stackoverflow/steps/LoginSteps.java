package com.stackoverflow.steps;

import com.stackoverflow.pages.ForgotPasswordPage;
import com.stackoverflow.pages.LoginPage;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;

public class LoginSteps {

    private LoginPage loginPage;
    private ForgotPasswordPage forgotPasswordPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
        this.forgotPasswordPage = new ForgotPasswordPage();
    }

    public void assertLoginFormLabelsSizeIsEqualTo(int labelsSize) {
        loginPage.getLoginFormLabels().shouldHave(size(labelsSize));
    }

    public void assertLoginFormLabelsAreEqualTo(String emailLabel, String passwordLabel) {
        loginPage.getLoginFormLabels().shouldHave(exactTexts(emailLabel, passwordLabel));
    }

    public void navigateToForgotPasswordLink() {
        loginPage.clickOnForgotPasswordLink();
    }
}
