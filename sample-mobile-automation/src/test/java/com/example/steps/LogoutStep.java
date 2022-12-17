package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import com.example.app.pages.RegistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {

    RegistPage registPage = new RegistPage();
    LogoutPage logoutPage = new LogoutPage();
    @When("I click Profile button")
    public void iClickProfileButton() {
        logoutPage.clickProfileBtn();
    }
    @And("I click Setting button")
    public void iClickSettingButton() {
        logoutPage.clickSettingBtn();
    }
    @Then("I click logout icon")
    public void iClickLogoutIcon() {
        logoutPage.clickLogoutBtn();
    }

    @And("I will go to login page")
    public void iWillGoToLoginPage() {
        registPage.clickLoginIcon();
    }


}
