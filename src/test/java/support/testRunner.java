package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "D:\\TRABAJO_CMACICA\\HB_Empresas_Automation\\src\\test\\resources\\features",
@CucumberOptions(
        features = {"classpath:features"},
        tags = "@FlujoExitoso",
        glue = "definitions"//,
        //plugin = {"html:target/cucumber-report/index.html", "json:target/cucumber-report/cucumber.json"}
)


public class testRunner {
}
