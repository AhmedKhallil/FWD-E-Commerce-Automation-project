package org.examples.testArrange;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.projectPage.HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class currency {

    HomePage homePage = new HomePage();
    String product;

    @When("Step 1 user select Euro currency from the dropdown list on the top left of home page")
    public void set_Euro(){
        Select Euro = new Select(homePage.currency_Euro(Hooks.driver));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("Step 2 Euro Symbol (€) is shown on the 4 products displayed in Home page")
    public void verify_Euro()
    {
        for (int i = 0; i < homePage.actual_Price(Hooks.driver).size(); i++)
        {
            product = homePage.actual_Price(Hooks.driver).get(i).getText();
            Assert.assertTrue(product.contains("€"),"Cannot find (€) symbol");
        }
    }


}
