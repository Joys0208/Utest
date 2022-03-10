package co.com.utest.reto.tecnico.tasks;

import co.com.utest.reto.tecnico.models.DataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage.*;

public class StepTwo implements Task {
    private List<DataRegister> data;
    public StepTwo(List<DataRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TEXT_CITY),
                Clear.field(TEXT_CITY),
                Enter.keyValues(data.get(0).getCity()).into(TEXT_CITY),
                Enter.keyValues(Keys.ARROW_DOWN).into(TEXT_CITY),
                Enter.keyValues(Keys.ENTER).into(TEXT_CITY));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(TEXT_ZIPCODE),
                Clear.field(TEXT_ZIPCODE),
                Enter.theValue(data.get(0).getZipCode()).into(TEXT_ZIPCODE),
                Click.on(BUTTON_STEP_THREE));
    }
    public static StepTwo theRegister(List<DataRegister> data) {
        return Tasks.instrumented(StepTwo.class,data);
    }
}
