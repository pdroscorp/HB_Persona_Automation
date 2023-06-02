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

    @Given("Ingresando a la pagina web de HomeBanking Juridico")
    public void validoQueMiAplicacionEsteOperativa() throws IOException {
        hooks.driver.get("https://master.d15fkv0y8p708c.amplifyapp.com/auth");
        //evidencia();
    }

    @When("Escribo numero de ruc {string}")
    public void escriboNumeroRuc(String numeroRUc) throws IOException {
        login.escribirRUC(numeroRUc);
        // evidencia();
    }
    @And("Selecciono tipo de documento {string}")
    public void seleccionoTipoDocumento(String tipoDoc) throws IOException, InterruptedException {
        login.seleccionarTipoDoc(tipoDoc);
        //Thread.sleep(3000);
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
