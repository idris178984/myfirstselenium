package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4 {

    @Test
    public void T4_Test(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropDown=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='dropdown']")));
        String expected="Please select an option";
        String actualText=simpleDropDown.getFirstSelectedOption().getText();
       Assert.assertEquals(expected,actualText);
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateSelect=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='state']")));
        String expected1="State selection";
        String currently=stateSelect.getFirstSelectedOption().getText();


    }
}
