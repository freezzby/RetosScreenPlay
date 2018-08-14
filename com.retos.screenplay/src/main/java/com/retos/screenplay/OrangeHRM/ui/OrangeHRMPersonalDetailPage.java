package com.retos.screenplay.OrangeHRM.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHRMPersonalDetailPage extends PageObject {

public static Target  DATE_OF_BIRTCH_FIELD = Target.the("Field to input the date of birth").located(By.id("date_of_birth"));
public static Target  MARITAL_STATUS_DROPDOWN = Target.the("Dropdown to input the marital status").located(By.id("marital_status_inputfileddiv"));


}
