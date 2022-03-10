package co.com.utest.reto.tecnico.tasks;

import co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Registration implements Task {
    public static Registration onThePage() {
        return Tasks.instrumented(Registration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TargetUtestPage.JOIN_TODAY));
    }
}
