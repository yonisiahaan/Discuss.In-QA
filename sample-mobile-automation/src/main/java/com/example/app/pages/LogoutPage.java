package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {
    private By logoutButton = MobileBy.AccessibilityId("Logout");
    private By profileButton = MobileBy.AccessibilityId("Tab 5 of 5");
    private By settingButton = MobileBy.AccessibilityId("Setting");
    public void clickProfileBtn(){click(profileButton);}
    public void clickSettingBtn(){click(settingButton);}
    public void clickLogoutBtn(){
        click(logoutButton);
    }
}
