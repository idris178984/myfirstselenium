package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D2 {
    @Test
    public void D2_T1_Test(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com");
        //3. Verify URL contains
        //Expected: cydeo
        String expectedUrl="cydeo";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

        // 4. Verify title:
        //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
