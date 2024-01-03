package pageobjects;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import support.util;

import java.util.concurrent.TimeUnit;


public class queryPage extends util {
    public queryPage() {
        PageFactory.initElements(driver, this);
    }

    private static String navConsultas = "//*[@id='body']/app-root/app-portal/div/app-nav/nav/ul/li[2]/a";

   // @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-portal/div/app-nav/nav/ul/li[2]/a")
    //private WebElement navConsultas;
   @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-portal/div[2]/app-querys/app-index-querys/div/perfect-scrollbar/div/div/div/div/div/td/div/ui-switch/span")
   private WebElement switchMostrarSaldo;

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-portal/div[2]/app-querys/app-index-querys/div/perfect-scrollbar/div/div/div/div/div[2]/accordion/accordion-group/div/div/div/div/div/spa")
    private WebElement groupCtaAhorroCTS;

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-portal/div[2]/app-querys/app-index-querys/div/perfect-scrollbar/div/div/div/div/div[3]/accordion/accordion-group/div/div/div/div/div/span")
    private WebElement groupCreditos;
    public void clickNavConsultas() {

        /*
        //FLUENT WAIT  // NO FUNCA :(
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class);

        WebElement nav = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return navConsultas;
            }
        });
        nav.click();
        */

        // IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        //EXPLICIT WAIT // aveces funca cada 250 ML cheka si esta visible
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(navConsultas)));
        //driver.findElement(By.xpath(navConsultas)).click();

        System.out.println("Click NAV");
        try{

        }catch(Exception e){
            System.out.println(e);
        }

    }
    public void clickMostrarSaldo() {
        switchMostrarSaldo.click();
    }
    public void desglosaAhorroCTS() {
        groupCtaAhorroCTS.click();
    }
    public void desglosaCredito() {
        groupCreditos.click();
    }
}
