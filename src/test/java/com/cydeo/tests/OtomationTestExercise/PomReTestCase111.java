package com.cydeo.tests.OtomationTestExercise;

import com.cydeo.pages.ReTestCase111;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PomReTestCase111 {

    ReTestCase111 reTestCase111;
    @BeforeMethod
    public void setUpMethod(){
        reTestCase111=new ReTestCase111();
        Driver.getDriver().get(ConfigurationReader.getProperty("automation.exercise.url"));

    }


    @Test
    public void ReTestCase111_Test(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
       // ReTestCase111 reTestCase111=new ReTestCase111();
        reTestCase111.homePage.isDisplayed();

        //4. Click on 'Signup / Login' button
        reTestCase111.signUp.click();
        //5. Verify 'New User Signup!' is visible
        reTestCase111.newUserSignUp.isDisplayed();
        Faker faker=new Faker();
        //6. Enter name and email address
        reTestCase111.enterName.sendKeys(faker.name().firstName());
        reTestCase111.enterEmail.sendKeys(faker.internet().emailAddress());
        //7. Click 'Signup' button
        reTestCase111.signUpButton.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        reTestCase111.enterAccountInformation.isDisplayed();
        //9. Fill details: Title, Name, Email, Password, Date of birth
        reTestCase111.gender.click();
        reTestCase111.password.sendKeys(faker.numerify("###########"));
        Select day=new Select(reTestCase111.day);
        day.selectByValue("1");
        Select month=new Select(reTestCase111.month);
        month.selectByValue("9");
        Select year=new Select(reTestCase111.years);
        year.selectByValue("1984");

        //10. Select checkbox 'Sign up for our newsletter!'
        reTestCase111.newsLetter.click();
        //11. Select checkbox 'Receive special offers from our partners!'
        reTestCase111.specialOffers.click();
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        reTestCase111.firstName.sendKeys(faker.name().firstName());
        reTestCase111.lastName.sendKeys(faker.name().lastName());
        reTestCase111.company.sendKeys(faker.company().name());
        reTestCase111.address1.sendKeys(faker.address().fullAddress());
        Select country=new Select(reTestCase111.country);
        country.selectByVisibleText("Canada");
        reTestCase111.state.sendKeys(faker.name().bloodGroup());
        reTestCase111.city.sendKeys("malatya");
        reTestCase111.zipcode.sendKeys(faker.number().digit());
        reTestCase111.mobile.sendKeys(faker.phoneNumber().phoneNumber());
        //13. Click 'Create Account button'
        reTestCase111.createAccount.click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }

}
