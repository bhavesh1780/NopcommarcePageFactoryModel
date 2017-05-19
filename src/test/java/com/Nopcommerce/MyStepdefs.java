package com.Nopcommerce;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends BasePage {

    HomePage homepage = new HomePage();

    RegistrationPage registraionpage = new RegistrationPage();


    //Registration registration = new Registration();

    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws Throwable {
        driver.get("http://demo.nopcommerce.com/");

    }

    @Then("^User should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully()  {
        Assert.assertEquals("Your registration completed", Utils.getTextFromElement(By.className("result")) );
        Assert.assertTrue(Utils.getTextFromElement(By.linkText("Log out")).contains("Log out"),  "User is not Login Successfully");
    }

    @When("^User enters all valid detaild for registration$")
    public void userEntersAllValidDetaildForRegistration() {
        homepage.clickOnRegisterButton();
        registraionpage.registerNewUSer();
        //registration.register();
    }



}
