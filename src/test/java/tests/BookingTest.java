package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.DriverFactory;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookingTest {

    @Test
    public void bookingFlowTest() throws IOException {
        WebDriver driver = DriverFactory.createDriver();

        try {
            driver.get("https://www.blazedemo.com/");

            HomePage homePage = new HomePage(driver);
            homePage.selectFromCity("Paris");
            homePage.selectToCity("Rome");
            homePage.clickFindFlights();

            FlightsPage flightsPage = new FlightsPage(driver);
            flightsPage.chooseFirstFlight();

            PurchasePage purchasePage = new PurchasePage(driver);
            purchasePage.fillForm();
            purchasePage.submitPurchase();

            ConfirmationPage confirmationPage =
                    new ConfirmationPage(driver);

            assertTrue(
                confirmationPage.getConfirmationText()
                        .contains("Thank you for your purchase")
            );

            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(
                src,
                new File("screenshots/booking_confirmation.png")
            );

        } finally {
            driver.quit();
        }
    }
}
