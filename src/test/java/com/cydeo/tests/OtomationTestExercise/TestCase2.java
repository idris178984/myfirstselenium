package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

    @Test
    public void TestCase2_Test(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        Assert.assertTrue(homePage.isDisplayed());
        System.out.println("homePage.isDisplayed() = " + homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        WebElement login=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        login.click();

        //5. Verify 'Login to your account' is visible
        WebElement loginYourAccount=Driver.getDriver().findElement(By.xpath("//h2[.='Login to your account']"));
        Assert.assertTrue(loginYourAccount.isDisplayed());
        //6. Enter correct email address and password
        //7. Click 'login' button
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        WebElement emailAdress=Driver.getDriver().findElement(By.xpath("//input[@data-qa='login-email']"));
        actions.click(emailAdress).sendKeys("aylul178984@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("12345679"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();


        //8. Verify that 'Logged in as username' is visible
        WebElement loggedAsUsername=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(loggedAsUsername.isDisplayed());
        //9. Click 'Delete Account' button
        WebElement deleteAccount=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteAccount.click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement advertisement=Driver.getDriver().findElement(By.xpath("//span[@class='ns-q3sl3-e-16']"));
        advertisement.click();

    }
}
