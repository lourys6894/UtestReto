package co.com.bancolombia.certification.utestreto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_use.feature",
        glue = "co.com.bancolombia.certification.utestreto.stepdefinitions,",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegisterUser {
}
