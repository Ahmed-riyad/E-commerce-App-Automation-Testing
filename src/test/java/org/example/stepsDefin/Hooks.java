package org.example.stepsDefin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }


    @After
    public static void closeBrowser() throws InterruptedException
    {
        Thread.sleep(3500);
        driver.quit();

    }

}
