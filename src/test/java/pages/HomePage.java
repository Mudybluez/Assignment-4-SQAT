package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;

    private By fromPort = By.name("fromPort");
    private By toPort = By.name("toPort");
    private By findFlightsButton = By.cssSelector("input[type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromCity(String city) {
        new Select(driver.findElement(fromPort))
                .selectByVisibleText(city);
    }

    public void selectToCity(String city) {
        new Select(driver.findElement(toPort))
                .selectByVisibleText(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsButton).click();
    }
}
