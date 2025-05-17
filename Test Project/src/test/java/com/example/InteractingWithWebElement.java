package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void interactWithElement() throws InterruptedException {
        driver.get("https://www.aiub.edu/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//a[text()='Academics']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        Thread.sleep(1000); // Optional: wait for dropdown/submenu to appear

        driver.findElement(By.cssSelector("a[href='/faculties/fst']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[href='/faculty-list/faculty-of-science--technology?faculty=FACULTY+OF+SCIENCE+%26+TECHNOLOGY']")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("MASHIOUR RAHMAN")).click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//h1[contains(text(),'MASHIOUR')]"));
        System.out.println("Name: " + name.getText());

        WebElement email = driver.findElement(By.xpath("//span[contains(@x-text,'profileData.CvPersonal.Email')]"));
        System.out.println("Email: " + email.getText());

        WebElement Building = driver.findElement(By.xpath("//span[contains(@x-text,'profileData.PersonalOtherInfo.BuildingNo')]"));
        System.out.println("Building: " + Building.getText());

        WebElement RoomNo = driver.findElement(By.xpath("//span[contains(@x-text,'profileData.PersonalOtherInfo.RoomNo')]"));
        System.out.println("RoomNo: " + RoomNo.getText());


    }
}
