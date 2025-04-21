package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_1Page {

    WebDriver driver;

    private By strategyPageLocator = By.id("strategyPage");
    private By executeButtonLocator = By.id("executeButton");
    private By successMessageLocator = By.id("successMessage");

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openStrategyPage() {
        driver.get("http://example.com/strategy");
    }

    public void executeStrategy() {
        WebElement executeButton = driver.findElement(executeButtonLocator);
        executeButton.click();
    }

    public boolean isStrategyExecutedSuccessfully() {
        WebElement successMessage = driver.findElement(successMessageLocator);
        return successMessage.isDisplayed();
    }
}