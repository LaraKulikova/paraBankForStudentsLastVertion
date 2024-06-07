package com.stv.framework.core.runner;
import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(features = "src/test/java/com/stv/bdd/features/MyTestFinallyFeature.feature",
glue = "com.stv.bdd.steps")
public class BddRunner extends AbstractTestNGCucumberTests {
@AfterClass
    public void tearDown() throws Exception{
    getDriver().quit();
}
}
