package steps;

import PO.PayPalHomePage;
import PO.PayPalLogInPage;
import base.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by JP on 5/22/17.
 */
public class PaypalStepDef extends BasePage{

    private BasePage base;

    protected PayPalHomePage payPalHomePage;
    protected PayPalLogInPage payPalLogInPage;

    public PaypalStepDef(BasePage base){
        this.base = base;
        payPalHomePage = new PayPalHomePage(driver);
        payPalLogInPage = new PayPalLogInPage(driver);

    }

    @Given("^I am on PayPal website$")
    public void iAmOnPayPalWebsite() throws Throwable {
        payPalHomePage.openPayPalHomePage();
    }

    @When("^I click on Log In$")
    public void iClickOnLogIn() throws Throwable {
        payPalHomePage.clickOnLogInButton();
        payPalLogInPage.validateLandedOnLogInPage();
    }


    @Then("^I can enter ([^\"]*) and ([^\"]*)$")
    public void iCanEnterEmailAndPassword( String arg1, String arg2) throws Throwable {
        payPalLogInPage.enterEmailOnLogInPage(arg1);
        payPalLogInPage.enterPasswordOnLogInPage(arg2);
    }

}
