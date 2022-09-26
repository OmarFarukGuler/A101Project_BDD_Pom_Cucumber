package _04_Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/java/_01_Features/_01_A101.feature"},
         glue = {"_02_Steps"}
)
public class _01_A101_runner extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void Before(String browser){

        GWD.browser.set(browser);
    }


}
