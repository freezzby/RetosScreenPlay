package com.retos.screenplay.HospitalAdministration.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HospitalAdministrationDoctorRegisterResultPage extends PageObject {
   public static final Target RESULT_MESSAGE = Target.the("Result message for the registration").located(org.openqa.selenium.By.xpath("//p"));

}
