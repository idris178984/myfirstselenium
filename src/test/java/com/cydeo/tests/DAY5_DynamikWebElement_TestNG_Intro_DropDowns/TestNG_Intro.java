package com.cydeo.tests.DAY5_DynamikWebElement_TestNG_Intro_DropDowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass

    public void setupMethod(){
        System.out.println("Before class is running...");
    }
    @AfterClass
    public void TearDown(){
        System.out.println("After class is running...");
    }


    @BeforeMethod
    public void setUpMethod(){
    System.out.println("Before method is running...");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running...");
    }

    @Test(priority=1)

    public void test1() {
        System.out.println("Test1 is running...");


        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }
    @Test(priority = 2)

    public void test2(){
        System.out.println("Test2 is running...");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here");

    }

}
