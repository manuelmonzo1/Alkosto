package com.alkosto.stepDefinitions;


import com.alkosto.Utils.Hover;
import com.alkosto.steps.EmailVerificationSteps;
import com.alkosto.steps.HomeSteps;
import com.alkosto.steps.OptionsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inicioSesionStepDefinitions {
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
    private HomeSteps homeSteps;

    @Steps
    private EmailVerificationSteps emailVerificationSteps;

    @Steps
    private OptionsSteps optionsSteps;


    @Given("que el usuario accede al sitio web de Alkosto con sus credenciales")
    public void queElUsuarioAccedeAlSitioWebDeAlkostoConSusCredenciales() {
        homeSteps.openUrl();
        homeSteps.inicio();
        homeSteps.clickIniciar();

    }
    @When("ingresa su correo electrónico <correo>")
    public void ingresaSuCorreoElectrónicoCorreo() {
    emailVerificationSteps.digitarCorreo();
    emailVerificationSteps.clickContinuar();

    }
    @Then("se le mostrará en pantalla el mensaje ¡Listo, encontramos tu cuenta!")
    public void seLeMostraráEnPantallaElMensajeListoEncontramosTuCuenta() {
        optionsSteps.optionsms();
    }

}
