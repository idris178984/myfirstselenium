package com.cydeo.tests.DAY10_Upload_Actions_Jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1_RegistrationPractice {

    @Test
    public void registration_test(){

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker=new Faker();

        //3. Enter first name
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());


        //4. Enter last name
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.name().username());

        //6. Enter email address
        WebElement emailAdress=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAdress.sendKeys(userName+"@email.com");

        //7. Enter password
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("##?##?##"));

        //8. Enter phone number
        //9. Select a gender from radio buttons
        //10. Enter date of birth
        //11. Select Department/Office
        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is




    }
}
