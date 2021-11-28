package com.test.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.test.automation.userinterfaces.BlogsPageUI.LINK_BLOG_NAME;
import static com.test.automation.userinterfaces.BlogsPageUI.BTN_GO_TO_NEXT_PAGE;
import static com.test.automation.userinterfaces.BlogsPageUI.BTN_GO_TO_POST;

public class SearchThePost implements Task {

    private String postName;

    public SearchThePost(String postName) {
        this.postName = postName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isThereAnyMore = true;
        int cont = 1;
        while (isThereAnyMore) {
            if (LINK_BLOG_NAME.of(cont + "").resolveFor(actor).isPresent()) {
                actor.attemptsTo(Scroll.to(LINK_BLOG_NAME.of(cont + "")));
                String text = LINK_BLOG_NAME.of(cont + "").resolveFor(actor).getText();
                if (text.equalsIgnoreCase(postName.substring(1))) {
                    actor.attemptsTo(Click.on(BTN_GO_TO_POST.of(cont+"")));
                }
                cont++;
            } else if (BTN_GO_TO_NEXT_PAGE.resolveFor(actor).isPresent()){
                actor.attemptsTo(Click.on(BTN_GO_TO_NEXT_PAGE));
                cont = 1;
            }else{
                isThereAnyMore = false;
            }

        }

    }

    public static SearchThePost called(String postName) {
        return Tasks.instrumented(SearchThePost.class, postName);
    }

}
