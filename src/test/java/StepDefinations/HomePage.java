package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Then("Click on Sauce Labs Backpack Add to Cart")
    public void click_on_Sauce_Labs_Backpack_Add_to_Cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    @Then("Click on Sauce Labs Bike Light")
    public void Click_on_Sauce_Labs_Bike_Light(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }
}
