package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

/**
 * Created by JP on 5/22/17.
 */
public class SeleniumUtils {

    private WebDriver driver;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyDisplayed(By element){
        try {
            TimeUnit.MILLISECONDS.sleep(30);
            if (driver.findElement(element).isDisplayed()) {
                return true;
            }
        }catch(Exception ne){
            return false;
        }
        return false;
    }

    public boolean waitUntilElementDisplayed(By element){
        int counter = 0;
        do {
            if (verifyDisplayed(element)){
                return true;
            }
            counter++;
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(Exception e){
                return false;
            }
        } while (counter < 10);

        return false;
    }

    public boolean navigateURL(String url, By element){
        try {
            driver.get(url);
            if(waitUntilElementDisplayed(element)){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return false;
    }

    public boolean clickButton(By element){
        try{
            if(waitUntilElementDisplayed(element)){
                driver.findElement(element).click();
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean addStringToTextBox(String strText, By element){
        try {
            if (waitUntilElementDisplayed(element)) {

                driver.findElement(element).clear();
                driver.findElement(element).sendKeys(strText);
                driver.findElement(element).sendKeys(Keys.TAB);

                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
