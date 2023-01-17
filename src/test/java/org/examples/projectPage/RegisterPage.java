package org.examples.projectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    //    create WebElement method to register button

    public WebElement GenderMale(WebDriver driver)
    {
        WebElement Male= driver.findElement(By.id("gender-male"));
        return (Male);
    }
    public WebElement Female(WebDriver driver)
    {
        WebElement Female= driver.findElement(By.id("gender-female"));
        return (Female);
    }

    public WebElement FirstName(WebDriver driver)
    {
        WebElement Firstname = driver.findElement(By.id("FirstName"));
        return Firstname;
    }

    public WebElement LastName(WebDriver driver)
    {
        WebElement Lastname = driver.findElement(By.id("LastName"));
        return Lastname;
    }

    public WebElement DateOfBirthDay(WebDriver driver)
    {
        WebElement BirthDay = driver.findElement(By.name("DateOfBirthDay"));
        return BirthDay;
    }
    public WebElement DateOfBirthMonth(WebDriver driver)
    {
        WebElement BirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        return BirthMonth;
    }
    public WebElement BirthYear(WebDriver driver)
    {
        WebElement BirthYear = driver.findElement(By.name("DateOfBirthYear"));
        return BirthYear;
    }

    public WebElement Email(WebDriver driver)
    {
        WebElement Email = driver.findElement(By.id("Email"));
        return Email;
    }

    public WebElement Password(WebDriver driver)
    {
        WebElement Password = driver.findElement(By.id("Password"));
        return (Password);
    }
    public WebElement ConfirmPassword(WebDriver driver)
    {
        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        return (ConfirmPassword);
    }
    public WebElement Registerbutton(WebDriver driver)
    {
        WebElement Registerbutton = driver.findElement(By.id("register-button"));
        return (Registerbutton);
    }

    public WebElement SuccessfulMessage(WebDriver driver)
    {
        WebElement SuccessfulMessage = driver.findElement(By.className("result"));
        return (SuccessfulMessage);
    }

    public String color(WebDriver driver)
    {
        String color = driver.findElement(By.className("register-continue-button")).getAttribute("completed");
        return (color);
    }

    public WebElement Continue(WebDriver driver)
    {
        WebElement Continue = driver.findElement(By.linkText("Continue"));
        return (Continue);
    }

    public WebElement Exist(WebDriver driver)
    {
        WebElement Exist = driver.findElement(By.linkText("Exist"));
        return (Exist);
    }



}
