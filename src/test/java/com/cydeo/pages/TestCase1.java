package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase1 {


    public TestCase1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@style='color: orange;']")
    public WebElement homePage;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUp;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement enterName;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement getTitle;


}
