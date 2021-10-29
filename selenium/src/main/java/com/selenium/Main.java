package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {

    public static Object WebElement;
    public static Object List;

    public static void main(String[] args) {
        // 1. Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "E://Automation//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 2. Navigate to the URL
        driver.get("https://www.joshwoodcolour.com");

        // max the Chrome browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@ id='close-form']")); // find popup
        driver.findElement(By.xpath("//*[@ id='close-form']/parent::*/parent::*")).click(); // click close on popup
        driver.findElement(By.xpath("//*[@class='header__middle']//*[@class='site-nav__item']//*[@href='/collections/all-products']")).click(); // select all products

        driver.findElement((By.xpath("//*[@class='product-list-item__info']//*[@class='button button--light']//*[text()='customize']/parent::*"))).click(); //select Miracle system and click customize

        driver.findElements(By.xpath("//*[@class='pdp-miracle-colour__list pdp-miracle-row__list']//*[@class='pdp-miracle-colour__img pdp-miracle-row__img']")); // select Base colours


        // 3. Close the browser
        driver.close();
    }
}






