package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.CheckoutPage;
import co.com.screenplay.project.userinterface.OverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickFinishButton implements Task {

    public static ClickFinishButton on() {
        return instrumented(ClickFinishButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnElement.on(OverviewPage.FINISH_BUTTON)
        );
    }
}