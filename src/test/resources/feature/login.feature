@TodaLaPrueba
Feature:  Login en Home Banking Juridico
  Como usuario necesito poder loguearme con mi credenciales al HB Juridico

  @FlujoExitoso
  Scenario: Login exitoso

    Given Ingresando a la pagina web de HomeBanking Natural
    And Selecciono tipo de documento "DNI"
    And Escribo numero de documento "46686856"
    And Escribo contraseña correcta "abc123"
    And Hago Click ingresar plataforma

  @ConsultaCuentas

  Scenario: Ingreso a Consultas

    Given Ingresando a la barra de navegación de Consultas2
    And Activo Desactivo mostrar saldo