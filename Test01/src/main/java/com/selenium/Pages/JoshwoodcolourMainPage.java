package com.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoshwoodcolourMainPage extends MethodsPage {
    String SITE_URL = "https://www.joshwoodcolour.com";

    public JoshwoodcolourMainPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void findPopup() {

        click(By.xpath("//*[@ id='close-form']"));
    }

    public void closePopup() {

        click(By.xpath("//*[@ id='close-form']/parent::*/parent::*"));
    }

}
