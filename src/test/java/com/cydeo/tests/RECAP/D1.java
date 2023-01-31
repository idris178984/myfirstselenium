package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D1 {

    @Test
    public void Yahoo_Test(){

        //1. Open Chrome browser
        //2. Go to https://www.yahoo.com
        Driver.getDriver().get("https://www.yahoo.com");

        // 3. Verify title:
        //Expected: Yahoo
        String expected="Yahoo| weather,search,politics";
        String actual=Driver.getDriver().getTitle();
        Assert.assertEquals(actual,expected);
    }
}
