package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayButton {
    public static final Target JOIN_TODAY =Target.the("Boton para registro").
            located(By.xpath(
                    "/html/body/ui-view/unauthenticated-container/div/div/" +
                            "unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
