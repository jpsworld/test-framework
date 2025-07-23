package po;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtils;
import org.testng.Assert;

/**
 * Created by JP on 5/22/17.
 */
public class SwagLabsHomePage extends SeleniumUtils {

    private WebDriver driver;
    private BasePage base;

    //web elements
    By swagLabsLogo = By.xpath("//*[contains(@class, 'login_logo') and contains(text(), 'Swag Labs')]");
    By btnLogIn = By.id("login-button");
    By txtEmail = By.id("user-name");
    By txtPassword = By.id("password");

    public SwagLabsHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    //method to open swaglabs.feature web page
    public void openSwagLabsHomePage() throws Exception {
        Assert.assertTrue(navigateURL("https://www.saucedemo.com" , swagLabsLogo), "Error: Could not open page");
    }

    //method to click on LoginButton
    public void clickOnLogInButton() throws Exception{
        Assert.assertTrue(clickButton(btnLogIn), "Error: unable to click on Log In");
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
