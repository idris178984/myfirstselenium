package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2 {

    @Test
    public void T2_Test(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement clickHokey=Driver.getDriver().findElement(By.xpath("//input[@id='hockey']"));
        clickHokey.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        Assert.assertTrue(clickHokey.isSelected());
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS



    }
}
