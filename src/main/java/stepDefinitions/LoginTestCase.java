package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
public class LoginTestCase {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Before
    public void setup() {
        String path = "/Users/akankshasingh/Downloads/chromedriver_mac_arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }
    @Given("^user visits website$")
    public void user_is_already_on_Login_Page() throws Throwable {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        driver.get("https://app.vwo.com/#/login");
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterUsername(arg1);
        loginPage.enterPassword(arg2);
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        loginPage.clickLogin();
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        Thread.sleep(10000);
        homePage.getWelcomeTest();
    }

    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }


}
