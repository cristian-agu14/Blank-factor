package com.test.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI  extends PageObject {

    public static final Target BTN_INSIGHTS = Target.the("Insights button").locatedBy("(//li[@id='menu-item-4436']//a)[1]");
    public static final Target BTN_GO_TO_BLOG = Target.the("Button for go to blogs page").locatedBy("//a[contains(text(), ' Go to blog ')]");
}
