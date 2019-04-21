package com.stackoverflow.stories;

import com.stackoverflow.steps.HomeSteps;
import com.stackoverflow.steps.LoginSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends AbstractTest {
    private HomeSteps homeSteps;
    private LoginSteps loginSteps;

    public LoginTest() {
        this.homeSteps = new HomeSteps();
        this.loginSteps = new LoginSteps();
    }

    @Test
    public void loginFormView() {
        open("https://stackoverflow.com/users/login");
        homeSteps.goToLoginPage();
        loginSteps.assertLoginFormLabelsSizeIsEqualTo(2);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginSteps.assertLoginFormLabelsAreEqualTo("Email", "Password");
    }
}
