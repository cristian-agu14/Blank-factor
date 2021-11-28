package com.test.automation.interactions;

import com.test.automation.userinterfaces.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Interaction {

    private HomePageUI page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }
    public static OpenTheBrowser withSpecificUrl(){
        return Tasks.instrumented(OpenTheBrowser.class);
    }
}
