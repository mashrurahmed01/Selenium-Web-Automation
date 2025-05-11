package com.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class AppTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);

        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);

        driver.navigate().refresh();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        Thread.sleep(2000);

        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle : handles) {
            System.out.println(handle);
        }
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
