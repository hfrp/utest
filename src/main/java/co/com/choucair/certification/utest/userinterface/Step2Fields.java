package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step2Fields {
    public static final Target CITY =Target.the("Campo de ciudad").
            located(By.xpath("//*[@id=\"city\"]"));
    public static final Target ZIP_CODE=Target.the("Codigo postal").
            located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target COUNTRY=Target.the("Pais").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/" +
                    "div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_FIELD=Target.the("Campo de Pais").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/" +
                    "div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES=Target.the("Siguientes Dispositivos").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
