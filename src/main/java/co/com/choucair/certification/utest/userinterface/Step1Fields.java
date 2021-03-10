package co.com.choucair.certification.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


    public class Step1Fields {

        public static final Target FIRST_NAME = Target.the ("Nombre del usuario").
                located(By.xpath("//*[@id=\"firstName\"]"));
        public static final Target LAST_NAME = Target.the ("Apellido del usuario").
                located(By.xpath("//*[@id=\"lastName\"]"));
        public static final Target EMAIL_ADDRESS = Target.the("Correo del usuario").
                located(By.xpath("//*[@id=\"email\"]"));
        public static final  Target MONTH =  Target.the("Mes en el que nacio el usuario").
                located(By.xpath("//*[@id=\"birthMonth\"]"));
        public static final  Target DAY = Target.the ("Dia en el que nacio el usuario").
                located(By.xpath("//*[@id=\"birthDay\"]"));
        public static final  Target YEAR = Target.the ("Anio en el que nacio el usuario").
                        located(By.xpath("//*[@id=\"birthYear\"]"));
        public static final Target NEXT_LOCATION = Target.the("Boton siguientes campos").
                located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    }

