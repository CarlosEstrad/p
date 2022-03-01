package stepdefinitions;

import co.com.choucair.prueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Carlos wants to register to complete the form in order to create a new user$")
    public void thatCarloswantstoregistertocompletetheforminordertocreateanewuser(){
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @Then("^he enters the join today button$")
    public void heentersthejointodaybutton(){

    }

    @When("^find the form to fill out in order to create a user")
    public void findtheformtofilloutinordertocreateauser(){

    }
}
