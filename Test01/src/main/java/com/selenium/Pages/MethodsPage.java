package com.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodsPage {

    public WebDriver driver;
    public WebDriverWait wait;


    public MethodsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wait Wraper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //IsElementDisplayed
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
//        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

//    private void assertTrue(boolean displayed) {
}
