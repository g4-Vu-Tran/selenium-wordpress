package wordpress.com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vu on 7/23/2016.
 */
public class HomePage {
    private static WebElement element = null;

    public static WebElement lnkLogIn(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@id='masterbar']//li/a[.='Sign In']"));
        return element;
    }
}
