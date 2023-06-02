@TodaLaPrueba
Feature:  Login en Home Banking Juridico
  Como usuario necesito poder loguearme con mi credenciales al HB Juridico

  @FlujoExitoso
  Scenario: Login exitoso

    Given Ingresando a la pagina web de HomeBanking Juridico
    When Escribo numero de ruc "20502110374"
    And Selecciono tipo de documento "CE"
    And Escribo numero de documento "46686856"
    And Escribo contraseña correcta "abc123"
    #And Hago Click ingresar plataforma