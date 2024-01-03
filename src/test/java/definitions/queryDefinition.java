package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.*;

import java.io.IOException;


import static definitions.hooks.driver;

public class queryDefinition {
    queryPage query;

    public queryDefinition () {
        query = new queryPage();
    }
    @Given("Ingresando a la barra de navegación de Consultas")
    public void ingresoNavBarConsultas() throws IOException {
        query.clickNavConsultas();
        //evidencia();
    }
    @Given("Ingresando a la barra de navegación de Consultas2")
    public void ingresoNavBarConsultas2() throws IOException {
        //hooks.driver.get("https://zonasegura.cajaica.pe/personasOwasp/auth");
        hooks.tearSleep();
        hooks.driver.get("http://localhost:2555/portal/querys");
        //evidencia();
    }
    @And("Activo Desactivo mostrar saldo")
    public void ActivoDesactivoMostrarSaldo () throws IOException {
        query.clickMostrarSaldo();
        //evidencia();
    }
    @And("Desgloso cuentas de Ahorro y CTS")
    public void DesglosoAhorroCTS () throws IOException {
        query.desglosaAhorroCTS();
        //evidencia();
    }
    @And("Desgloso cuentas de creditos")
    public void DesglosoCreditos () throws IOException {
        query.desglosaCredito();
        //evidencia();
    }
}
