package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;

    @Given("^user is on Login Page$")
    public void user_is_on_Login_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Then("^user enters username in  username textfield$")
      public void user_enters_username_in_username_textfields(){
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      }
      @Then("^user enters password in password textfield$")
        public void user_enters_password_in_password_textfields(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
     }

    //  @Then("^user is on HomePage$")
    // public void user_is_on_Home_Page(){
    //    Assert.assertEquals("Swag Labs",driver.getTitle());
    //  }
    // @When("user enter {String} and {String}")
    //public void User_enter_username_and_password(String uname, String pass){
    //    driver.findElement(By.id("user-name")).sendKeys("uname");
    //   driver.findElement(By.id("password")).sendKeys("pass");

    //  }
    //@When("^enters the username and enters the password$")
    //  public void enters_the_username_and_enters_the_password(io.cucumber.datatable.DataTable dataTable){
    //   List<List<String>> data=dataTable.asList(String.class);
    //   driver.findElement(By.id("username")).sendKeys("data.get(1).get(0)");
    //   driver.findElement(By.id("password")).sendKeys(data.get(1).get(1));
    //  }
//    @Then("^click on the login button$")
//    public void click_on_the_login_button(){
//        driver.findElement(By.id("login-button"))
//    }

    @When("enters the username {string} and enter the password {string}")
    public void enters_the_username_and_enter_the_password(String uname, String pass) {
        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    @When("click on the Login button")
    public void click_on_the_Login_button() {
        driver.findElement(By.id("login-button")).click();
    }
   // @Then("Click on menu and then click on logout button")
   // public void click_on_menu_and_then_click_on_logout_button(){
    //   driver.findElement(By.id("react-burger-menu-btn")).click();
      // driver.findElement(By.id("logout_sidebar_link")).click();
  //  }
    @Then("Click on Sauce Labs Backpack Add to Cart")
    public void click_on_Sauce_Labs_Backpack_Add_to_Cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("Click on Sauce Labs Bike Light Add to Cart")
    public void click_on_Sauce_Labs_Bike_Light_Add_to_Cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }
}
