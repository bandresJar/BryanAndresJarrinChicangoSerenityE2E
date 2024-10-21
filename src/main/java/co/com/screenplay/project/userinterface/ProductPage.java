package co.com.screenplay.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target ADD_FIRST_PRODUCT = Target.the("first product").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target TITLE = Target.the("Products page title").located((By.id("inventory_container")));

    public static final Target ADD_SECOND_PRODUCT = Target.the("second product").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target CART_BUTTON = Target.the("cart button").located(By.className("shopping_cart_link"));
}
