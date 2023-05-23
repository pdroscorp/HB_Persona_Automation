package support;

import definitions.hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenShoot extends hooks {
    public static void evidencia() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");

        String path = "D:\\TRABAJO_CMACICA\\HB_Persona_Automation\\evidences\\";
           String nombre = formato.format(fecha) + "_screenshot.jpg";

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new File(path+nombre));


    }
}
