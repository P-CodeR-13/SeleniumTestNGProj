package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String home_url = "https://demoqa.com/";
    public static String elements_menu = "//h5[normalize-space()='Elements']";


    public static void goToElementsMenu() {
        driver.findElement(By.xpath(elements_menu)).click();
    }
}
