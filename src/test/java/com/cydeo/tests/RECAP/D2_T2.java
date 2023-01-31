package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D2_T2 {

    @Test
    public void T2_Test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com");
        //3- Click to A/B Testing from top of the list.
        WebElement ABTesting=Driver.getDriver().findElement(By.xpath("//a[.='A/B Testing']"));
        ABTesting.click();
        // 4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle="No A/B Test";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        //5- Go back to home page by using the .back();
        Driver.getDriver().navigate().back();
        // 6- Verify title equals:
        //Expected: Practice

        String expectedTitle1="Practice";
        String actualTitle1=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle1,expectedTitle1);
    }
}
