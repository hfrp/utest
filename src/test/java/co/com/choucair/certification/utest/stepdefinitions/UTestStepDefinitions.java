package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestUserData;
import co.com.choucair.certification.utest.questions.AnswerUtest;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^: when Hernan wants to register in utest$")
    public void whenHernanWantsToRegisterInUtest() {
        OnStage.theActorCalled("Hernan").wasAbleTo(OpenUtest.thePage());
    }


    @When("^: he starts the registration in utest$")
    public void heStartsTheRegistrationInUtest(List <UtestUserData> utestUserData) throws Exception {
    OnStage.theActorInTheSpotlight().attemptsTo(
            JoinToday.JoinTodayButton(),
            Step1.Step1Data(utestUserData.get(0).getStrFirstname(),
                    utestUserData.get(0).getStrLastname(),utestUserData.get(0).getStrEmail(),
                    utestUserData.get(0).getStrMonth(),utestUserData.get(0).getStrDay(),
                    utestUserData.get(0).getStrYear()),
            Step2.Step2Data(utestUserData.get(0).getStrCity(),utestUserData.get(0).getStrZip(),
                    utestUserData.get(0).getStrCountry()),
            Step3.Step3Data(utestUserData.get(0).getStrComputer(),utestUserData.get(0).getStrVersion(),
                    utestUserData.get(0).getStrLang(),utestUserData.get(0).getStrMobile(),
                    utestUserData.get(0).getStrModel(),utestUserData.get(0).getStrOs()),
            Step4.Step4Data(utestUserData.get(0).getStrPw()));
    }

    @Then("^: he login in utest$")
    public void heLoginInUtest(List<UtestUserData> utestUserData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerUtest.answerUtest(utestUserData.
                get(0).getStrOk())));

    }

}
