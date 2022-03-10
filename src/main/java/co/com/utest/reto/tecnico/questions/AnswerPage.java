package co.com.utest.reto.tecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.utest.reto.tecnico.userinterfaces.TargetUtestPage.LABEL_OF_REGISTER;

public class AnswerPage implements Question <Boolean> {
    private String question;

    public AnswerPage(String question) {
        this.question = question;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String labelPage = Text.of(LABEL_OF_REGISTER).viewedBy(actor).asString();
        if(question.equals(labelPage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static AnswerPage is(String question){
        return new AnswerPage(question);
    }

}
