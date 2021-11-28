package com.test.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.slf4j.LoggerFactory;

import static com.test.automation.userinterfaces.BlogsPageUI.*;

public class PrintThePostsNames implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isThereAnyMore = true;
        int cont = 1;
        while (isThereAnyMore) {
            if (LINK_BLOG_NAME.of(cont + "").resolveFor(actor).isPresent()) {
                actor.attemptsTo(Scroll.to(LINK_BLOG_NAME.of(cont + "")));
                String text = LINK_BLOG_NAME.of(cont + "").resolveFor(actor).getText();
                LoggerFactory.getLogger(PrintThePostsNames.class).info(text);
                cont++;
            } else if (BTN_GO_TO_NEXT_PAGE.resolveFor(actor).isPresent()){
                actor.attemptsTo(Click.on(BTN_GO_TO_NEXT_PAGE));
                cont = 1;
            }else{
                isThereAnyMore = false;
            }

        }
    }

    public static PrintThePostsNames onConsole(){
        return Tasks.instrumented(PrintThePostsNames.class);
    }

}
