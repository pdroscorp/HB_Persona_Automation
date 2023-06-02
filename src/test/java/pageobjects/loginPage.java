package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.util;

import java.util.Hashtable;


public class loginPage extends util {


    public loginPage() {
        PageFactory.initElements(driver, this);
    }

    //https://master.d15fkv0y8p708c.amplifyapp.com/auth

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[1]/div/input")
    private WebElement txtRUC;

    @FindBy(xpath = "//*[@id=\"body\"]/div[2]/div/div[6]/button[1]")
    private WebElement btnLocation;

    @FindBy(css = ".ng-arrow-wrapper")
    private WebElement cboDoc;

    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div")
    private WebElement cboDocDNI;

    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement cboDocCE;

    @FindBy(xpath = "//ng-dropdown-panel/div/div[2]/div[3]")
    private WebElement cboDocPASS;

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[2]/div/input")
    private WebElement txtNroDoc;

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[4]/div/input") private WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[7]/button")
    private WebElement btnIngresar;


    public void escribirRUC(String nroRUC)
    {
        btnLocation.click();
        txtRUC.sendKeys(nroRUC);
    }

    public void seleccionarTipoDoc(String tipoDoc)
    {
        cboDoc.click();
        if (tipoDoc.equals("CE")) {
            cboDocCE.click();
        }else if ((tipoDoc.equals("PASS"))) {
            cboDocPASS.click();
        }else if (tipoDoc.equals("DNI")){
            cboDocDNI.click();
        }
    }

    public void escribirDoc(String nroDoc)
    {
        txtNroDoc.sendKeys(nroDoc);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
    }
    public void escribirPassword(String Pass)
    {
        //wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.click();
/*
        //Se utilizo interfaz java script por q estaba muy tranca
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(
                "arguments[0].click();arguments[1].click();arguments[2].click();"
                , teclaA,teclaB,teclaC
        );
*/
        // TEST

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        char[] cadena = Pass.toCharArray();
        for (char ch: cadena) {
            if (Character.isDigit(ch)) {
                for (int i = 0; i < 10; i++) {
                    String num ="";
                    num=driver.findElement(By.cssSelector(tecladoVirtualDigit(i))).getText();
                    if (num.equals(String.valueOf(ch))) {
                        executor.executeScript(
                                "arguments[0].click();"
                                ,driver.findElement(By.cssSelector(tecladoVirtualDigit(i)))
                        );
                    }
                }
            }else{
                executor.executeScript(
                        "arguments[0].click();"
                        ,driver.findElement(By.cssSelector(tecladoVirtualChar(ch)))
                );
            }
        }

    }
    public void clickBotonIngresar()
    {
        btnIngresar.click();
    }
}
