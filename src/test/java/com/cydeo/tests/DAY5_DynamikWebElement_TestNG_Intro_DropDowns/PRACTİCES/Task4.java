package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4 {

    WebDriver driver;

    @BeforeMethod
    public void setup_Method(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @Test
    public void simpleDropDownTest(){
        //3. Verify “Simple dropdown” default selected value is correct
       // Expected: “Please select an option”
        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String expected="Please select an option";
        String current=simpleDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(current,expected);
       // 4. Verify “State selection” default selected value is correct
       // Expected: “Select a State”

        Select stateSelection=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actual=stateSelection.getFirstSelectedOption().getText();
        String expected1="Select a State";

        Assert.assertEquals(actual,expected1);
    }
}
