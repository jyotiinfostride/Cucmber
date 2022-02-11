package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPage {
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
    @When("Click on Sauce Labs Backpack Shopping Cart")
    public void Click_on_Sauce_Labs_Backpack_Shopping_Cart(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();
    }

    @When("Click on Sauce Labs Bike Light Shopping Cart")
    public void Click_on_Sauce_Labs_Bike_Light_Shopping_Cart(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();
    }

    @When("Click on Sauce Labs Bolt T-Shirt")
    public void Click_on_Sauce_Labs_Bolt_TShirt(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();

    }

    @When("Click on Sauce Labs Fleece Jacket")
    public void Click_on_Sauce_Labs_Fleece_Jacket(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();
    }

    @When("Click on Sauce Labs Onesie")
    public void Click_on_Sauce_Labs_Onesie(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();
    }

    @When("Click on tredshirt")
    public void Click_on_t_red_shirt(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("continue-shopping")).click();

    }
}
