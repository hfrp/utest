package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.Step2Fields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Step2 implements Task {

    public Step2(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    private String strCity;
    private String strZip;
    private String strCountry;

    public static Step2 Step2Data(String strCity, String strZip, String strCountry) {
    return Tasks.instrumented(Step2.class, strCity,strZip,strCountry);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Enter.theValue(strCity).into(Step2Fields.CITY),
                Hit.the(Keys.ARROW_DOWN).into(Step2Fields.CITY),
                Hit.the(Keys.ENTER).into(Step2Fields.CITY),
                Enter.theValue(strZip).into(Step2Fields.ZIP_CODE),
                Click.on(Step2Fields.COUNTRY),
                Enter.theValue(strCountry).into(Step2Fields.COUNTRY_FIELD),
                Hit.the(Keys.ENTER).into(Step2Fields.COUNTRY_FIELD),
                Click.on(Step2Fields.NEXT_DEVICES));
    }
}
