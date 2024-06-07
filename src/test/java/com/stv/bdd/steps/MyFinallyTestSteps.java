package com.stv.bdd.steps;


import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.factory.factorytests.MainFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

import static com.stv.framework.core.lib.ParaBankPageURLs.SERVICE_URL;
import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;


public class MyFinallyTestSteps extends BasicFactoryTest {
    MainFactoryTest mainFactoryTest = new MainFactoryTest();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    WebDriver driver = getDriver();

    @Given("^I open main page$")

    public void iOpenMainPage() {
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @When("I click on the Services")
    public void iClickOnTheServices() {
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
    public void iScrollToTheTopOfThePage() {
        mainFactoryTest.scrollBackToTop();
        System.out.println("Step3. I scroll to Top");

    }

    @Given("^I open Main page$")
    public void isOpenMainPage() {
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
