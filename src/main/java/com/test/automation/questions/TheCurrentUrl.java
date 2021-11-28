package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class TheCurrentUrl  implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = getDriver();
        return driver.getCurrentUrl();
    }

    public static TheCurrentUrl onThePageIs(){
        return new TheCurrentUrl();
    }
}
