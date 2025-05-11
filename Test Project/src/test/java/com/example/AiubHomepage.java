package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class AiubHomepage extends DriverSetup{
    @Test
    public void testBrowserTask () throws InterruptedException{
        driver.get("https://www.aiub.edu");
        Thread.sleep(1000);
        System.out.println("Website Open Successful");
        driver.manage().window().maximize();
        //Open Notice
        driver.findElement(By.className("text-white")).click();
        Thread.sleep(2000);
        System.out.println("Notice Open Successful");

        //Open News & Events
        driver.findElement(By.partialLinkText("News And Events")).click();
        Thread.sleep(2000);
        System.out.println("News & Events open successful");


//        //Open campus tab
//        driver.findElement(By.cssSelector("a[href='/onCampus']")).click();
//        Thread.sleep(2000);
//        System.out.println("On Campus open successful");

        //Open Academics tab
        WebElement element = driver.findElement(By.xpath("//a[text()='Academics']"));

// Perform hover action
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        Thread.sleep(1000); // Optional: wait for dropdown/submenu to appear

        System.out.println("HOVER SUCCESS");

        WebElement academics = driver.findElement(By.cssSelector("a[href='/faculties/fass']"));
        academics.click();
        Thread.sleep(2000);
        System.out.println("FASS open successful");




    }

}
