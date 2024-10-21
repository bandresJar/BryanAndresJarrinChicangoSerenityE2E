package co.com.screenplay.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {
    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message").located(By.cssSelector(".complete-header[data-test='complete-header']"));
}
