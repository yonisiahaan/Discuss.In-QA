package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GenerateString;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CreateThread extends BasePageObject {
    private By fillTitile = By.xpath("//android.widget.EditText[1]");
    private By fillContent = By.xpath("//android.widget.EditText[2]");
    private By uploadPhoto = By.xpath("//android.widget.Button");
    private By choosePhotoOrCamera = By.xpath("//android.widget.Button[1]");
    private By choosePhoto = By.xpath("///android.widget.ImageView");
    private By popupCreateThread = MobileBy.AccessibilityId("Tab 3 of 5");
    private By CreateThreadButton = MobileBy.AccessibilityId("Create a Discuss?");
    private By DiscussInButton = MobileBy.AccessibilityId("Discuss.In");
    private By verifySuccessThread = By.xpath("//android.view.View[1]");

    public void clickCreateThreadButton(){
        click(popupCreateThread);
        click(CreateThreadButton);
    }
    public void successPost(){
        isDisplayed(verifySuccessThread);
    }
    public void failedPost(){
        isDisplayed(verifySuccessThread);
    }
    public void writeTitle(String title){
        if(title.equals("write")){
            GenerateString generateString = new GenerateString();
            title = generateString.writeTitle();
        } else if (title.equals("null")){
            title ="";
        }
        click(fillTitile);
        fill(fillTitile,title);
        hideKeyboard();
    }
    public void writeContent(String content){
        if(content.equals("write")){
            GenerateString generateString = new GenerateString();
            content = generateString.writeContent();
        } else if (content.equals("null")){
            content ="";
        }
        click(fillContent);
        fill(fillContent, content);
        hideKeyboard();
    }

    public void uploadAPhoto(String upload){
        if(upload.equals("write")){
            click(uploadPhoto);
            click(choosePhotoOrCamera);
            click(choosePhoto);
        } else if (upload.equals("null")){
        }
    }

    public void clickDiscussInButton(){
        click(DiscussInButton);
    }
}
