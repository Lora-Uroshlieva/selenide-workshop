package com.stackoverflow.steps;

import com.codeborne.selenide.Condition;
import com.stackoverflow.pages.ForgotPasswordPage;


public class ForgotPasswordSteps {
    private ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordSteps(){
        forgotPasswordPage = new ForgotPasswordPage();
    }

    public void assertForgotPasswordFormIsVisible() {
        forgotPasswordPage.getForgotPasswordForm().shouldBe(Condition.visible);
    }

    public void setEmail(String invalidEmail) {
    }

    public void clickSendRecoveryEmailButton() {
        forgotPasswordPage.clickSendRecoveryEmailButton();
    }

    public void assertThatForgotPasswordFormIsVisible() {
        forgotPasswordPage.getForgotPasswordForm().shouldBe(Condition.visible);
    }

    public void assertWarningMessageIsEqualTo(String message) {
        forgotPasswordPage.getInvalidEmailLabel().shouldHave(Condition.text(message));
    }
}
