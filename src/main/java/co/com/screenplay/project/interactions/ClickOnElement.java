package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnElement implements Interaction {

    private final Target target;

    public ClickOnElement(Target target) {
        this.target = target;
    }

    public static ClickOnElement on(Target target) {
        return instrumented(ClickOnElement.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }
}
