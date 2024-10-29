package stepdefinition;

import co.com.screenplay.project.questions.*;
import co.com.screenplay.project.tasks.*;
import co.com.screenplay.project.userinterface.ProductPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class PurchaseFlowStepDefinitions {

    @Before
    public void setUp() {
        // Inicializa el escenario y el actor
        OnStage.setTheStage(new net.serenitybdd.screenplay.actors.Stage(new Cast()));
        Actor usuario = OnStage.theActorCalled("Usuario"); // Nombra al actor

        usuario.can(BrowseTheWeb.with(SerenityWebdriverManager.inThisTestThread().getCurrentDriver()));
    }

    @Given("el usuario esta en la pagina de inicio de sesion")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToLoginPage.to("https://www.saucedemo.com/"));
    }

    @When("el usuario ingresa el nombre de usuario {string} y la contrasena {string}")
    public void elUsuarioIngresaCredenciales(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
    }

    @Then("deberia ver la pagina principal con el titulo {string}")
    public void deberiaVerLaPaginaPrincipalConTitulo(String expectedTitle) {
        OnStage.theActorInTheSpotlight().should(seeThat(IsTitleVisible.on(ProductPage.TITLE), is(true)));
    }

    @When("el usuario agrega dos productos al carrito")
    public void elUsuarioAgregaDosProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCart.addTwoRandomItems());
    }

    @When("el usuario revisa el carrito")
    public void elUsuarioRevisaElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCart.itemsInCart());
    }

    @Then("el usuario acepta los productos en el carrito")
    public void elUsuarioAceptaLosProductosEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(FinalizePurchase.orderCompletion());
    }

     @When("el usuario llena los datos de envio con nombre {string}, apellido {string} y codigo postal {string}")
    public void elUsuarioLlenaLosDatosDeEnvio(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchaseForm.withDetails(firstName, lastName, postalCode));
    }

    @When("el usuario acepta la compra")
    public void elUsuarioAceptaLaCompra() {
        // Implementar lógica para revisar la compra antes de finalizar.
        OnStage.theActorInTheSpotlight().attemptsTo(ClickContinueButton.on());
    }

    @Then("el usuario finaliza la compra")
    public void elUsuarioFinalizaLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickFinishButton.on());
    }

    @Then("el usuario deberia ver el mensaje de confirmacion {string}")
    public void deberiaVerElMensajeDeConfirmacion(String expectedMessage) {
        OnStage.theActorInTheSpotlight().should(seeThat(ConfirmationMessage.visible(), is(expectedMessage)));
    }
}
