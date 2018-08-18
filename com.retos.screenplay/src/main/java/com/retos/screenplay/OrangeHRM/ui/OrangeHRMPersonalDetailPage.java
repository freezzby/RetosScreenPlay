package com.retos.screenplay.OrangeHRM.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.BaseTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class OrangeHRMPersonalDetailPage extends PageObject {

    public static final Target DATE_OF_BIRTH_FIELD = Target.the("Field to input the date of birth").located(By.id("date_of_birth"));
    public static final Target MARITAL_STATUS_DROPDOWN = Target.the("Dropdown to input the marital status").located(By.id("marital_status_inputfileddiv"));

    public static final Target GENDER_LIST =
            Target.the("List of genders").located(By.xpath("//ul[@class = 'radiobutton-container' ]"));

    public static final Target NATIONALITY_DROPDOWN = Target.the("Dropdown to input the nationality").located(By.id("nationality_inputfileddiv"));

    public static final Target DRIVER_LICENCE_FIELD = Target.the("Field to input the drivers licence").located(By.id("driver_license"));

    public static final Target LICENCE_EXPIRATION_FIELD = Target.the("Field to input the drivers licence expiration date").located(By.id("license_expiry_date"));

    public static final Target RACE_DROPDOWN = Target.the("Dropdown to input the race").located(By.id("eeo_race_ethnicity_inputfileddiv"));

    public static final Target BLOOD_GROUP_DROPDOWN = Target.the("Dropdown to input the blood group").located(By.id("1_inputfileddiv"));


    public static final Target HOBBIES_FIELD = Target.the("Field to input the hobbies").located(By.id("5"));
    public static final Target SUBMIT_BUTTON = Target.the("Button to save the changes").located(By.xpath("//button[@type='submit']"));
    public static final Target GENDER_MALE = Target.the("Radio button for the male gender").located(By.xpath("//input[@id = 'gender_1']/../label"));
    public static final Target GENDER_FEMALE = Target.the("Radio button for the female gender").located(By.xpath("//input[@id = 'gender_2']/../label"));
}
