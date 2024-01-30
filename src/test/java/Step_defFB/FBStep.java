package Step_defFB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBStep {
    WebDriver driver;
    @Given("Launch the browser")
    public void launch_the_browser() {

        WebDriverManager.chromedriver().setup();

         driver =  new ChromeDriver();

    }
    @Given("Open the application")
    public void open_the_application() {

        driver.get("https://www.facebook.com/login/");
    }

    @When("User Enters the {string} and {string}")
    public void userEntersTheAnd(String username, String password) {

        WebElement Name = driver.findElement(By.name("email"));
        Name.sendKeys(username);
        WebElement Pass = driver.findElement(By.id("pass"));
        Pass.sendKeys(password);
    }


    @Then("Click the login button")
    public void click_the_login_button() throws InterruptedException {
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        System.out.println("abc");
    }


}
