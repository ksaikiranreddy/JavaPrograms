package com.demoproject.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='at-cv-lightbox-win']//child::div[@id='at-cv-lightbox-header']//child::a")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a#btn_basic_example")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/a[contains(text(),'Simple Form Demo')]")).click();
        driver.quit();

    }
}
