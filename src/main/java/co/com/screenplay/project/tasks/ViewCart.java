package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {

    public static ViewCart itemsInCart() {
        return instrumented(ViewCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnElement.on(ProductPage.CART_BUTTON)
        );
    }
}
