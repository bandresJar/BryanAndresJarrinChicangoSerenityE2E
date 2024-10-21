package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.screenplay.project.userinterface.ConfirmationPage;

public class ConfirmationMessage {
    public static Question<String> visible() {
        return Text.of(ConfirmationPage.CONFIRMATION_MESSAGE).asString();
    }
}