package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.Step4Fields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Step4 implements Task {
    public Step4 (String strPw){
    this.strPw=strPw;
    }
    private String strPw;
    public static Step4 Step4Data(String strPw){
        return Tasks.instrumented(Step4.class,strPw);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Enter.theValue(strPw).into(Step4Fields.PW),
        Enter.theValue(strPw).into(Step4Fields.PWC),
        Click.on(Step4Fields.TERMS),
        Click.on(Step4Fields.PRIV),
        Click.on(Step4Fields.COMPLETE));
    }
}
