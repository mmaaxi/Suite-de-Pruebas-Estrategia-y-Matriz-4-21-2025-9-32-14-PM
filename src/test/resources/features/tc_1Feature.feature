Feature: Validación de Estrategia

  Scenario: Ejecutar la estrategia definida
    Given el usuario está en la página de estrategia
    When el usuario ejecuta la estrategia definida
    Then la estrategia se ejecuta correctamente