package com.unitedcoder.javamethodtutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class CustomerObjectMethods {


    // login add customer  delete customer edit customer

    WebDriver driver;
    public void login(LoginUser user){
        WebElement userNameField= driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passwordFiled= driver.findElement(By.id("password"));
        passwordFiled.sendKeys(user.getPassword());
        WebElement loginButton= driver.findElement(By.id("login"));
        loginButton.click();
    }
    public void addCustomer(CustomerInfo customerInfo){
        WebElement customerListLink= driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        //WebElement addCustomerLink= driver.findElement(By.xpath());
        //addCustomerLink.click();
        WebElement titleField=driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField= driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField= driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo.getFirstName());
        WebElement typeDropDown= driver.findElement(By.id("cust-type"));
        Select select = new Select(typeDropDown);
        //select.selectByVisibleText(TypeDropDownValue.REGIERED_CUSTOMER.getValue());
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();


    }

}
