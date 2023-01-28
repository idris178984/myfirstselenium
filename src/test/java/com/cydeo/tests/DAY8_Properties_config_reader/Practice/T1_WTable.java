package com.cydeo.tests.DAY8_Properties_config_reader.Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WTable {

    @Test
    public void T1_Test(){

        //1. Goto:https://practice.cydeo.com/web-tables
        Driver.getDriver().get("https://practice.cydeo.com/web-tables");


        //2. VerifyBob’s name is listed as expected.
        //Expected: “Bob Martin”
        WebElement bobMartin=Driver.getDriver().findElement(By.xpath("//td[.='Bob Martin']"));
        String expected="Bob Martin";
        String actual=bobMartin.getText();
        Assert.assertEquals(expected,actual);
        //3. VerifyBobMartin’s order date is as expected
        //Expected: 12/31/2021
        // alternative locator to bobMartinDateCell = "//td[.='Bob Martin']/../td[5]"
        WebElement bobMartinDateCell =
                Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualBobDate, expectedBobDate);

    }


}

