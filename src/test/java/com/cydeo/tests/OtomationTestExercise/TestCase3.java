package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {

    @Test
    public void TestCase3_Test(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement signUp=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signUp.click();
        //5. Verify 'Login to your account' is visible
        WebElement loginYourAccount=Driver.getDriver().findElement(By.xpath("//h2[.='Login to your account']"));
        Assert.assertTrue(loginYourAccount.isDisplayed());

        //6. Enter incorrect email address and password
        //7. Click 'login' button
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        WebElement emailAddress=Driver.getDriver().findElement(By.xpath("//input[@data-qa='login-email']"));
        actions.click(emailAddress).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("########"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement incorrect=Driver.getDriver().findElement(By.xpath("//p[.='Your email or password is incorrect!']"));
        Assert.assertTrue(incorrect.isDisplayed());

    }
}
