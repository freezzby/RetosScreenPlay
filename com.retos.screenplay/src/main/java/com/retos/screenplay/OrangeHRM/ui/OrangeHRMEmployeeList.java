package com.retos.screenplay.OrangeHRM.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHRMEmployeeList {

    public static final Target SEARCH_FIELD = Target.the("Field to search an employee").located(By.id("employee_name_quick_filter_employee_list_value"));
    public static final Target EMPLOYEE_RESULT_ID = Target.the("Employee ID after the result").located(By.xpath("//table[@id = 'employeeListTable']/tbody/tr/td[2]"));
    public static final Target LOADING_BAR = Target.the("Loading bar").located(By.id("loading-bar"));
}
