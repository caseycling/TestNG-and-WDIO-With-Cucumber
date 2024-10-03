package com.saucelabs.stepdefinitions;

import com.saucelabs.utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DemoBasicStepDefinitions {

    protected String WEB_URL = "https://www.saucedemo.com/";

    private TestContext testContext;

    public DemoBasicStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("I load the SwagLab page")
    public void i_load_swaglab_page() {
        System.out.println("Run i_load_swaglab_page test");
        System.out.format("Thread ID - %2d - from feature file i_load_swaglab_page.\n",
                Thread.currentThread().getId());

        ThreadLocal<WebDriver> driver = testContext.getDriver();
        driver.get().navigate().to(WEB_URL);
    }

    @Then("I should see {string} title")
    public void i_Should_See_Title(String strTitle) {
        System.out.println("Run i_Should_See_Title test");
        ThreadLocal<WebDriver> driver = testContext.getDriver();
        String getTitle = driver.get().getTitle();
        Assert.assertEquals(getTitle, strTitle);
    }
}
