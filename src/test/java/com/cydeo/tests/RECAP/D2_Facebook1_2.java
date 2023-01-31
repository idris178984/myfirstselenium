package com.cydeo.tests.RECAP;

import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D2_Facebook1_2 {

    @Test
    public void Facebook1_Test(){

        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");
        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);




    }

    @Test
    public void Facebook2_Test(){

        // //TC #2: Facebook incorrect login title verification 1. Open Chrome browser
        //        //2. Go to https://www.facebook.com

        //        //3. Enter incorrect username
        //        //4. Enter incorrect password 5. Verify title changed to:
        //        //Expected: “Log into Facebook”
    }

}
