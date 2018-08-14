package com.retos.screenplay.OrangeHRM.model;

import com.retos.screenplay.OrangeHRM.interactions.Select;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Map;

public class SelectBuilder  {

    String option;

    public SelectBuilder(String option){
        this.option = option;
    }

    public Performable on(Target target){
        return Tasks.instrumented(Select.class,option,target);
    }
}
