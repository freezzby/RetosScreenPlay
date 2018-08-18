package com.retos.screenplay.OrangeHRM.interactions;

import com.retos.screenplay.OrangeHRM.model.SelectBuilder;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public static SelectBuilder nationality(String nationality) {
        return new SelectBuilder(nationality);
    }

    public static SelectBuilder theRace(String race) {
        return new SelectBuilder(race);
    }

    public static SelectBuilder bloodGroup(String bloodGroup) {
        return new SelectBuilder(bloodGroup);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");

        target.resolveFor(actor).findElement(By.xpath("./div/input")).click();


        WebElementFacade clickTarget = target.resolveFor(actor).findBy(By.xpath("./div/ul/li/span[contains(text(), '" + option + "')]"));

        clickTarget.waitUntilClickable();
        clickTarget.click();


    }
}
