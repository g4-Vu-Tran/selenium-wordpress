package wordpress.com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import wordpress.com.pageObjects.HomePage;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vu on 7/23/2016.
 */
public class demo {
    private static WebDriver driver = null;

    @Test
    public void TC1() {

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        driver.get("https://wordpress.com");

        // Use page Object library now

        HomePage.lnkLogIn(driver).click();


        driver.quit();

    }
}
