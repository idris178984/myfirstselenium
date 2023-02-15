package com.cydeo.tests.DAY12_pom_design_expilicit_wait;

import com.cydeo.pages.TestCase1;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PomTestCase1 {

    TestCase1 testCase1;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("link"));
        testCase1=new TestCase1();

    }
    @Test
    public void TestCase1_test(){
       testCase1.homePage.isDisplayed();
        testCase1.signUp.click();
        testCase1.newUserSignUp.isDisplayed();

        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        testCase1.enterName.sendKeys(faker.name().firstName());



    }

}
