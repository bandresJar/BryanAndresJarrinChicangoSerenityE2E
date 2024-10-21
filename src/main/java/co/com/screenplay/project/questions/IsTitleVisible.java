package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class IsTitleVisible implements Question<Boolean> {

    private final Target titleElement;

    public IsTitleVisible(Target titleElement) {
        this.titleElement = titleElement;
    }

    public static IsTitleVisible on(Target titleElement) {
        return new IsTitleVisible(titleElement);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verifica si el elemento existe y está visible
        return titleElement.resolveFor(actor).isDisplayed();
    }
}
