package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.test.automation.userinterfaces.BlogsPageUI.TXT_CONFIRMATION_TEXT;

public class TheSubscriptionWas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_CONFIRMATION_TEXT.resolveFor(actor).isVisible();
    }

    public static TheSubscriptionWas succesful(){
        return new TheSubscriptionWas();
    }
}
