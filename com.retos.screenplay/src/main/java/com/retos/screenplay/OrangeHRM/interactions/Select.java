package com.retos.screenplay.OrangeHRM.interactions;

import com.retos.screenplay.OrangeHRM.model.SelectBuilder;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Map;

public class Select implements Interaction {

    Target target;
    String option;

    public static SelectBuilder location(String location) {
        return new SelectBuilder(location);
    }

    public static SelectBuilder maritalStatus(String maritalStatus) {
        return new SelectBuilder(maritalStatus);
    }

    public Select(String option, Target target) {
        this.option = option;
        this.target = target;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");

        target.resolveFor(actor).findElement(By.xpath("./div/input")).click();

        target.resolveFor(actor).findElement(By.xpath("./div/ul/li/span[contains(text(), '" + option + "')]")).click();


    }
}
