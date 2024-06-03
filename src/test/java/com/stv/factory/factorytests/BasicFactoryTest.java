package com.stv.factory.factorytests;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

//import static com.stv.framework.core.lib.ParaBankPageURLs.SERVICE_URL;
import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;

public class BasicFactoryTest {
    public static WebDriver getDriver() {
        return MyDriver.getDriver();
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
//    @BeforeClass(description = "Open service page")
//    public void openService() {
//        WebDriver driver = getDriver();
//        driver.get(SERVICE_URL);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();
//    }
    @AfterClass
    public void afterClass() throws Exception {
      //  getDriver().quit();
    }
}
