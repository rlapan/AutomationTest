package com.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProducts extends MethodsPage {
    public AllProducts(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div"));
    }

}
