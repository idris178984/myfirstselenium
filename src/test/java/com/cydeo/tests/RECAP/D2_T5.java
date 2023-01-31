package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D2_T5 {

    @Test
    public void T4_Test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form ");
        // 3- Verify header text is as expected:
        //Expected: Registration form
        WebElement headerText=Driver.getDriver().findElement(By.xpath("//h2[.='Registration form']"));
        String expected="Registration form";
        String actual=headerText.getText();
        Assert.assertEquals(expected,actual);

        // 4- Locate “First name” input box
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //5- Verify placeholder attribute’s value is as expected: Expected: first name
        String expected1="first name";
        String actual1=firstName.getAttribute("placeholder");
        Assert.assertEquals(actual1,expected1);
    }
}
