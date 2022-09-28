package _02_Steps;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Hooks {
    @Before
    public void Before(){
        System.out.println("Test was started successfully");
    }
    @After
    public void After(Scenario scenario) throws IOException {

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        ExcelUtility.writeToExcel("src/test/java/_06_Excels/write.xlsx",scenario.getId(),scenario.getName(),GWD.browser.get(),scenario.getStatus().toString(),date.format(formatter));




        GWD.quitdriver();

    }
}
