package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns.PRACTİCES;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task5_6 {

    public WebDriver driver;

    @BeforeMethod
    public void setup_Method() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


    }

    @Test
    public void selectingState_test5(){
       // 3. Select Illinois
        //  4. Select Virginia
        // 5. Select California
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5);

        // 6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);




    }

    @Test
    public void task6(){

       // 3. Select “December 1st, 1924” and verify it is selected.
         //       Select year using : visible text Select month using : value attribute Select day using : index numbe

        Select Month=new Select(driver.findElement(By.xpath("//select[@id='month']")));

        Select Year=new Select(driver.findElement(By.xpath("//select[@id='year']")));

        Select Day=new Select(driver.findElement(By.xpath("//select[@id='day']")));


        Month.selectByVisibleText("December");

        Year.selectByValue("1924");

        Day.selectByIndex(0);

        String actualMonth=Month.getFirstSelectedOption().getText();
        String expectedMonth="December";

        String actualYear=Year.getFirstSelectedOption().getText();
        String expectedYear="1924";

        String actualDay=Day.getFirstSelectedOption().getText();
        String expectedDay="1";

        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualYear,expectedYear);
        Assert.assertEquals(actualDay,expectedDay);





    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
