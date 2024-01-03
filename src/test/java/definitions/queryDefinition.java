package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageobjects.*;

import java.io.IOException;
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
}
