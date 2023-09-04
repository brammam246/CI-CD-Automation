package com.qascript;

import io.github.bonigarcia.wdm.WebDriverManagaer;
// import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        //to set up chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.git("https://www.tooplate.com/view/2137-barista-cafe")
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
        
        //to go back to the main page 
        drive.switchTo().defaultContext();
        //to find the hight and the width of the window
        driver.manage().window().getSize().getWidth();
        driver.manage().window().getSize().getWidth
        //to run/use js in java
        JavascriptExecutor js = (JavascriptExecutor)driver;
            // to run js
        //WebElement button = driver.findElement(By.name("button name"));
        //js.executeScript("argumetns[0].click();", button);
            //execute js directly
        //js.executeScript("comsole.log('hello veera'));  //use can seethe hello veera in 'console'
        
        Thread.sleep(6000);
        driver.close();
        
    }


}
