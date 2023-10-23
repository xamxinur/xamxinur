package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest1 {
    public static void main(String[] args) throws InterruptedException {
        LoginUser loginUser = new LoginUser();
        String[] credentials={"testautomation1","automation123!"};

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver=new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");

        WebElement userNameField=driver.findElement(By.id("username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());

        WebElement paswordFiled=driver.findElement(By.id("password"));
        loginUser.setPassword(credentials[1]);
        paswordFiled.sendKeys(loginUser.getPassword());

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













