package com.selenium.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public JoshwoodcolourMainPage main;
    public AllProducts allProducts;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.joshwoodcolour.com");
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void findPopup() {
        PopupPage popup = new PopupPage(driver);
        PopupPage displaying = popup.displaying("");
    }

}
//        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//                main=PageFactory.initElements(driver,JoshwoodcolourMainPage.class);
//        allProducts=PageFactory.initElements(driver,AllProducts.class);
//
//        }
