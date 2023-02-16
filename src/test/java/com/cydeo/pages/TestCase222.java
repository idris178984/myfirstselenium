package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase222 {

    public TestCase222(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//a[@style='color: orange;']")
    public WebElement homePage;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUp;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccount;

    @FindBy(xpath = "(//input[@name='email']) [1]")
    public WebElement emailAddress;

    @FindBy(xpath = "(//input[@name='password']) [1]")
    public WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;



}
