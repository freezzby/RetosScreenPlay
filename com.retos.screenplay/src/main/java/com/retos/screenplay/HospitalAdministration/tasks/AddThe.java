package com.retos.screenplay.HospitalAdministration.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class AddThe implements Task {
    private final DataTable data;

    public AddThe(DataTable data) {
        this.data=data;
    }

    public static AddThe person(DataTable data) {
        return new AddThe(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        data.asLists(String.class);
        List<List<String>> listData = data.raw();
        for (int i = 0; i < listData.get(0).size(); i++) {

        actor.remember(listData.get(0).get(i),listData.get(1).get(i));
        }

    }
}
