package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    WebDriver driver;


    @Given("^user is on inventory page$")
    public void user_is_on_inventory_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @When("^Click on Sauce Labs Backpack Add to Cart$")
    public void click_on_Sauce_Labs_Backpack_Add_to_Cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

}
