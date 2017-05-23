package PO;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtils;
import org.testng.Assert;

/**
 * Created by JP on 5/22/17.
 */
public class PayPalHomePage extends SeleniumUtils {

    private WebDriver driver;
    private BasePage base;

    //web elements
    By payPalLogo = By.xpath("//*[contains(@class, 'paypal-img-logo') and contains(text(), 'PayPal')]");
    By btnLogIn = By.id("ul-btn");

    public PayPalHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    //method to open PayPal web page
    public void openPayPalHomePage() throws Exception {
        Assert.assertTrue(navigateURL("https://www.paypal.com" , payPalLogo), "Error: Could not open page");
    }

    //method to click on LoginButton
    public void clickOnLogInButton() throws Exception{
        Assert.assertTrue(clickButton(btnLogIn), "Error: unable to click on Log In");
    }


}
