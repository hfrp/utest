package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step4Fields {
    public static final Target PW=Target.the("Ingresa la clave aquí").
            located(By.xpath("//*[@id=\"password\"]"));
    public static final Target PWC=Target.the("Rectifica clave").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target TERMS=Target.the("Acepta terminos y condiciones").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final  Target PRIV=Target.the("Privacidad y seguridad, aceptar").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE=Target.the("Completa el registro").
            located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target TEXT_STEP=Target.the("Boton Captcha").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[1]"));
}
