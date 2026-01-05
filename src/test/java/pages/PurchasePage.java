package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

    private WebDriver driver;

    private By name = By.id("inputName");
    private By address = By.id("address");
    private By city = By.id("city");
    private By state = By.id("state");
    private By zip = By.id("zipCode");
    private By cardType = By.id("cardType");
    private By cardNumber = By.id("creditCardNumber");
    private By cardMonth = By.id("creditCardMonth");
    private By cardYear = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By purchaseButton = By.cssSelector("input[type='submit']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm() {
        driver.findElement(name).sendKeys("Test User");
        driver.findElement(address).sendKeys("Test Address 123");
        driver.findElement(city).sendKeys("Astana");
        driver.findElement(state).sendKeys("Test State");
        driver.findElement(zip).sendKeys("010000");

        new Select(driver.findElement(cardType))
                .selectByVisibleText("Visa");

        driver.findElement(cardNumber)
                .sendKeys("4111111111111111");

        driver.findElement(cardMonth).clear();
        driver.findElement(cardMonth).sendKeys("12");

        driver.findElement(cardYear).clear();
        driver.findElement(cardYear).sendKeys("2030");

        driver.findElement(nameOnCard)
                .sendKeys("TEST USER");
    }

    public void submitPurchase() {
        driver.findElement(purchaseButton).click();
    }
}
