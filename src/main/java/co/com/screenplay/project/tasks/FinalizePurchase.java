package co.com.screenplay.project.tasks;

import co.com.screenplay.project.userinterface.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizePurchase implements Task {

    public static FinalizePurchase orderCompletion() {
        return instrumented(FinalizePurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnElement.on(CartPage.CHECKOUT_BUTTON)
        );
    }
}
