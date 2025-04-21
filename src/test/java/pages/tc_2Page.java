package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class tc_2Page {
    private WebDriver driver;
    private By matrixLocator = By.id("matrix");

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void checkMatrixData() {
        // Logic to verify matrix data goes here
        // For example, check the number of rows, columns, or specific cell values
    }

    public boolean isMatrixDataCorrect() {
        // Return true if the data in the matrix is as expected
        // Perform specific asserts/validations
        return true; // Replace with actual data validation logic
    }
}