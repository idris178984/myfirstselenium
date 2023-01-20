package com.cydeo.tests.DAY8_Properties_config_reader.Practice;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_WebTable {

    @Test
    public void order_name_verify_test(){

       // 1. Go to: https://practice.cydeo.com/web-tables
        Driver.getDriver().get(ConfigurationReader.getProperty("link"));

        //2. Verify Bob’s name is listed as expected
        WebElement bobMartinCell=Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

       // Expected: “Bob Martin”
        String actual=bobMartinCell.getText();
        String expected="Bob Martin";
        Assert.assertEquals(actual,expected);
       // 3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement orderDate=Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='12/31/2021']"));
        String actualDate= orderDate.getText();
        String expectedDate="12/31/2021";

        Assert.assertEquals(actualDate,expectedDate);

    }
}
