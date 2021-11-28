package com.test.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BlogsPageUI extends PageObject {

    public static Target LINK_BLOG_NAME = Target.the("Link to go to blog").locatedBy("(//div[@Class='post-template__info']//h2//a)[{0}]");
    public static Target BTN_GO_TO_NEXT_PAGE = Target.the("Button to go to next page").locatedBy("//a[@Class='next page-numbers page-link']");
    public static Target BTN_GO_TO_POST = Target.the("Button to go to the post found").locatedBy("(//div[@Class='post-template__info']//h2//a)[{0}]//parent::h2//following-sibling::a");
    public static Target INPUT_EMAIL = Target.the("Input to enter the email to subscribe").locatedBy("//input[@name='email']");
    public static Target BTN_SUBSCRIBE = Target.the("Button to subscribe on the news letter").locatedBy("//button[@type='submit']");
    public static Target TXT_CONFIRMATION_TEXT = Target.the("Confirmation message on the screen").locatedBy("//div[contains(text(), 'Thank you for your submission')]");
}
