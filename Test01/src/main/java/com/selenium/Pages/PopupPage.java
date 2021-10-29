package com.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupPage {
    private final WebDriver driver;

    public PopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public PopupPage displaying(String string) {
        driver.findElement(By.xpath("//*[@ id='close-form']"));
        return PopupPage();
    }

    public String clickClosePopup() {
        driver.findElement(By.xpath("//*[@ id='close-form']/parent::*/parent::*")).click();
        return;
    }

}
