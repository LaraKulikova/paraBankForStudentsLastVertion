package com.stv.bdd.steps;


import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.factory.factorytests.MainFactoryTest;
import com.stv.framework.core.drivers.MyDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;


import static com.stv.framework.core.lib.ParaBankPageURLs.SERVICE_URL;
import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;


public class MyFinallyTestSteps extends BasicFactoryTest {
    MainFactoryTest mainFactoryTest = new MainFactoryTest();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("^I open main page$")
    public void iOpenMainPage() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @When("I click on the Services")
    public void iClickOnTheServices() {
        //mainFactoryPage.linkServices.isDisplayed();
        mainFactoryTest.clickOnServisesLinkAndFindBookstoreSOAPServices();
        System.out.println("Step2. When I click on the Services -ready");
    }
    @Then("open the page with text Available Bookstore SOAP services")
    public void openThePageWithTextAvailableBookstoreSoapServices() {
        mainFactoryPage.findAvailableBookstoreSoapServices();
        System.out.println("Step3. Then open the page with text Available Bookstore SOAP services - ready");
    }

    @Given("^Open service page$")
    public void openServicePage() {
        WebDriver driver = getDriver();
        driver.get(SERVICE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println("Scenario 02:\nStep1. Given I open service page - ready");
    }
    @When("^Find Available Bookstore SOAP services$")
    public void iSchollPage() {
        mainFactoryPage.findAvailableBookstoreSoapServices();
        System.out.println("Step2. There is Find Available Bookstore SOAP service in the this page");
    }
    @Then("^Scroll to Bookstore services$")
    public void iFindBookstoreServices() {
        mainFactoryPage.scrollOnElement();
        System.out.println("Step3. I scroll to Bookstore services");
    }

    @Given("^Open service page again$")
    public void openServicePageAgain() {
        WebDriver driver = getDriver();
        driver.get(SERVICE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println("Scenario 03:\nStep1. Given I open service page- ready");
    }
    @When("^Find Bookstore services$")
    public void findBookstoreServices() {
        mainFactoryTest.scrollOnElement();
        System.out.println("Step2. I scroll to Bookstore services");
    }

    @Then("^Scroll to the top of the page$")
    public void iScrollToTheTopOfThePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), Duration.ofSeconds(10));
        mainFactoryTest.scrollBackToTop();
        System.out.println("Step3. I scroll to Top");

    }
    @Given("^I open Main page$")
    public void isOpenMainPage() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println("Scenario 04:\nStep1. Given I open main page - ready");
    }
    @When("^I click on the Admin Page$")
    public void clickOnTheAdminPage() {
        mainFactoryTest.openAdminPage();
        System.out.println("Step2. I click on the Admin Page - ready");
    }
    @Then("^Find the test Administration on the opened page$")
   public void iFindTheTestAdministrationOnTheOpenedPage() {
        Assert.assertTrue(mainFactoryPage.getTextAdministrations().isDisplayed());
        System.out.println("Step3. Find the test Administration on the opened page - ready");
    }
}
