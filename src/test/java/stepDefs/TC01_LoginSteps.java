package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.TC01_Login;

public class TC01_LoginSteps {
TC01_Login login=new TC01_Login();

    @When("user login with valid {string} and {string}")
    public void user_Login_with_valid(String user,String password) {
login.email().sendKeys(user);
login.password().sendKeys(password);
    }
    @And("Press on Login button")
    public void Press_on_Login_button() {
        login.loginButton().click();
    }
    @Then("User go to product page")
    public void User_go_to_product_page() {
        SoftAssert softAssert=new SoftAssert();
       String product_page="https://www.saucedemo.com/inventory.html";
        softAssert.assertEquals(product_page,login.product_page());
    }





    @When("user login with Invalid {string} and {string}")
    public void user_ogin_with_Invalid(String user,String password) {
        login.email().sendKeys(user);
        login.password().sendKeys(password);
    }
    @Then("User can not go to product page")
    public void User_can_not_go_to_product_page() {
        SoftAssert softAssert=new SoftAssert();
        String Actual=login.WrongMessage().getText();
        String Expected="Epic sadface: Username and password do not match any user in this service";
        softAssert.assertEquals(Actual,Expected);
    }
}
