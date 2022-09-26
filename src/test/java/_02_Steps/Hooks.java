package _02_Steps;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void Before(){
        System.out.println("Test was started successfully");
    }
    @After
    public void After(){
       // GWD.quitdriver();

    }
}
