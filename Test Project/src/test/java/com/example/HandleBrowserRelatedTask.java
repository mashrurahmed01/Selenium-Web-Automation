package com.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBrowserRelatedTask {
    WebDriver driver;
    @Test
    public void testBrowserTask(){
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);

        //Thread.sleep(3000);

    }
}
