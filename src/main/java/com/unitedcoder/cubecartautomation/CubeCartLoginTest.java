package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {
        String username="testautomation1";
        String password="automation123!";

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");

        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);

        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(password);

        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
       // String invalidLoginText=driver.findElement(By.xpath("//*[@id=\"header\"]/span/a[2]")).getText();

        WebElement logoutLink= driver.findElement(By.xpath("//*[@id=\"header\"]/span/a[2]"));
        WebElement dashBoard= driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/div/ul[2]/li/a"));


        if(dashBoard.getText().equalsIgnoreCase("dashboard")){
            System.out.println("Login Passed!");
        }else {
            //String verifyText=driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/div/ul[2]/li/a")).getText();
            //if(verifyText.equalsIgnoreCase("dashboard")) {
                System.out.println("Login Test failed!");
            }
        driver.close();


    }
}













