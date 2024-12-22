package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class TC04_Checkout {
    WebDriver driver= Hooks.driver;
    // Locators and actions for login functionality

    public WebElement FirstName() {
        return driver.findElement(By.xpath("//input[@id='first-name']"));
    }

    public WebElement LastName() {
        return driver.findElement(By.xpath("//input[@id='last-name']"));
    }


    public WebElement ZipCode() {
        return driver.findElement(By.xpath("//input[@id='postal-code']"));
    }

    public WebElement ContinuButton() {
        return driver.findElement(By.xpath("//input[@id='continue']"));
    }

    public WebElement FinishButton() {
        return driver.findElement(By.xpath("//button[@id='finish']"));


}
}
