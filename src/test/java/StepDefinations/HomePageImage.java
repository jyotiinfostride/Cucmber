package StepDefinations;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageImage {
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


    @When("Click on Sauce Labs Backpack Image")
    public void click_on_Sauce_Labs_Backpack_Image() {
       driver.findElement(By.id("item_4_img_link")).click();
    }

    @When("Click on Sauce Labs Bike Light Image")
    public void click_on_Sauce_Labs_Bike_Light_Image() {
       driver.findElement(By.id("item_0_img_link")).click();
    }

    @When("Click on Sauce Labs Bolt T-Shirt Image")
    public void click_on_Sauce_Labs_Bolt_T_Shirt_Image() {
        driver.findElement(By.id("item_1_img_link")).click();
    }

    @When("Click on Sauce Labs Fleece Jacket Image")
    public void click_on_Sauce_Labs_Fleece_Jacket_Image() {
        driver.findElement(By.id("item_5_img_link")).click();
    }

    @When("Click on Sauce Labs Onesie Image")
    public void click_on_Sauce_Labs_Onesie_Image() {
        driver.findElement(By.id("item_2_img_link")).click();
    }

    @When("Click on tredshirt Image")
    public void Click_on_tredshirt_Image() {
        driver.findElement(By.id("item_3_img_link")).click();
    }
}
