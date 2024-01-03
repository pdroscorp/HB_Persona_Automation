package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class queryPage extends util {
    public queryPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"body\"]/app-root/app-portal/div/app-nav/nav/ul/li[2]/a")
    private WebElement navConsultas;

    public void clickNavConsultas()
    {
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30000));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body\"]/app-root/app-portal/div/app-nav/nav/ul/li[2]/a")));
            navConsultas.click();
            System.out.println("TRY CONSULTAS");
        }catch(Exception e){
            //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); // IMPLICIT WAIT
            //https://www.youtube.com/watch?v=2BowYbXpHb0
            navConsultas.click();
            System.out.println("CATCH CONSULTAS");
        }
    }
}
