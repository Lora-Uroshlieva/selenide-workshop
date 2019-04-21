package com.stackoverflow.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    public SelenideElement getForgotPasswordForm() {
        return $(Selectors.byCssSelector("#account-recovery"));
}

    public void setEmail(String email) {
        $(Selectors.byCssSelector("input#email")).sendKeys(email);
    }

    public void clickSendRecoveryEmailButton() {
        $(Selectors.byCssSelector("#submit-button")).click();

    }

    public SelenideElement getInvalidEmailLabel() {
        return $(Selectors.byCssSelector(".js-error-message"));
    }
}
