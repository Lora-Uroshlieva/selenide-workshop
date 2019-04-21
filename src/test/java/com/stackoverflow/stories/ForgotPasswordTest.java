package com.stackoverflow.stories;

import com.stackoverflow.steps.ForgotPasswordSteps;
import com.stackoverflow.steps.HomeSteps;
import com.stackoverflow.steps.LoginSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ForgotPasswordTest extends AbstractTest {
    private HomeSteps homeSteps;
    private LoginSteps loginSteps;
    private ForgotPasswordSteps forgotPasswordSteps;

    public ForgotPasswordTest() {
        this.homeSteps = new HomeSteps();
        this.loginSteps = new LoginSteps();
        this.forgotPasswordSteps = new ForgotPasswordSteps();
    }

    @Test
    public void  forgotPasswordView() {
        open("https://stackoverflow.com/users/login");
        loginSteps.navigateToForgotPasswordLink();
        forgotPasswordSteps.assertThatForgotPasswordFormIsVisible();
    }

    @Test
    public void forgotPasswordNegativeCase() {
        open("https://stackoverflow.com/users/account-recovery");
        String invalidEmail = "bla-bla";
        forgotPasswordSteps.setEmail(invalidEmail);
        forgotPasswordSteps.clickSendRecoveryEmailButton();
        forgotPasswordSteps.assertWarningMessageIsEqualTo("Invalid email address");


    }
}
