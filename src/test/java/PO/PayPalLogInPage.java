package PO;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.SeleniumUtils;

/**
 * Created by JP on 5/22/17.
 */
public class PayPalLogInPage extends SeleniumUtils {

    private WebDriver driver;

    //web elements
    By txtEmail = By.id("email");
    By txtPassword = By.id("password");

    public PayPalLogInPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    //Validate landing page
    public void validateLandedOnLogInPage(){
        String logInTitlePage = driver.getTitle();
        String expectedTitlePage = "Log in to your PayPal account";

        Assert.assertEquals(logInTitlePage, expectedTitlePage);

    }

    //Enter email
    public void enterEmailOnLogInPage(String arg1) throws Exception{
        Assert.assertTrue(addStringToTextBox(arg1, txtEmail), "Error: unable to enter email");
    }

    //Enter password
    public void enterPasswordOnLogInPage(String arg1) throws Exception{
        Assert.assertTrue(addStringToTextBox(arg1, txtPassword), "Error: unable to enter password");
    }
}
