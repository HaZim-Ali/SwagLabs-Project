package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class TC03_Card {
    WebDriver driver= Hooks.driver;

    public WebElement CardIcon() {
        return driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    }
    // Find all 'Remove from Cart' buttons using findElements
    public List<WebElement> removeFromCartButtons() {
        return driver.findElements(By.xpath("//button[contains(@class, 'cart_button')]"));
    }

    public WebElement CheckoutIcon() {
        return driver.findElement(By.xpath("//button[@id='checkout']"));
}

}

