package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class TC02_Product {
    WebDriver driver= Hooks.driver;
    // Find all 'Add to Cart' buttons using findElements
    public List<WebElement> addToCartButtons() {
        return driver.findElements(By.xpath("//button[contains(@class,'btn_inventory')]"));
}

}
