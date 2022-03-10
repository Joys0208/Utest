package co.com.utest.reto.tecnico.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TargetUtestPage {

    public static final Target JOIN_TODAY = Target.the("Step 1: Tell us about yourself").located(By.partialLinkText("Join Today"));

    public static final Target TEXT_FIRST_NAME = Target.the("first name").located(By.id("firstName"));
    public static final Target TEXT_SECOND_NAME = Target.the("second name").located(By.id("lastName"));
    public static final Target TEXT_EMAIL = Target.the("email").located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("month").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("day").located(By.id("birthDay"));
    public static final Target LIST_YEAR = Target.the("year").located(By.id("birthYear"));
    public static final Target BUTTON_STEP_TWO = Target.the("Button step two").located(By.xpath("//a[@aria-label='Next step - define your location']"));

    public static final Target TEXT_CITY = Target.the("city").located(By.id("city"));
    public static final Target TEXT_ZIPCODE = Target.the("zip code").located(By.id("zip"));
    public static final Target BUTTON_STEP_THREE = Target.the("Button step Three").located(By.xpath("//a[@aria-label='Next step - select your devices']"));

    public static final Target LIST_MOBILE_DEVICE = Target.the("mobile device").located(By.name("handsetMakerId"));
    public static final Target TEXT_MOBILE_DEVICE = Target.the("mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target LIST_MODEL = Target.the("model").located(By.name("handsetModelId"));
    public static final Target TEXT_MODEL = Target.the("model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LIST_OPERATING_SYSTEM = Target.the("operating system").located(By.name("handsetOSId"));
    public static final Target TEXT_OPERATING_SYSTEM = Target.the("operating system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_STEP_FOUR = Target.the("Button step four").located(By.xpath("//a[@aria-label='Next - final step']"));

    public static final Target TEXT_PASSWORD = Target.the("Text password").located(By.id("password"));
    public static final Target TEXT_CONFIRM_PASSWORD = Target.the("Text confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERM = Target.the("Checkbox term").located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY_PRIVACY = Target.the("Checkbox policy and privacy").located(By.id("privacySetting"));
    public static final Target BUTTON_REGISTER = Target.the("Button register").located(By.xpath("//a[@aria-label='Complete Setup']"));

    public static final Target LABEL_OF_REGISTER = Target.the("Label of register").located(By.xpath("//h1"));
}
