package com.cydeo.tests.d1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //set up the browser driver
        WebDriverManager.chromedriver().setup();

        //This line is opening empty browser
        WebDriver driver=new ChromeDriver();

        //this line maximize browser size
        driver.manage().window().maximize();

       driver.get("https://www.tesla.com");

        //Get the title of page
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Get current URL using selenium
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //stop code execution 3 seconds
        Thread.sleep(3000);

       //use selenium to navigate back
        driver.navigate().back();

//stop code execution 3 seconds
        Thread.sleep(3000);

//use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution 3 seconds
        Thread.sleep(3000);

//use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution 3 seconds
        Thread.sleep(3000);

        //use navigate().to()
        driver.navigate().to("https://www.google.com");

        //get the title of page
        //System.out.println("driver.getTitle()="+driver.getTitle());

            //get current title of page
        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Get current URL using selenium
        currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this will close the current window
        //driver.close();

        //this will close the all open window
        //driver.quit();
    }
}
