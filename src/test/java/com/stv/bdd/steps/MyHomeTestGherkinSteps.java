package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;



public class MyHomeTestGherkinSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    WebDriver driver = getDriver();
    @Given("the user has opened the login page")
    public void theUserHasOpenedTheLoginPage() {
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println("the user has opened the login page- ready");

    }

    @When("the user does not enter data in the username and password fields")
    public void theUserDoesNotEnterDataInTheUsernameAndPasswordFields() {
        String username = "";
        String password = "";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);

    }

    @And("presses the Login button")
    public void pressesTheLoginButton() {
        mainFactoryPage.clickOnLoginButton();

    }

    @Then("the user receives the error message")
    public void theUserReceivesTheErrorMessage() {
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(),
                "Error! Please enter a username and password.");
    }


    @When("the user enter wrong in the {string}")
    public void theUserEnterWrongInThe(String username){
        mainFactoryPage.enterUsername(username);

    }

    @And("{string} fields")
    public void fields(String password){
    mainFactoryPage.enterPassword(password);
    mainFactoryPage.clickOnLoginButton();

    }

    @Then("the result should be Error")
    public void theResultShouldBeError() {
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(),
                "Error! Please enter a username and password.");
    }
}
