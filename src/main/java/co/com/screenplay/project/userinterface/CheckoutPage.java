package co.com.screenplay.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target FIRST_NAME_FIELD = Target.the("first name field").located(By.id("first-name"));
    public static final Target LAST_NAME_FIELD = Target.the("last name field").located(By.id("last-name"));
    public static final Target ZIP_CODE_FIELD = Target.the("zip code field").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("finish button").located(By.id("finish"));
    public static final Target TITLE = Target.the("Checkout overview page title").located(By.id("checkout_info_container"));

}
