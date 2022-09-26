package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static ThreadLocal<String> browser = new ThreadLocal<>();

    public static WebDriver getDriver() {
       //log da surekli cikan yazilar icin
        Logger.getLogger("").setLevel(Level.SEVERE);//log da temizlik
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");



        if (driver.get() == null) {
            switch (browser.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver.set(new SafariDriver());
                    break;
                case "":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
            }
        }

        return driver.get();
    }
    public static void quitdriver(){
        if (driver.get()!=null){
            driver.get().quit();
            driver.set(null);
        }
    }

}
