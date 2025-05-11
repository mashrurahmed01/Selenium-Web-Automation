package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Locators {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }
    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchArea = driver.findElement(By.id("APjFqb"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
