package _02_Steps;

import Utilities.EGD;
import Utilities.GWD;
import _03_Pages._01_A101_Pom;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_A101_Steps {
    _01_A101_Pom pom=new _01_A101_Pom();
    @Given("User navigate to A{int} home page")
    public void userNavigateToAHomePage(int arg0) {
       GWD.getDriver().get("https://www.a101.com.tr/");
       GWD.getDriver().manage().window().maximize();
       GWD.getDriver().manage().deleteAllCookies();
    }

    @And("Click to element on the Pom")
    public void clickToElementOnThePom(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.ClickPom(listElements.get(i));
        }
    }

    @When("Move to element on the Pom")
    public void moveToElementOnThePom(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.MoveToElementPom(listElements.get(i));
        }
    }

    @And("Move and click to element on the Pom")
    public void moveAndClickToElementOnThePom(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.MoveAndClickToElementPom(listElements.get(i));
        }
    }

    @Then("Verify to element on the Pom")
    public void verifyToElementOnThePom(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
        pom.VerifyToElementPom(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }

    @And("Send keys on the Pom")
    public void sendKeysOnThePom(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.SendKeysToElementPom(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }

    @And("Select to element on the Pom")
    public void selectToElementOnThePom(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i = 0; i < listElements.size(); i++) {
            pom.selectToElementOnThePom(listElements.get(i).get(0),listElements.get(i).get(1),
                    listElements.get(i).get(2),listElements.get(i).get(3));
        }
    }
}
