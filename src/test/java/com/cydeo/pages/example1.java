package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class example1 {
    public example1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//div[@id='loading']")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement inputUsername;

    @FindBy(css = "#pwd")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement errorMessage;

}
