package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.Step1Fields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Step1 implements Task {

    public Step1(String strFirstname, String strLastname, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirstname = strFirstname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }
    private String strFirstname;
    private String strLastname;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;




    public static Step1 Step1Data(String strFirstname, String strLastname, String strEmail, String strMonth,
                                  String strDay, String strYear) {
        return Tasks.instrumented(Step1.class, strFirstname, strLastname, strEmail, strMonth, strDay, strYear);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(strFirstname).into(Step1Fields.FIRST_NAME),
                Enter.theValue(strLastname).into(Step1Fields.LAST_NAME),
                Enter.theValue(strEmail).into(Step1Fields.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(strMonth).from(Step1Fields.MONTH),
                SelectFromOptions.byVisibleText(strDay).from(Step1Fields.DAY),
                SelectFromOptions.byVisibleText(strYear).from(Step1Fields.YEAR),
                Click.on(Step1Fields.NEXT_LOCATION));
    }
}


