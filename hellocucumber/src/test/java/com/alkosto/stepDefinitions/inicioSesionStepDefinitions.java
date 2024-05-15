package com.alkosto.stepDefinitions;


import com.alkosto.steps.HomeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inicioSesionStepDefinitions {

    private HomeSteps homeSteps;

    @Given("que el usuario accede al sitio web de Alkosto con sus credenciales")
    public void queElUsuarioAccedeAlSitioWebDeAlkostoConSusCredenciales() {
        homeSteps.openUrl();
        homeSteps.inicio();
        homeSteps.clickIniciar();

    }
    @When("ingresa su correo electrónico <correo>")
    public void ingresaSuCorreoElectrónicoCorreo() {

    }
    @Then("se le mostrará en pantalla el mensaje ¡Listo, encontramos tu cuenta!")
    public void seLeMostraráEnPantallaElMensajeListoEncontramosTuCuenta() {

    }





}
