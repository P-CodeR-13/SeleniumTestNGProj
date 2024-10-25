package pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String homeUrl = "https://demoqa.com/";
    public static String elementsMenu = "//h5[normalize-space()='Elements']";


    public static void goToElementsMenu() {
        driver.findElement(By.xpath(elementsMenu)).click();
    }
}
