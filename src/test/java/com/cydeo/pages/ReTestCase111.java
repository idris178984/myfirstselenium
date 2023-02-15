package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReTestCase111 {

    public ReTestCase111(){
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

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement enterEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//label[.='Sign up for our newsletter!']")
    public WebElement newsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement specialOffers;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobile;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccount;













}
