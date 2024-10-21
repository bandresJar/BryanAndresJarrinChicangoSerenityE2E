package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.interactions.EnterText;
import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePurchaseForm implements Task {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public CompletePurchaseForm(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public static CompletePurchaseForm withDetails(String firstName, String lastName, String zipCode) {
        return instrumented(CompletePurchaseForm.class, firstName, lastName, zipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterText.into(CheckoutPage.FIRST_NAME_FIELD, firstName),
                EnterText.into(CheckoutPage.LAST_NAME_FIELD, lastName),
                EnterText.into(CheckoutPage.ZIP_CODE_FIELD, zipCode)
        );
    }
}
