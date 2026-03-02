package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionTest {

    @Test
    public void testAddition() throws InterruptedException {

        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (forward slashes)
        driver.get("file:///S:/selenium-webapp/src/main/webapp/index.html");

        // Enter first number
        WebElement num1 = driver.findElement(By.id("num1"));
        num1.sendKeys("10");

        // Enter second number
        WebElement num2 = driver.findElement(By.id("num2"));
        num2.sendKeys("20");

        // Click Add button
        driver.findElement(By.tagName("button")).click();

        // Wait to see result
        Thread.sleep(2000);

        // Print result
        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Addition Result: " + result);

        // Close browser
        driver.quit();
    }
}