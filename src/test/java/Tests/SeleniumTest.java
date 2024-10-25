package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    public static void Setup(){
        driver = new ChromeDriver();
        driver.get(HomePage.home_url);
        driver.manage().window().maximize();
    }

    @Test
    void testSteps(){
        HomePage.goToElementsMenu();
    }
    @AfterTest
    void exit(){
        driver.close();
    }
}
