package co.com.utest.reto.tecnico.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/RetoUtest.Feature",
        tags = "@stories",
        glue = "co.com.utest.reto.tecnico.stepdefinitios",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
