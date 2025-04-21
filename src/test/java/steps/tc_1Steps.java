package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_1Page;
import static org.junit.Assert.assertTrue;

public class tc_1Steps {

    tc_1Page strategyPage = new tc_1Page();

    @Given("el usuario está en la página de estrategia")
    public void el_usuario_esta_en_la_pagina_de_estrategia() {
        strategyPage.openStrategyPage();
    }

    @When("el usuario ejecuta la estrategia definida")
    public void el_usuario_ejecuta_la_estrategia_definida() {
        strategyPage.executeStrategy();
    }

    @Then("la estrategia se ejecuta correctamente")
    public void la_estrategia_se_ejecuta_correctamente() {
        assertTrue(strategyPage.isStrategyExecutedSuccessfully());
    }
}