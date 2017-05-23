package steps;

import base.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        String path = System.getProperty("user.dir")+"//src//main//resources//chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void CloseBrowserTest(){
        driver.close();
    }
}
