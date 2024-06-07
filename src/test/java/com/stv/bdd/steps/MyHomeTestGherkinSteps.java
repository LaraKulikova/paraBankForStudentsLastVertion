package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyHomeTestGherkinSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("the user does not enter data in the username and password fields")
    public void theUserDoesNotEnterDataInTheUsernameAndPasswordFields() {
        String username = "";
        String password = "";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.enterUsername(username);
        mainFactoryPage.enterPassword(password);
    }

    @When("the user enter wrong in the {string}")
    public void theUserEnterWrongInThe(String username) {
        mainFactoryPage.enterUsername(username);
    }

    @And("presses the Login button")
    public void pressesTheLoginButton() {
        mainFactoryPage.clickOnLoginButton();
    }

    @And("{string} fields")
    public void fields(String password) {
        mainFactoryPage.enterPassword(password);
        mainFactoryPage.clickOnLoginButton();
    }

    @Then("the user receives the error message")
    public void theUserReceivesTheErrorMessage() {
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(),
                "Error! Please enter a username and password.");
    }

    @Then("the result should be Error")
    public void theResultShouldBeError() {
        Assert.assertTrue(mainFactoryPage.isErrorMessageDisplayed(),
                "Error! Please enter a username and password.");
    }
}
