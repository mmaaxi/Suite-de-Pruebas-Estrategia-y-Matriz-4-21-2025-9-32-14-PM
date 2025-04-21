package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_2Page;
import static org.junit.Assert.assertTrue;

public class tc_2Steps {
    private WebDriver driver;
    private tc_2Page matrixPage;

    public tc_2Steps() {
        this.driver = Hooks.getDriver();
        this.matrixPage = new tc_2Page(driver);
    }

    @Given("el usuario está en la página de matriz")
    public void el_usuario_está_en_la_página_de_matriz() {
        driver.get("https://example.com/matrix");
    }

    @When("el usuario verifica los datos en la matriz")
    public void el_usuario_verifica_los_datos_en_la_matriz() {
        matrixPage.checkMatrixData();
    }

    @Then("los datos en la matriz son correctos")
    public void los_datos_en_la_matriz_son_correctos() {
        assertTrue(matrixPage.isMatrixDataCorrect());
    }
}