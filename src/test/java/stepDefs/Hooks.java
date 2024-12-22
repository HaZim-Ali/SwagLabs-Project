package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class Hooks {

     public static WebDriver driver;

    // Getter for WebDriver (so it can be accessed in step definitions)
    public static WebDriver getDriver() {
        return driver; // Access the driver here
    }

    // Before hook to initialize the WebDriver based on the chosen browser
    @Before
    public void openBrowser() {
        String browserName = "chrome";  // This could be parameterized
        if (browserName.contains("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.contains("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();  // Default to Chrome
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void quit() throws InterruptedException {
        Thread.sleep(3000);  // Just a small wait before quitting
        if (driver != null) {
            driver.quit();  // Quit the driver after the test
        }
    }

}
