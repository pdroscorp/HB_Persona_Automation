package support;

import definitions.hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;


public class util extends hooks {

    public static WebDriverWait wait;

    public util() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));

    }

    public void ventanaActiva(){
        Set<String> identificadores = driver.getWindowHandles();
        for(String identificador: identificadores)
        {
            driver.switchTo().window(identificador);
        }
    }

    //Cuando hay mas de dos ventanas
    /*public void navegacionDeVentanas()
    {
        hooks.driver.close();
        ventanaActiva();
    }*/

    public void ventanaInicial(){
        driver.close(); //Cerramos la ventana de tarjeta
        //ventanaActiva();
        driver.switchTo().window("");
    }

    public void validarPopUp(){
        Alert alerta = driver.switchTo().alert();
        alerta.accept();
    }
}
