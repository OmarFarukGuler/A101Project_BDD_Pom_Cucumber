package _03_Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {


    public static void ClickParent(WebElement element) {
        elementToBeVisibilityWait(element);
        elementToBeClickableWait(element);
        if (!element.isDisplayed()){ ScrolToElement(element);}
        element.click();

    }
    public static void MoveToElementParent(WebElement element) {
        elementToBeVisibilityWait(element);
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(element).build();
        action.perform();


    }
    public static void MoveAndClickToElementParent(WebElement element) {
        elementToBeVisibilityWait(element);
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(element).click(element).build();
        action.perform();

    }
    public static void SendKeysParent(WebElement element,String text){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
        ScrolToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void VerifyToElementParent(WebElement element,String text){
        elementToBeVisibilityWait(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public static void ScrolToElement(WebElement element){

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", element);
    }
    public static void elementToBeVisibilityWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));



    }
    public static void elementToBeClickableWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));


    }

    public static void selectToElementOnTheParent(WebElement element,int optionIntValue,String propertyName,String childCount){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        elementToBeVisibilityWait(element);
        wait.until(ExpectedConditions.domPropertyToBe(element,propertyName,childCount));
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, element.isSelected()));
        Select select=new Select(element);
        select.selectByIndex(optionIntValue);

    }

}
