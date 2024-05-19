package com.alkosto.steps;

import com.alkosto.Utils.Hover;
import com.alkosto.pageObject.HomePageObject;
import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeSteps extends PageObject {

    @Page
    private HomePageObject homePage;

    @Page
    private Hover hover;

    @Step("El usuario abre la url")
    public void openUrl(){
        homePage.openUrl("https://www.alkosto.com/");
    }

    @Step("pasar el mous sobre icono de inicio de seccion")
    public void inicio(){
        hover.hoverSobreElemento(homePage.getMiCuenta());
    }

    @Step("click iniciar sesion")
    public void clickIniciar(){
        homePage.hacerClicEnBotonInicioSesion();
    }

}
