package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class TC01_Login {
    WebDriver driver=Hooks.driver;
    // Locators and actions for login functionality

    public WebElement email() {
        return driver.findElement(By.xpath("//input[@id='user-name']"));
    }

    public WebElement password() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.xpath("//input[@id='login-button']"));
    }

    public WebElement WrongMessage() {
        return driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));
    }

    public String product_page() {
        return driver.getCurrentUrl();
    }

}
