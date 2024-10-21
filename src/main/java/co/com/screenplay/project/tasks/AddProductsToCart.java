package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductsToCart implements Task {

    public static AddProductsToCart addTwoRandomItems() {
        return instrumented(AddProductsToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnElement.on(ProductPage.ADD_FIRST_PRODUCT),
                ClickOnElement.on(ProductPage.ADD_SECOND_PRODUCT)
        );
    }
}
