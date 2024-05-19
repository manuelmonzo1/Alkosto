package com.alkosto.stepDefinitions;

import com.alkosto.Utils.Scroll;
import com.alkosto.steps.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tvStepDefinitions {
    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Steps
    private OptionsTvSteps optionsTvSteps;

    @Steps
    private Scroll scrollBy;

    @Steps
    private SmarSteps smarSteps;

    @Steps
    private TvTclSteps tvTclSteps;

    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Given("que el usuario quiere comprar un televisor")
    public void queElUsuarioQuiereComprarUnTelevisor() {
        optionsTvSteps.openUrl();
        optionsTvSteps.seleccionarTV();
        optionsTvSteps.pulgadasTV();
    }

    @When("ingresa a la página principal e inspecciona los productos de la sección TV")
    public void ingresaALaPáginaPrincipalEInspeccionaLosProductosDeLaSecciónTV() {
        optionsTvSteps.scrollBy(0,0);

    }

    @When("selecciona el televisor de su gusto")
    public void seleccionaElTelevisorDeSuGusto() {
        smarSteps.selecTV();
        tvTclSteps.validarProduct();

    }

    @Then("debo verificar que este elemento se agregue al carrito de compra")
    public void deboVerificarQueEsteElementoSeAgregueAlCarritoDeCompra() {
        tvTclSteps.seleccionarCarrito();
        tvTclSteps.carritoPagar();
        tvTclSteps.cantidad();

    }
    @Then("Ir a pagar y seleccionar una opción para iniciar sesión")
    public void irAPagarYSeleccionarUnaOpciónParaIniciarSesión() {
        cartSteps.pagar();
        checkoutSteps.correo();
        checkoutSteps.digiteCorreo();
        checkoutSteps.btnContinuar();
        optionsTvSteps.iniciarSesion();
        //Ajuste Final..
    }

}
