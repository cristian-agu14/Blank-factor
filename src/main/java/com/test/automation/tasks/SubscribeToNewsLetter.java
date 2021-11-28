package com.test.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.test.automation.userinterfaces.BlogsPageUI.INPUT_EMAIL;
import static com.test.automation.userinterfaces.BlogsPageUI.BTN_SUBSCRIBE;


public class SubscribeToNewsLetter implements Task {
private String email;

    public SubscribeToNewsLetter(String email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(INPUT_EMAIL), Enter.theValue(email).into(INPUT_EMAIL));
        actor.attemptsTo(Click.on(BTN_SUBSCRIBE));
    }

    public static SubscribeToNewsLetter page(String email){
        return Tasks.instrumented(SubscribeToNewsLetter.class, email);
    }
}
