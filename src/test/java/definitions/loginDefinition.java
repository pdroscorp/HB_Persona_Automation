package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pageobjects.*;

import java.io.IOException;

public class loginDefinition {
    loginPage login;

    public loginDefinition(){
        login = new loginPage();

    }

    @Given("Ingresando a la pagina web de HomeBanking Natural")
    public void validoQueMiAplicacionEsteOperativa() throws IOException {
        //hooks.driver.get("https://zonasegura.cajaica.pe/personasOwasp/auth");
        hooks.driver.get("http://localhost:2555/auth");
        login.aceptarUbicacion();
        //evidencia();
    }

    @And("Selecciono tipo de documento {string}")
    public void seleccionoTipoDocumento(String tipoDoc) throws IOException, InterruptedException {
        login.seleccionarTipoDoc(tipoDoc);
        //evidencia();
    }
    @And("Escribo numero de documento {string}")
    public void escriboNumeroDocumento(String numeroDoc) throws IOException {
        login.escribirDoc(numeroDoc);
        // evidencia();
    }
    @And("Escribo contraseña correcta {string}")
    public void escriboContrasena(String txtPassword) throws IOException {
        login.escribirPassword(txtPassword);
        // evidencia();
    }
    @And("Hago Click ingresar plataforma")
    public void hagoClickEnIngresarPlataforma() throws IOException {
        login.clickBotonIngresar();
        // evidencia();
    }



}
