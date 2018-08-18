package com.retos.screenplay.OrangeHRM.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHRMRegisterEmployeePage extends PageObject {

    public static Target FIRST_NAME_FIELD = Target.the("The field to input the first name").located(By.id("firstName"));
    public static Target MIDDLE_NAME_FIELD = Target.the("The field to input the middle name").located(By.id("middleName"));

    public static Target LAST_NAME_FIELD = Target.the("The field to input the last name").located(By.id("lastName"));

    public static Target EMPLOYEE_ID_FIELD= Target.the("The field to check the employee id").located(By.id("employeeId"));



    public static Target DROP_DOWN_LOCATION = Target.the("The field to input the last name").located(By.id("location_inputfileddiv"));

    public static Target SAVE_BUTTON = Target.the("The button to save the employee register").located(By.id("systemUserSaveBtn"));
}
