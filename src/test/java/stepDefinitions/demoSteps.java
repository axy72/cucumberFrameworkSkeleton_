package stepDefinitions;

import config.configProperties;
import factoryRepository.demoPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demoSteps {

    WebDriver driver=null;
    demoPage login;

    @Given("open chrome browser")
    public void open_chrome_browser() {

        //System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chrome/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ configProperties.CHDriverPath);
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }

    @Given("open url {string}")
    public void open_url(String string) {
        driver.get(string);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        login = new demoPage(driver);
        login.enterUsername(string);
        login.enterPassword(string2);
    }

    @And("click on log in button")
    public void click_on_log_in_button() {
        login.clickOnLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println(driver.getTitle());
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
