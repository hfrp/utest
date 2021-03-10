package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.JoinTodayButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinToday implements Task {
    public static JoinToday JoinTodayButton(){
        return  Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayButton.JOIN_TODAY));
    }
}



