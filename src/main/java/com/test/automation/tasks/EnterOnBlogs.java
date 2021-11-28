package com.test.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.test.automation.userinterfaces.HomePageUI.BTN_INSIGHTS;
import static com.test.automation.userinterfaces.HomePageUI.BTN_GO_TO_BLOG;

public class EnterOnBlogs implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_INSIGHTS));
        actor.attemptsTo(Click.on(BTN_GO_TO_BLOG));
    }

    public static EnterOnBlogs page(){
        return Tasks.instrumented(EnterOnBlogs.class);
    }
}
