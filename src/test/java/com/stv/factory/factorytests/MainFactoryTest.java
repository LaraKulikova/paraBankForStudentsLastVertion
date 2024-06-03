package com.stv.factory.factorytests;


import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.framework.core.drivers.MyDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;




import static com.stv.framework.core.utils.Waiters.waitForElementVisible;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the main page is loaded and main logl is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
        Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
    }

    @Test(description = "Test error message when Username is empty and Password is entered")
    public void testErrorMessageWhenUsernameIsEmpty() {
        String username = "";
        String password = "123456";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(), "Error! Please enter a username and password.");
    }

    @Test(description = "An attempt to log in by an unregistered user!")
    public void notRegisteredUsetEnterError() {
        String username = "Larisa";
        String password = "123456";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(), "Error! The username and password could not be verified.");
    }


    @Test(description = "Follow the Services link and make sure " +
            "that on the open page there is " +
            "'Available Bookstore SOAP services:'")
    public void clickOnServisesLinkAndFindBookstoreSOAPServices() {
        waitForElementVisible(getDriver(), Duration.ofSeconds(100), mainFactoryPage.linkServices);
        mainFactoryPage.clickOnlinkServices();
        Assert.assertTrue(mainFactoryPage.findAvailableBookstoreSoapServices(), "Available Bookstore SOAP services:");

    }

    @Test(description = "Scroll the page to the " +
            "Bookstore services:")
    public void scrollOnElement() {
        mainFactoryPage.clickOnlinkServices();
        mainFactoryPage.scrollOnElement(); // Assuming this method performs the scroll action

        WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), Duration.ofSeconds(10));
        mainFactoryPage.markBookstoreServices();
        Assert.assertTrue(mainFactoryPage.isElementScrolledTo(mainFactoryPage.getTextBookstoreServices()), "Bookstore services:");
    }



    @Test(description = "Scroll the page to the " +
            "Available ParaBank SOAP services element" +
            "and turn back to the head of this page",
            dependsOnMethods = "scrollOnElement")
    public void scrollBackToTop() {

        mainFactoryPage.scrollBackToTop();
    }

    @Test(description = "Click on Admin Page \n" +
            ". Make sure that the Administration table appears.")
    public void openAdminPage() {
        mainFactoryPage.clickOnAdminPage();
        Assert.assertTrue(mainFactoryPage.getTextAdministrations().isDisplayed(), "Administrations:");
    }
}

