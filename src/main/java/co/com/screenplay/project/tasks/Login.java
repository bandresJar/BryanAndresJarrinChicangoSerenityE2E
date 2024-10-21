package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.screenplay.project.interactions.EnterText;
import co.com.screenplay.project.interactions.ClickOnElement;
import co.com.screenplay.project.userinterface.LoginPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login withCredentials(String username, String password) {
        return instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterText.into(LoginPage.USERNAME_FIELD, username),
                EnterText.into(LoginPage.PASSWORD_FIELD, password),
                ClickOnElement.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
