package com.stackoverflow.steps;

import com.stackoverflow.pages.HomePage;

public class HomeSteps {
    private HomePage homePage;

    public HomeSteps() {
        this.homePage = new HomePage();
    }

    public void goToLoginPage() {
        homePage.clickOnLoginButton();
    }
}
