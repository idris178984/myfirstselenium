package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_T6_T7 {

    @Test
    public void T5_Test(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
        Select stateSelect=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='state']")));
        stateSelect.selectByIndex(14);
        stateSelect.selectByValue("VA");
        stateSelect.selectByVisibleText("California");

        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        String expected="California";
        String actual=stateSelect.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected);
        //Use all Select options. (visible text, value, index)


    }

    @Test
    public void T6_Test(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
        //3. Select “December 1st, 1924” and verify it is selected.
        Select month=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));
        Select day=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='day']")));
        Select year=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='year']")));
        month.selectByValue("11");
        day.selectByIndex(0);
        year.selectByVisibleText("1924");

        String actualMonth=month.getFirstSelectedOption().getText();
        String expectedMonth="December";

        String actualYear=year.getFirstSelectedOption().getText();
        String expectedYear="1924";

        String actualDay=day.getFirstSelectedOption().getText();
        String expectedDay="1";

        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);
        Assert.assertEquals(actualYear,expectedYear);

        //Select year using : visible text Select month using : value attribute Select day using : index number
    }



}
