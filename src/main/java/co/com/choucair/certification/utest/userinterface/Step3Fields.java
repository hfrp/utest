package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Step3Fields {
    public static final Target COMPUTER_FIELD=Target.the("Campo Computador").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]"));
    public static final Target COMPUTER=Target.the("Computador").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target  VERSION_FIELD= Target.the("Campo Version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public static final Target VERSION= Target.the("Version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LANG_FIELD= Target.the("Campo de Lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public static final Target LANG= Target.the("Lenguaje").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_FIELD= Target.the("Campo de Movil").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target MOBILE= Target.the("Movil").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target MODEL_FIELD= Target.the("Campo de Modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target MODEL= Target.the("Modelo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OS_FIELD= Target.the("Campo de Sistema Operativo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target OS= Target.the("Sistema Operativo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target LAST_STEP=Target.the("Boton ultimo paso").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
