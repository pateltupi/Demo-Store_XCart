package com.demostore.xcart;
/*
 * Created By Trupti Patel on 2019-05-28
 */

import com.demostore.xcart.pageobjects.HomePage;
import com.demostore.xcart.pageobjects.NewSignUpPage;
import com.demostore.xcart.pageobjects.SalePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
//    Home page methods
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on sign up button$")
    public void iClickOnSignUpButton() {
        new HomePage().clickOnSignInOrSignUP();
    }

    @Then("^I should  navigate to sign up page$")
    public void iShouldNavigateToSignUpPage() {

    }
    //NewSign Up Page Methods

    @And("^I click on creat new button$")
    public void iClickOnCreatNewButton() {
        new NewSignUpPage().clickOnCreatNewAccount();
    }

    @And("^I send password\"([^\"]*)\" to password field$")
    public void iSendPasswordToPasswordField(String password) {
        new NewSignUpPage().userShouldSendTextToPassword(password);
    }

    @And("^I send text\"([^\"]*)\" to confirm password field$")
    public void iSendTextToConfirmPasswordField(String confirm) {
        new NewSignUpPage().userShouldSendTextToConfiemPassword(confirm);
    }

    @And("^I click on creat button$")
    public void iClickOnCreatButton() {
        new NewSignUpPage().userShouldClickOnCreatButton();

    }

    @Then("^I am at sign up page$")
    public void iAmAtSignUpPage() {
    }

    @And("^I send email\"([^\"]*)\" to email field$")
    public void iSendEmailToEmailField(String mail) {
        new NewSignUpPage().userShouldSendTextToEmail(mail);
    }

    @And("^I hover on hotdeals and see dropdown list$")
    public void iHoverOnHotdealsAndSeeDropdownList() {
        new SalePage().userMouseHoverOnHotDeals();

    }

    @When("^I click on sale  i see product$")
    public void iClickOnSaleISeeProduct() {
        new SalePage().userClickOnSaleBtn();

    }

    @And("^I click on StarTrek product$")
    public void iClickOnStarTrekProduct() {
        new SalePage().userShouldClickOnProdcutStarTrek();
        Assert.assertTrue(new SalePage().veryfyTextFromProductBar());

    }

    @Then("^I see product description$")
    public void iSeeProductDescription() {
        Assert.assertTrue(new SalePage().veryfyTextFromProductBar());

    }
    //NewSign Up Page Methods

}
