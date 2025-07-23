package steps;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by JP on 5/22/17.
 */
public class Hook extends BasePage {

    private BasePage base;

    public Hook(BasePage base){
        this.base = base;
    }
    @Before
    public void InitializeTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void CloseBrowserTest(){
        driver.close();
    }
}
