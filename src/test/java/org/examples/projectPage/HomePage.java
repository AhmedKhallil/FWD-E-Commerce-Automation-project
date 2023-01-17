package org.examples.projectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebElement register (WebDriver driver)
    {
        WebElement register = driver.findElement(By.linkText("Register"));
        return register;
    }

    public WebElement Login (WebDriver driver)
    {
        WebElement Login = driver.findElement(By.linkText("Log in"));
        return Login;
    }

    public WebElement currency_Euro (WebDriver driver)
    {
        WebElement currency = driver.findElement(By.id("customerCurrency"));
        return currency;
    }

    public List<WebElement> actual_Price (WebDriver driver)
    {
        List<WebElement> price = driver.findElements(By.className("actual-price"));
        return price;
    }

    public WebElement search_Box (WebDriver driver)
    {
        WebElement search = driver.findElement(By.className("ui-autocomplete-input"));
        return search;
    }

    public WebElement searchbutton (WebDriver driver)
    {
        WebElement searchbutton = driver.findElement(By.className("search-box-button"));
        return searchbutton;
    }

    public String URL (WebDriver driver)
    {
        String url = driver.getCurrentUrl();
        return url;
    }

    public List<WebElement> list_product_Title (WebDriver driver)
    {
        List<WebElement> title = driver.findElements(By.className("product-title"));
        return title;
    }

    public WebElement product_Title (WebDriver driver)
    {
        WebElement title = driver.findElement(By.className("product-title"));
        return title;
    }

    public WebElement sku_locator (WebDriver driver)
    {
        WebElement SKU = driver.findElement(By.className("additional-details"));
        return SKU;
    }

    public List<WebElement> main_Categories (WebDriver driver)
    {
        List<WebElement> maincategory = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        return maincategory;
    }

    public List<WebElement> sub_Categories (WebDriver driver ,int selectedMainCat)
    {
        List<WebElement> subcategory = driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+selectedMainCat+"]/li"));
        return subcategory;
    }

    public WebElement page_Title (WebDriver driver)
    {
        WebElement pagetitle = driver.findElement(By.className("page-title"));
        return pagetitle;
    }

    public WebElement slider(WebDriver driver)
    {
        WebElement slider = driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(1)"));
        return slider;
    }

    public WebElement iphone_slider(WebDriver driver)
    {
        WebElement slider = driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(2)"));
        return slider;
    }

    public WebElement facebook(WebDriver driver)
    {
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        return facebook;
    }
    public WebElement twitter(WebDriver driver)
    {
        WebElement twitter = driver.findElement(By.linkText("Twitter"));
        return twitter;
    }
    public WebElement rss(WebDriver driver)
    {
        WebElement R = driver.findElement(By.linkText("RSS"));
        return R;
    }
    public WebElement Youtube(WebDriver driver)
    {
        WebElement Youtube = driver.findElement(By.linkText("YouTube"));
        return Youtube;
    }

    public WebElement success_bar (WebDriver driver)
    {
        WebElement bar = driver.findElement(By.cssSelector("#bar-notification > div"));
        return bar;
    }

    public WebElement successbar (WebDriver driver)
    {
        WebElement bar = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return bar;
    }

    public WebElement confirmmessage (WebDriver driver)
    {
        WebElement confirmmessage = driver.findElement(By.cssSelector("#bar-notification > div > p"));
        return confirmmessage;
    }

    public WebElement logo (WebDriver driver)
    {
        WebElement logobutton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button"));
        return logobutton;
    }

    public WebElement listbutton (WebDriver driver)
    {
        WebElement listbutton = driver.findElement(By.className("wishlist-label"));
        return listbutton;
    }

    public WebElement Q (WebDriver driver)
    {
        WebElement Q = driver.findElement(By.className("qty-input"));
        return Q;
    }


}
