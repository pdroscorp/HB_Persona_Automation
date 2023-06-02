package support;

import definitions.hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Hashtable;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class util extends hooks {

    public static WebDriverWait wait;

    public util() {
        if (driver == null) { setUp();}
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
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
    public String tecladoVirtualChar(char Tecla){

        Hashtable <Character, String> hashTeclado=new Hashtable();
        hashTeclado.put('q', ".letters:nth-child(2) > .letter:nth-child(1)");
        hashTeclado.put('w', ".letters:nth-child(2) > .letter:nth-child(2)");
        hashTeclado.put('e', ".letters:nth-child(2) > .letter:nth-child(3)");
        hashTeclado.put('r', ".letters:nth-child(2) > .letter:nth-child(4)");
        hashTeclado.put('t', ".letters:nth-child(2) > .letter:nth-child(5)");
        hashTeclado.put('y', ".letters:nth-child(2) > .letter:nth-child(6)");
        hashTeclado.put('u', ".letters:nth-child(2) > .letter:nth-child(7)");
        hashTeclado.put('i', ".letters:nth-child(2) > .letter:nth-child(8)");
        hashTeclado.put('o', ".letters:nth-child(2) > .letter:nth-child(9)");
        hashTeclado.put('p', ".letter:nth-child(10)");//
        hashTeclado.put('a', ".letters2 > .letter:nth-child(1)");
        hashTeclado.put('s', ".letters2 > .letter:nth-child(2)");
        hashTeclado.put('d', ".letters2 > .letter:nth-child(3)");
        hashTeclado.put('f', ".letters2 > .letter:nth-child(4)");
        hashTeclado.put('g', ".letters2 > .letter:nth-child(5)");
        hashTeclado.put('h', ".letters2 > .letter:nth-child(6)");
        hashTeclado.put('j', ".letters2 > .letter:nth-child(7)");
        hashTeclado.put('k', ".letters2 > .letter:nth-child(8)");
        hashTeclado.put('l', ".letters2 > .letter:nth-child(9)");//
        hashTeclado.put('z', ".letters3 > .letter:nth-child(1)");
        hashTeclado.put('x', ".letters3 > .letter:nth-child(2)");
        hashTeclado.put('c', ".letters3 > .letter:nth-child(3)");
        hashTeclado.put('v', ".letters3 > .letter:nth-child(4)");
        hashTeclado.put('b', ".letters3 > .letter:nth-child(5)");
        hashTeclado.put('n', ".letters3 > .letter:nth-child(6)");
        hashTeclado.put('m', ".letters3 > .letter:nth-child(7)");

        return hashTeclado.get(Tecla).toString();
    }
    public String tecladoVirtualDigit(int Tecla){
        Hashtable <Integer, String> hashTeclado=new Hashtable();
        hashTeclado.put(1, ".number:nth-child(1)");
        hashTeclado.put(2, ".number:nth-child(2)");
        hashTeclado.put(3, ".number:nth-child(3)");
        hashTeclado.put(4, ".number:nth-child(4)");
        hashTeclado.put(5, ".number:nth-child(5)");
        hashTeclado.put(6, ".number:nth-child(6)");
        hashTeclado.put(7, ".number:nth-child(7)");
        hashTeclado.put(8, ".number:nth-child(8)");
        hashTeclado.put(9, ".number:nth-child(9)");
        hashTeclado.put(0, ".number:nth-child(10)");

        return hashTeclado.get(Tecla).toString();
    }
}
