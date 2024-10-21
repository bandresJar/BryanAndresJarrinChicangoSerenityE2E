package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterText implements Interaction {

    private final String text;
    private final Target target;

    public EnterText(Target target, String text) {
        this.target = target;
        this.text = text;
    }

    public static EnterText into(Target target, String text) {
        return instrumented(EnterText.class, target, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(text).into(target));
    }
}
