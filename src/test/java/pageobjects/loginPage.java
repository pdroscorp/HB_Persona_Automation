package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class loginPage extends util {

    public static int RUC;
    public static String tipoDoc;
    public static String numeroDoc;
    public static boolean bRecordar;
    public static String password;

    public loginPage() { PageFactory.initElements(driver, this);    }
    //https://master.d15fkv0y8p708c.amplifyapp.com/auth

    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[1]/div/input") private WebElement txtRUC;
    //input[@type='text']"
    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[2]/div/ng-select/div/div/div[3]/input") private WebElement cboDoc;
    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[2]/div/input") private WebElement txtNroDoc;
    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[4]/div/input") private WebElement txtPassword;
    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-authentication/app-auth/div/div[2]/div/form/div[7]/button") private WebElement btnIngresar;


    public void escribirRUC(String nroRUC)
    {
        txtRUC.sendKeys(nroRUC);
    }

    public void seleccionarTipoDoc(String tipoDoc)
    {
        new Select(cboDoc).selectByVisibleText(tipoDoc);
    }
    public void escribirDoc(String nroDoc)
    {
        txtNroDoc.sendKeys(nroDoc);
    }
    public void escribirPassword(String Pass)
    {
        txtPassword.sendKeys(Pass);
    }
    public void clicBotonIngresar()
    {
        btnIngresar.click();
    }
}
