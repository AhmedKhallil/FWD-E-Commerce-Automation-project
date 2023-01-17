package org.examples.testArrange;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.examples.projectPage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Search {
    HomePage homePage = new HomePage();
    String title;
    String sku;

    @When("user search using product book name")
    public void search_By_book_name()
    {
        title = "book";
        homePage.search_Box(Hooks.driver).sendKeys(title);
        homePage.search_BTN(Hooks.driver).click();
    }


    @When("user search using product laptop name")
    public void search_By_laptop_name()
    {
        title = "laptop";
        homePage.search_Box(Hooks.driver).sendKeys(title);
        homePage.search_BTN(Hooks.driver).click();
    }

    @When("user search using product nike name")
    public void search_By_nike_name()
    {
        title = "nike";
        homePage.search_Box(Hooks.driver).sendKeys(title);
        homePage.search_BTN(Hooks.driver).click();
    }

    @Then("user should be able to find items with product name")
    public void check_elements_by_name(){
        Assert.assertEquals(homePage.URL(Hooks.driver).contains("https://demo.nopcommerce.com/search?q="),true
                ,"URL isn't as expected");

        for (int i = 0; i < homePage.list_product_Title(Hooks.driver).size(); i++)
        {
            String product_title = homePage.list_product_Title(Hooks.driver).get(i).getText();
            Assert.assertEquals(product_title.toLowerCase().contains(title), true, "cannot find title");
        }
    }



    @When("user search using product SCI_FAITH sku")
    public void search_By_SCI_FAITH_sku() {
        sku = "SCI_FAITH";
        homePage.search_Box(Hooks.driver).sendKeys(sku);
        homePage.search_BTN(Hooks.driver).click();
    }

    @When("user search using product APPLE_CAM sku")
    public void search_By_APPLE_CAM_sku() {
        sku = "APPLE_CAM";
        homePage.search_Box(Hooks.driver).sendKeys(sku);
        homePage.search_BTN(Hooks.driver).click();
    }

    @When("user search using product SF_PRO_11 sku")
    public void search_By_SF_PRO_11_sku() {
        sku = "SF_PRO_11";
        homePage.search_Box(Hooks.driver).sendKeys(sku);
        homePage.search_BTN(Hooks.driver).click();
    }

    @Then("the product sku shown in product page should contains the sku that you are using in search")
    public void check_element_by_sku(){
        homePage.product_Title(Hooks.driver).click();
        Assert.assertEquals(homePage.sku_locator(Hooks.driver).getText().contains(sku),true,"problem in assert: "+sku);
    }


}
