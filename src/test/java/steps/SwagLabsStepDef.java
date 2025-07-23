package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.SwagLabsHomePage;
import base.BasePage;
import io.cucumber.java.en.Given;
import po.SwagLabsLogInPage;

/**
 * Created by JP on 5/22/17.
 */
public class SwagLabsStepDef extends BasePage{

    private BasePage base;

    protected SwagLabsHomePage swagLabsHomePage;
    protected SwagLabsLogInPage swagLabsLogInPage;

    public SwagLabsStepDef(BasePage base){
        this.base = base;
        swagLabsHomePage = new SwagLabsHomePage(driver);
        //swagLabsLogInPage = new SwagLabsLogInPage(driver);

    }

    @Given("^I am on swag labs website$")
    public void iAmOnSwagLabsWebsite() throws Throwable {
        swagLabsHomePage.openSwagLabsHomePage();
    }


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iCanEnterEmailAndPassword( String arg1, String arg2) throws Throwable {
        swagLabsHomePage.enterEmailOnLogInPage(arg1);
        swagLabsHomePage.enterPasswordOnLogInPage(arg2);
    }

    @Then("I get an error message")
    public void iGetAnErrorMessage() {

    }

    @Then("I am logged on the page")
    public void iAmLoggedOnThePage() {
    }

    @And("I click on the Login button")
    public void iClickOnTheLoginButton() {
    }
}
