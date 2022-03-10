package co.com.utest.reto.tecnico.tasks;

import co.com.utest.reto.tecnico.models.DataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage.*;

public class StepThree implements Task {
    private List<DataRegister> data;
    public StepThree(List<DataRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_MOBILE_DEVICE),
                Enter.theValue(data.get(0).getMobileDevice()).into(TEXT_MOBILE_DEVICE),
                Enter.keyValues(Keys.ENTER).into(TEXT_MOBILE_DEVICE),
                Click.on(LIST_MODEL),
                Enter.theValue(data.get(0).getModel()).into(TEXT_MODEL),
                Enter.keyValues(Keys.ENTER).into(TEXT_MODEL),
                Click.on(LIST_OPERATING_SYSTEM),
                Enter.theValue(data.get(0).getModel()).into(TEXT_OPERATING_SYSTEM),
                Enter.keyValues(Keys.ENTER).into(TEXT_OPERATING_SYSTEM),
                Click.on(BUTTON_STEP_FOUR)
        );

    }

    public static StepThree theRegister(List<DataRegister> data) {
        return Tasks.instrumented(StepThree.class,data);
    }
}

