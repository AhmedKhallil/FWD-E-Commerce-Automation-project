package org.examples.testArrange;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.projectPage.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class follow {
    HomePage homePage = new HomePage();
    String URL;

    @When("user opens facebook link")
    public void facebook() throws InterruptedException {
        homePage.facebook(Hooks.driver).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
    }
    @Then("facebook page is opened in new tab")
    public void facebook_link()
    {
        URL = homePage.URL(Hooks.driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://www.facebook.com/nopCommerce");
        softAssert.assertAll();
        Hooks.driver.close();
    }



    @When("user opens twitter link")
    public void twitter() throws InterruptedException {
        homePage.twitter(Hooks.driver).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
    }
    @Then("twitter page is opened in new tab")
    public void twitter_link()
    {
        URL = homePage.URL(Hooks.driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://twitter.com/nopCommerce");
        softAssert.assertAll();
        Hooks.driver.close();
    }

    @When("user opens rss link")
    public void rss() throws InterruptedException {
        homePage.rss(Hooks.driver).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        if (tabs.size() > 1) {

            Hooks.driver.switchTo().window(tabs.get(1));
        }
        else
        {
            Hooks.driver.switchTo().window(tabs.get(0));
        }
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
    }
    @Then("rss page is opened in new tab")
    public void rss_link()
    {
        URL = homePage.URL(Hooks.driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://demo.nopcommerce.com/new-online-store-is-open");
        softAssert.assertAll();
        Hooks.driver.close();
    }

    @When("user opens youtube link")
    public void youtube() throws InterruptedException {
        homePage.Youtube(Hooks.driver).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
    }
    @Then("youtube page is opened in new tab")
    public void youtube_link()
    {
        URL = homePage.URL(Hooks.driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(URL,"https://www.youtube.com/user/nopCommerce");
        softAssert.assertAll();
        Hooks.driver.close();
    }


}
