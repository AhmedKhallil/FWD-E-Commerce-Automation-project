package org.examples.projectPage;

import org.examples.testArrange.Hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public class LoginPage {

    public WebElement Email (WebDriver driver)
    {
        WebElement Email = driver.findElement(By.id("Email"));
        return (Email);
    }

    public WebElement Password (WebDriver driver)
    {
        WebElement Password = driver.findElement(By.id("Password"));
        return (Password);
    }

    public WebElement login_BTN (WebDriver driver)
    {
        WebElement login = driver.findElement(By.className("login-button"));
        return (login);
    }

    public WebElement logout (WebDriver driver)
    {
        WebElement logout = driver.findElement(By.linkText("Log out"));
        return (logout);
    }

    public WebElement valid_Assert (WebDriver driver)
    {
        WebElement Assert = driver.findElement(By.className("ico-account"));
        return (Assert);
    }

    public WebElement invalid_Assert (WebDriver driver)
    {
        WebElement Assert = driver.findElement(By.className("validation-summary-errors"));
        return (Assert);
    }

}
