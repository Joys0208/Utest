package co.com.utest.reto.tecnico.stepdefinitios;

import co.com.utest.reto.tecnico.models.DataRegister;
import co.com.utest.reto.tecnico.questions.AnswerPage;
import co.com.utest.reto.tecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoUtestStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user starts the registration process in the option join today$")
    public void userStartsTheRegistrationProcessInTheOptionJoinToday() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), Registration.onThePage());    }

    @When("^user performs the registration process of the utest page$")
    public void userPerformsTheRegistrationProcessOfTheUtestPage(List<DataRegister> data) {
        theActorInTheSpotlight().attemptsTo(StepOne.theRegister(data),
                StepTwo.theRegister(data),
                StepThree.theRegister(data),
                StepFour.theRegister(data)
        );

    }

    @Then("^user achieves successful registration$")
    public void userAchievesSuccessfulRegistration(List<DataRegister> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPage.is(data.get(0).getAnswer())));
    }

}
