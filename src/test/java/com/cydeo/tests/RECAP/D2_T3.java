package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D2_T3 {

    @Test
    public void T3_Test(){

        //1- Open a chrome browser
        //2- Go to: "https://google.com
        Driver.getDriver().get("https://google.com");

        // 3- Write “apple” in search box

        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));

        // 4- Click google search button
        searchBox.sendKeys("apple"+ Keys.ENTER);

        // 5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle="apple";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
