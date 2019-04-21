package com.stackoverflow.stories;

import com.codeborne.selenide.SelenideDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebdriverManager;

import java.lang.reflect.Method;

public class AbstractTest{

    protected static final ThreadLocal<SelenideDriver> driver = new ThreadLocal<SelenideDriver>();

    @BeforeMethod
    public void tearUp(Method method) {
        driver.set(WebdriverManager.getWebDriver(method.getName()));
    }

    @AfterMethod
    public void tearDown(Method method) {
        driver.get().getWebDriver().quit();
    }
}
