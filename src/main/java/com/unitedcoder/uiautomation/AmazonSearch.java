package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) throws InterruptedException {
        // define driver -- chromedriver
        System.setProperty("webdriver.chrome.driver","/Users/xamxinur/WebDriver/chromedriver");
        // define chrome driver object
        WebDriver chromeDriver=new ChromeDriver();
        // open amazon home page
        //chromeDriver.navigate().to("https://www.amazon.nl/");
        chromeDriver.get("https://www.amazon.nl/");
        chromeDriver.manage().window().maximize();
        //Thread.sleep(5000);
        WebElement searchBox=chromeDriver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("AirPod"+ Keys.ENTER);
        chromeDriver.close();
    }
}
