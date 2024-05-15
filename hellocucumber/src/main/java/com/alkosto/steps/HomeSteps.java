package com.alkosto.steps;

import com.alkosto.pageObject.HomePageObject;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps extends PageObject {

    @Page
    private HomePageObject homePage;

    @Step("El usuario abre la url")
    public void openUrl(){
        homePage.openUrl("https://www.alkosto.com/");
    }

    @Step("pasar el mous sobre icono de inicio de seccion")
    public void inicio(){
        homePage.hoverSobreElemento();
    }

    @Step("click iniciar sesion")
    public void clickIniciar(){
        homePage.hacerClicEnBotonInicioSesion();
    }


}
