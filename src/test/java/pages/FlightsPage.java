package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    private WebDriver driver;

    private By chooseFlightButton =
            By.cssSelector("table tbody tr td input");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFirstFlight() {
        driver.findElement(chooseFlightButton).click();
    }
}
