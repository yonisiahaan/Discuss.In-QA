package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GenerateString;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RegistPage extends BasePageObject {
    //header and icon and text
    private By successRegist = MobileBy.AccessibilityId("Login Now");
    private By successLogin = MobileBy.AccessibilityId("Discuss.In");
    private By loginIcon = MobileBy.AccessibilityId("Aloha!");
    private By loginTitle = By.xpath("//android.view.View[@content-desc='Login']");
    private By backIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By registText = MobileBy.AccessibilityId(" Register");
    private By registTitle = By.xpath("//android.view.View[@content-desc='Register']");
    private By errorName = MobileBy.AccessibilityId("Please enter username");
    private By errorEmail = By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]");
    private By errorPassword1 = By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]");
    private By errorPassword = MobileBy.AccessibilityId("Please enter password");
    private By errorGagalRegist = MobileBy.AccessibilityId("Try Again");
    //button and fill (except product)
    private By fillNameRegist = By.xpath("//android.widget.EditText[1]");
    private By fillEmailRegist = By.xpath("//android.widget.EditText[2]");
    private By fillPasswordRegist = By.xpath("//android.widget.EditText[3]");
    private By registButton = MobileBy.AccessibilityId("Create Account");
    private By errorGagalLogin = MobileBy.AccessibilityId("Try Again");
    public void clickLoginIcon(){
        click(loginIcon);
    }
    public void clickRegistText(){
        click(registText);
    }

    public void inputNameRegist(String name){
        if(name.equals("random")){
            GenerateString generateString = new GenerateString();
            name = generateString.randomName();
        } else if (name.equals("valid")){
            name = "qa_bayu";
        } else if (name.equals("null")){
            name ="";
        }
        click(fillNameRegist);
        fill(fillNameRegist, name);
    }
    public void inputEmailRegist(String email){
        if(email.equals("random")){
            GenerateString generateString = new GenerateString();
            email = generateString.randomEmail();
        } else if (email.equals("valid")){
            email = "capstone25@gmail.com";
        } else if (email.equals("null")){
            email ="";
        }
        click(fillEmailRegist);
        fill(fillEmailRegist,email);
    }
    public void inputPasswordRegist(String password){
        if(password.equals("random")){
            GenerateString generateString = new GenerateString();
            password = generateString.randomPassword();
        } else if (password.equals("valid")){
            password = "Capstone100";
        } else if (password.equals("null")){
            password ="";
        }
        click(fillPasswordRegist);
        fill(fillPasswordRegist, password);
    }

    public void clickRegistBtn(){
        click(registButton);
    }
    public void errMsgNameDisplayed(){
        isDisplayed(errorName);
    }
    public void errMsgEmailDisplayed(){
        isDisplayed(errorEmail);
    }
    public void errMsgPwdDisplayed(){
        isDisplayed(errorPassword);
    }
    public void errMsgPwd1Displayed(){
        isDisplayed(errorPassword1);
    }
    public void errMsgAllRegistDisplayed(){
        isDisplayed(errorGagalRegist);
    }
    public void successRegist(){
        isDisplayed(successRegist);
    }
    public void successLogin(){
        isDisplayed(successLogin);
    }
    public void errMsgAllLoginDisplayed(){
        isDisplayed(errorGagalLogin);
    }

}
