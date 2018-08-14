package com.retos.screenplay.OrangeHRM.ui;

import net.bytebuddy.implementation.bind.annotation.DefaultCall;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHRMLoginPage extends PageObject {


    public static Target BUTTON_LOGIN = Target.the("Button to login").located(By.id("btnLogin"));

    public static OrangeHRMLoginPage webSite(){
        return new OrangeHRMLoginPage();
    }
}
