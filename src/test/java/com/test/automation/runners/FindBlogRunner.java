package com.test.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Find-post.feature",
        glue = "com.test.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class FindBlogRunner {

}
