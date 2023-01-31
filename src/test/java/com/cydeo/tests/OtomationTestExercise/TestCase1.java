package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

    @Test
    public void TestCase1_Test() {



       // 1. Launch browser
      //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

       // 3. Verify that home page is visible successfully
        WebElement homePage=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement signUp=Driver.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signUp.click();
        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignUp=Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(newUserSignUp.isDisplayed());
       // 6. Enter name and email address

        Faker faker=new Faker();

        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-name']"));
        userName.sendKeys(faker.bothify("idris###"));

        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        WebElement signUpButton=Driver.getDriver().findElement(By.xpath("//button[@data-qa='signup-button']"));
        signUpButton.click();
       // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement accountInformation=Driver.getDriver().findElement(By.xpath("//b[.='Enter Account Information']"));
        Assert.assertTrue(accountInformation.isDisplayed());

        Actions actions=new Actions(Driver.getDriver());


       // 9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@data-qa='password']"));
        actions.click(password).sendKeys(faker.numerify("########"))
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("September")
                .sendKeys(Keys.TAB)
                .sendKeys("1984")

                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB)
                .sendKeys("idris")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("ataturk mah.")
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("5530601229")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys("akca")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1234567").perform();




        //password.sendKeys(faker.numerify("########"));

       // Select checkBox1=new Select(Driver.getDriver().findElement(By.xpath("//input[@id='newsletter']")));
        /*
        WebElement checkBox1=Driver.getDriver().findElement(By.xpath("//*[@id=\"newsletter\"]"));
        WebElement checkBox2=Driver.getDriver().findElement(By.xpath("//*[@id=\"optin\"]"));
        checkBox1.click();
        checkBox2.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
*/
        // 10. Select checkbox 'Sign up for our newsletter!'

       // 11. Select checkbox 'Receive special offers from our partners!'
       // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
       // 13. Click 'Create Account button'
       // 14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
       // 16. Verify that 'Logged in as username' is visible
       // 17. Click 'Delete Account' button
       // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button



    }
}
