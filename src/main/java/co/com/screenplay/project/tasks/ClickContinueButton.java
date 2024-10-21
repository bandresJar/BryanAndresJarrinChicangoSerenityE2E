package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickOnElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.userinterface.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickContinueButton implements Task {

    public static ClickContinueButton on() {
        return instrumented(ClickContinueButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnElement.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }
}