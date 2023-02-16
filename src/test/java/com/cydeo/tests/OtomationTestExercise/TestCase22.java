package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.pages.TestCase222;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase22 {

    TestCase222 testCase222;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("automation.exercise.url"));
        testCase222=new TestCase222();
    }

    @Test
    public void TestCase22(){
        testCase222.homePage.isDisplayed();
        testCase222.signUp.click();
        testCase222.loginYourAccount.isDisplayed();
        Faker faker=new Faker();
        testCase222.emailAddress.sendKeys(faker.internet().emailAddress());
        testCase222.password.sendKeys(faker.numerify("################"));
        testCase222.loginButton.click();
    }
}
