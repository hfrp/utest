package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtest implements Task {
    private UtestWebSite utestWebSite;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUtest.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(utestWebSite));
    }
}
