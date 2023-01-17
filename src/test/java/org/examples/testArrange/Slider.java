package org.examples.testArrange;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.examples.projectPage.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Slider {
    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofMillis(5000));
    String URL;

    @When("user click on nokia slide")
    public void nokia()
    {
        homePage.slider(Hooks.driver).click();
        URL = homePage.URL(Hooks.driver);
    }
    @Then("user go to nokia url")
    public void check_nokia()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://demo.nopcommerce.com/nokia-lumia-1020","Not the expected nokia URL");
        softAssert.assertAll();
    }


    @When("user click on iphone slide")
    public void iphone()
    {
        homePage.iphone_slider(Hooks.driver).click();
        URL = homePage.URL(Hooks.driver);
    }
    @Then("user go to iphone url")
    public void check_iphone()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://demo.nopcommerce.com/iphone-6","Not the expected nokia URL");
        softAssert.assertAll();
    }

}
