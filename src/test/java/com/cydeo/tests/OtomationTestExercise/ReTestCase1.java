package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReTestCase1 {

    @Test
    public void ReTestCase1_Test(){


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage=Driver.getDriver().findElement(By.xpath("//a[@style='color: orange;']"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement signUp=Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        signUp.click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUserNameSignup=Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(newUserNameSignup.isDisplayed());

        //6. Enter name and email address
        //7. Click 'Signup' button
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        WebElement enterName=Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(enterName).sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation=Driver.getDriver().findElement(By.xpath("//b[.='Enter Account Information']"));
        Assert.assertTrue(enterAccountInformation.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title=Driver.getDriver().findElement(By.xpath("//input[@id='id_gender1']"));
        actions.click(title)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("############"))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("#"))
                .sendKeys(Keys.TAB)
                .sendKeys("September")
                .sendKeys(Keys.TAB)
                .sendKeys("1984").perform();

/*
        Select day=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='days']")));
        day.selectByValue("1");
        Select month=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='months']")));
        month.selectByValue("9");
        Select year=new Select(Driver.getDriver().findElement(By.xpath("years")));
        year.selectByValue("1984");
      */
        WebElement newsLetter=Driver.getDriver().findElement(By.xpath("//input[@name='newsletter']"));
        newsLetter.click();
        WebElement specialOffer=Driver.getDriver().findElement(By.xpath("//input[@name='optin']"));
        specialOffer.click();

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='first_name']"));
        actions.click(firstName).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().buildingNumber())
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("kelkit")
                .sendKeys(Keys.TAB)
                .sendKeys("istanbul")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("0553-060-1229")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
