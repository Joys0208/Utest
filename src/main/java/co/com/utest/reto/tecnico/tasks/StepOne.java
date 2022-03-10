package co.com.utest.reto.tecnico.tasks;

import co.com.utest.reto.tecnico.models.DataRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage.*;

public class StepOne implements Task {
    private List<DataRegister> data;
    public StepOne(List<DataRegister> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(TEXT_FIRST_NAME),
                Enter.theValue(data.get(0).getSecondName()).into(TEXT_SECOND_NAME),
                Enter.theValue(data.get(0).getEmail()).into(TEXT_EMAIL));

        actor.attemptsTo(Click.on(LIST_MONTH));
        WebElement ListMonth = LIST_MONTH.resolveFor(actor);
        List<WebElement> options = ListMonth.findElements(By.tagName("option"));
        for(int i=0; i < options.size(); i++){
            if(options.get(i).getText().trim().equals(data.get(0).getMonthBirth())){
                options.get(i).click();
                break;
            }
        }

        actor.attemptsTo(Click.on(LIST_DAY));
        WebElement ListDay = LIST_DAY.resolveFor(actor);
        List<WebElement> optionsDay = ListDay.findElements(By.tagName("option"));
        for(int i=0; i < optionsDay.size(); i++){
            if(optionsDay.get(i).getText().trim().equals(data.get(0).getDayBirth())){
                optionsDay.get(i).click();
                break;
            }
        }

        actor.attemptsTo(Click.on(LIST_YEAR));
        WebElement ListYear = LIST_YEAR.resolveFor(actor);
        List<WebElement> optionsYear = ListYear.findElements(By.tagName("option"));
        for(int i=0; i < optionsYear.size(); i++){
            if(optionsYear.get(i).getText().trim().equals(data.get(0).getYearBirth())){
                optionsYear.get(i).click();
                break;
            }
        }
        actor.attemptsTo(Click.on(BUTTON_STEP_TWO));
    }

    public static StepOne theRegister(List<DataRegister> data) {
        return Tasks.instrumented(StepOne.class,data);
    }
}
