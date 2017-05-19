package com.Nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage
{
    @FindBy(className = "ico-register")
    private WebElement _registerbtn;

    @FindBy(id= "gender-female")
    private WebElement _female;

    @FindBy(name="FirstName")
    private WebElement _firstName;

    @FindBy(name = "LastName")
    private WebElement _lastName;

    @FindBy(id="Email")
    private WebElement _email;

    @FindBy(name = "Company")
    private WebElement _companyName;

    @FindBy(id="Password")
    private WebElement _password;

    @FindBy(id="ConfirmPassword")
    private WebElement _confirmPassword;

    @FindBy(id="register-button")
    private WebElement _register;

    @FindBy(className = "result")
    private WebElement _asserResult;

    @FindBy(name = "register-continue")
    private WebElement _continueto;



    public void register()
    {
        Utils.clickable(_registerbtn);// click on Registration button
        Utils.clickable(_female); //selects gender
        Utils.enterText(_firstName, "Nikita"); // type name
        Utils.enterText(_lastName, "Patel");
        Utils.enterText(_email, "testing" + Utils.randomDate()+ "@gmail.com");
        Utils.enterText(_companyName, "ST");
        Utils.enterText(_password, "123456");
        Utils.enterText(_confirmPassword, "123456");
        Utils.clickable(_register); //click on Register button.
    }

}
