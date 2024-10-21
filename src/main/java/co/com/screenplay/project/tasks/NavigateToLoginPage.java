package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToLoginPage implements Task {

    private final String url;

    public NavigateToLoginPage(String url) {
        this.url = url;
    }

    public static NavigateToLoginPage to(String url) {
        return instrumented(NavigateToLoginPage.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
