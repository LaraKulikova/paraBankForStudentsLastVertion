package com.stv.factory.factorypages;


import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class MainFactoryPage extends FactoryPage {


    @FindBy(css = "img.admin")
    private WebElement adminLogo;

    @FindBy(css = "img[alt='ParaBank']")
    private WebElement parabankLogo;

    @FindBy(xpath = "//h1[contains(text(),'Administration')]")
    private WebElement adminRightPanel;

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement filedUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='error']")
    public WebElement ErrorMessageText;

    @FindBy(xpath ="//ul[@class='leftmenu']//a[contains(@href, 'services.htm')]")
    public WebElement linkServices;

    @FindBy(xpath = "//span[contains(text(), 'Available Bookstore SOAP services:')]")
    private WebElement textAvailableBookstoreSoapServices;

    @FindBy(xpath = "//span[contains(text(),\"Bookstore services:\")]")
    private WebElement textBookstoreServices;

    @FindBy(xpath = "//a[contains(text(), 'Admin Page')]")
    private WebElement linkAdminPage;
    public WebElement getFiledUsername() {
        return filedUsername;
    }

    public void setFiledUsername(WebElement filedUsername) {
        this.filedUsername = filedUsername;
    }

    public WebElement getFieldPassword() {
        return fieldPassword;
    }

    public void setFieldPassword(WebElement fieldPassword) {
        this.fieldPassword = fieldPassword;
    }

    public WebElement getLinkServices() {
        return linkServices;
    }

    public void setLinkServices(WebElement linkServices) {
        this.linkServices = linkServices;
    }

    public WebElement getTextAvailableBookstoreSoapServices() {
        return textAvailableBookstoreSoapServices;
    }

    public void setTextAvailableBookstoreSoapServices(WebElement textAvailableBookstoreSoapServices) {
        this.textAvailableBookstoreSoapServices = textAvailableBookstoreSoapServices;
    }

    public WebElement getTextBookstoreServices() {
        return textBookstoreServices;
    }

    public void setTextBookstoreServices(WebElement textBookstoreServices) {
        this.textBookstoreServices = textBookstoreServices;
    }

    public WebElement getTextAdministrations() {
        return textAdministrations;
    }

    public void setTextAdministrations(WebElement textAdministrations) {
        this.textAdministrations = textAdministrations;
    }

    @FindBy(xpath = "//h1[contains(text(), 'Administration')]")
    private WebElement textAdministrations;

    public WebElement getAdminLogo() {
        return adminLogo;
    }

    public void clickOnAdminLogo() {
        adminLogo.click();
    }

    public boolean isMainLogoDisplayed() {
        return parabankLogo.isDisplayed();
    }

    public boolean isAdminPanelDisplayed() {
        return adminRightPanel.isDisplayed();
    }

    public void enterUsername(String username) {
        filedUsername.sendKeys(username) ;
    }

    public void enterPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }


    public boolean isErrorMessageDisplayed() {
        return ErrorMessageText.isDisplayed();
    }


    public void clickOnlinkServices() {
        linkServices.click();
    }


    public boolean findAvailableBookstoreSoapServices() {
        return textAvailableBookstoreSoapServices.isDisplayed();
    }


    public boolean markBookstoreServices() {
        return textBookstoreServices.equals("Bookstore Services");
    }



    public void scrollOnElement() {
        JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",  textBookstoreServices);

     }


    public void scrollBackToTop() {

        JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
        markBookstoreServices();
        js.executeScript("window.scrollTo(0, 0)");


    }

    public boolean isElementScrolledTo(WebElement spanAvailableBookstoreSoapServices) {
        return true;
    }

    public void clickOnAdminPage(){
        linkAdminPage.click();
    }

}
