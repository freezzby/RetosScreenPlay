package com.retos.screenplay.OrangeHRM.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class EnterTo implements Task {

    private Target target;

    public EnterTo(Target target) {
        this.target = target;
    }

    public static EnterTo theMenu(Target target) {
        return Tasks.instrumented(EnterTo.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }


}
