package com.example.steps;

import com.example.app.pages.CreateThread;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateThreadStep {
    LoginPage loginPage = new LoginPage();
    CreateThread createThread = new CreateThread();
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        loginPage.inputEmailLogin("capstone25@gmail.com");
        loginPage.inputPasswordLogin("Capstone100");
        loginPage.clickLoginBtn();
    }

    @And("I click Create Thread button")
    public void iClickCreateThreadButton() {
        createThread.clickCreateThreadButton();
    }

    @When("I input {string} title {string} content and {string} photo")
    public void iInputTitleContentAndPhoto(String arg0, String arg1, String arg2) {
        createThread.writeTitle(arg0);
        createThread.writeContent(arg1);
        createThread.uploadAPhoto(arg2);
    }
    @And("I click discuss.In button")
    public void iClickDiscussInButton() {
        createThread.clickDiscussInButton();
    }

    @Then("I will get the {string} post")
    public void iWillGetThePost(String arg0) {
        
    }
}
