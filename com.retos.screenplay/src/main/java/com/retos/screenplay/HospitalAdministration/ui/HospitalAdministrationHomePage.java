package com.retos.screenplay.HospitalAdministration.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HospitalAdministrationHomePage extends PageObject {

    public static final Target ADD_DOCTOR_LINK = Target.the("Link to add a doctor").located(By.xpath("//a[@href = 'addDoctor']"));
    public static final Target ADD_PATIENT_LINK = Target.the("Link to add a doctor").located(By.xpath("//a[@href = 'addPatient']"));

    public static HospitalAdministrationHomePage webSite() {
        return new HospitalAdministrationHomePage();
    }
}
