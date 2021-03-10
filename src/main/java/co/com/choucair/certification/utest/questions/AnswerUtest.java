package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.Step4Fields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerUtest implements Question<Boolean> {
    private String strOk;

    public AnswerUtest(String strOk) {
        this.strOk = strOk;
    }

    public static AnswerUtest answerUtest(String strOk) {
        return new AnswerUtest(strOk);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Step4Text = Text.of(Step4Fields.TEXT_STEP).viewedBy(actor).asString();

        if (strOk.equals(Step4Text)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

