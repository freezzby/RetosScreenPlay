package com.retos.screenplay.HospitalAdministration.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HospitalAdministrationDoctorRegisterPage extends PageObject {
    public static final Target DOCTOR_FIRST_NAME_FIELD = Target.the("Field to input the doctor's first name").located(By.id("name"));
    public static final Target DOCTOR_LAST_NAME_FIELD = Target.the("Field to input the doctor's last name").located(By.id("last_name"));
    public static final Target DOCTOR_PHONE_FIELD = Target.the("Field to input the doctor's phone number").located(By.id("telephone"));
    public static final Target DOCTOR_ID_TYPE_DROP_DOWN = Target.the("drop down to select the doctor's id type").located(By.id("identification_type"));
    public static final Target DOCTOR_ID_FIELD = Target.the("Field to input the doctor's id").located(By.id("identification"));
    public static final Target SUBMIT_BUTTON = Target.the("Button to submit the doctor registration").located(org.openqa.selenium.By.xpath("//a[@class='btn btn-primary pull-right']"));

}
