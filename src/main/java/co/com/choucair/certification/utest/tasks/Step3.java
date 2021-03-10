package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.Step3Fields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Step3 implements Task {

    public Step3 (String strComputer, String strVersion, String strLang, String strMobile, String strModel, String strOs){
        this.strComputer= strComputer;
        this.strVersion= strVersion;
        this.strLang= strLang;
        this.strMobile=strMobile;
        this.strModel=strModel;
        this.strOs=strOs;
    }
    private String strComputer;
    private String strVersion;
    private String strLang;
    private String strMobile;
    private String strModel;
    private String strOs;

    public static Step3 Step3Data(String strComputer, String strVersion, String strLang, String strMobile,
                                  String strModel, String strOs){
        return Tasks.instrumented(Step3.class, strComputer, strVersion, strLang, strMobile, strModel, strOs);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step3Fields.COMPUTER_FIELD),
       Enter.theValue(strComputer).into(Step3Fields.COMPUTER),
       Hit.the(Keys.ENTER).into(Step3Fields.COMPUTER),
       Click.on(Step3Fields.VERSION_FIELD),
       Enter.theValue(strVersion).into(Step3Fields.VERSION),
       Hit.the(Keys.ENTER).into(Step3Fields.VERSION),
       Click.on(Step3Fields.LANG_FIELD),
       Enter.theValue(strLang).into(Step3Fields.LANG),
       Hit.the(Keys.ENTER).into(Step3Fields.LANG),
       Click.on(Step3Fields.LAST_STEP));
    }
}
