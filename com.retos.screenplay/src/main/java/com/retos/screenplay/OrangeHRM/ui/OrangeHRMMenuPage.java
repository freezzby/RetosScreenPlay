package com.retos.screenplay.OrangeHRM.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHRMMenuPage extends PageObject {

    public static Target PIM_MENU = Target.the("PIM Menu button").located(By.xpath("//span[@class='left-menu-title' and text() = 'PIM']"));
    public static Target ADD_EMPLOYEE_MENU = Target.the("Add employee button").located(By.xpath("//span[@class='left-menu-title' and text() = 'Add Employee']"));
}
