package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.factory.factorytests.MainFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.time.Duration;

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

    @When("^I click on the Admin Page$")
    public void clickOnTheAdminPage() {
        mainFactoryTest.openAdminPage();
    }

    @When("I click on the Services")
    public void iClickOnTheServices() {
        mainFactoryTest.clickOnServisesLinkAndFindBookstoreSOAPServices();
    }

    @And("^Find Available Bookstore SOAP services$")
    public void iSchollPage() {
        mainFactoryPage.findAvailableBookstoreSoapServices();
    }

    @Then("^Scroll to Bookstore services$")
    public void scrollBookstoreServices() {
        mainFactoryPage.scrollOnElement();
    }

    @Then("open the page with text Available Bookstore SOAP services")
    public void openThePageWithTextAvailableBookstoreSoapServices() {
        mainFactoryPage.findAvailableBookstoreSoapServices();
    }

    @Then("^Scroll to the top of the page$")
    public void iScrollToTheTopOfThePage() {
        mainFactoryTest.scrollBackToTop();
    }

    @Then("^Find the test Administration on the opened page$")
    public void iFindTheTestAdministrationOnTheOpenedPage() {
        Assert.assertTrue(mainFactoryPage.getTextAdministrations().isDisplayed());
    }
}
