package po;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.SeleniumUtils;

/**
 * Created by JP on 5/22/17.
 */
public class SwagLabsLogInPage extends SeleniumUtils {

    private WebDriver driver;

    //web elements
    By txtEmail = By.id("email");
    By txtPassword = By.id("password");

    public SwagLabsLogInPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}
