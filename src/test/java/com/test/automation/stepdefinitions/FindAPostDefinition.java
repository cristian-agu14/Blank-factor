package com.test.automation.stepdefinitions;

import com.test.automation.exeptions.Subscribe;
import com.test.automation.interactions.OpenTheBrowser;
import com.test.automation.questions.TheCurrentUrl;
import com.test.automation.questions.TheSubscriptionWas;
import com.test.automation.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class FindAPostDefinition {

    @Before
    public void prepareScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user goes to blanckFactor page")
    public void userGoesToBlanckFactorPAge() {
        theActorCalled("user").wasAbleTo(OpenTheBrowser.withSpecificUrl());
    }

    @When("^the user goes to blog page$")
    public void theUserGoesToTheLoginPage() {
        theActorInTheSpotlight().attemptsTo(EnterOnBlogs.page());
    }

    @When("^the user search a post called(.*)$")
    public void theUserSearchThePost(String postName) {
        theActorInTheSpotlight().attemptsTo(SearchThePost.called(postName));
    }

    @Then("^he should see the current url is (.*)$")
    public void theUserShouldTheUrl(String expectedUrl) {
        theActorInTheSpotlight().should(seeThat(TheCurrentUrl.onThePageIs(), is(equalTo(expectedUrl))));
    }

    @When("^the user subscribes to newsletter using the email (.*)")
    public void theUserSubscribe(String email) {
        theActorInTheSpotlight().attemptsTo(SubscribeToNewsLetter.page(email));
    }

    @Then("^the user sees the confirmation message$")
    public void theUserSeesTheConfirmationMessage() {
        theActorInTheSpotlight().should(seeThat(TheSubscriptionWas.succesful()).orComplainWith(Subscribe.class, Subscribe.ERROR_ON_TEST_ABOUT_ALTERNATIVES));
    }

    @When("^the user prints all the posts names$")
    public void theUserPrintsAllThePostsNames() {
        theActorInTheSpotlight().attemptsTo(PrintThePostsNames.onConsole());
    }

}
