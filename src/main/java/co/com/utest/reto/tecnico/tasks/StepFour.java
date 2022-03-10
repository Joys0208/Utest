package co.com.utest.reto.tecnico.tasks;

import co.com.utest.reto.tecnico.models.DataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage.*;

public class StepFour implements Task {
    private List<DataRegister> data;
    public StepFour(List<DataRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(TEXT_PASSWORD),
                Enter.theValue(data.get(0).getPassword()).into(TEXT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_TERM),
                Click.on(CHECKBOX_POLICY_PRIVACY),
                Click.on(BUTTON_REGISTER)
        );
    }
    public static StepFour theRegister(List<DataRegister> data) {
        return Tasks.instrumented(StepFour.class, data);
    }
}
