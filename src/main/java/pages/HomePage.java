package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    //Locator for login button
    By label = By.cssSelector("[data-qa='page-heading']");


    //Method to click login button
    public String getWelcomeTest() {

        return driver.findElement(label).getText();
    }
}